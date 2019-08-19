package by.peekhovsky.classloader;

import com.sun.javafx.binding.Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger log = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        // application class loader
        log.debug("Class loader: {}", Logger.class.getClassLoader());

        // extension class loader
        log.debug("Class loader: {}", Logging.class.getClassLoader());

        // bootstrap class loader - parent of all the others class loaders
        // java.lang.ClassLoader
        log.debug("Class loader: {}",  Integer.class.getClassLoader());

        log.debug(System.getProperty("file.separator"));
    }
}
