package by.peekhovsky.classloader;

import java.lang.reflect.Method;


/**
 * 1) compile all classes
 * 2) java com.peekhovsky.classloader.CustomClassLoaderRunner com.peekhovsky.classloader.cl.Foo 1324 3434
 *
 * @author Rastsislau Piakhouski 2019
 */
public class CustomClassLoaderRunner {

    public static void main(String[] args) throws Exception {
        String progClass = args[0];
        String[] progArgs = new String[args.length - 1];

        System.arraycopy(args, 1, progArgs, 0, progArgs.length);
        CustomClassLoader customClassLoader = new CustomClassLoader(CustomClassLoader.class.getClassLoader());
        Class newClass = customClassLoader.loadClass(progClass);

        Class[] mainArgType = { (String[].class) };
        Method main = newClass.getMethod("main", mainArgType);
        Object[] argsArray = { progArgs };
        main.invoke(null, argsArray);

        Method printCL = newClass.getMethod("printCL", null);
        printCL.invoke(null);
    }
}
