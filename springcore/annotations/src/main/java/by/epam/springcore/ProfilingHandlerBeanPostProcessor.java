package by.epam.springcore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ProfilingHandlerBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> map = new HashMap<>();
    private ProfilingController controller = new ProfilingController();

    public ProfilingHandlerBeanPostProcessor() throws MalformedObjectNameException,
            NotCompliantMBeanException, InstanceAlreadyExistsException,
            MBeanRegistrationException {
        var mbeanServer = ManagementFactory.getPlatformMBeanServer();
        mbeanServer.registerMBean(controller, new ObjectName("profiling", "name", "controller"));
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(Profiling.class)) {
            map.put(beanName, beanClass);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        var beanClass = map.get(beanName);
        if (beanClass != null) {
            return Proxy.newProxyInstance(
                    beanClass.getClassLoader(),
                    beanClass.getInterfaces(),
                    (proxy, method, args) -> {
                        if (controller.isEnabled()) {
                            log.debug("Do profiling... ");
                            long before = System.nanoTime();
                            Object returnVal = method.invoke(bean, args);
                            long after = System.nanoTime();
                            log.info("Time: " + (after - before));
                            log.debug("end.");
                            return returnVal;
                        } else {
                            return method.invoke(bean, args);
                        }
                    });
        }
        return bean;
    }
}
