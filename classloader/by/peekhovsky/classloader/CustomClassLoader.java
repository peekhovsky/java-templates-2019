package by.peekhovsky.classloader;


import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Rastsislau Piakhouski 2019
 */
public class CustomClassLoader extends ClassLoader {

    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }

    private Class getClass(String name) {
        String file = name.replace('.', File.separatorChar) + ".class";
        byte[] b;
        try {
            b = loadClassFileData(file);
            Class c = defineClass(name, b, 0, b.length);
            resolveClass(c);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loading class ===> " + name);
        if (name.startsWith("by.peekhovsky")) {
            System.out.println("Loading class into CustomClass loader");
            return getClass(name);
        } else {
            return super.loadClass(name);
        }
    }

    /**
     * @param name file name
     * @return byte array of .class file
     * @throws IOException exception thrown while reading a file
     */
    private byte[] loadClassFileData(String name) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
        int size = stream.available();
        byte[] buff = new byte[size];
        DataInputStream dataInputStream = new DataInputStream(stream);
        dataInputStream.readFully(buff);
        dataInputStream.close();
        return buff;
    }
}
