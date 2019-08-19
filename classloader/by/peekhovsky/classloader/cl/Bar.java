package by.peekhovsky.classloader.cl;

public class Bar {

    public Bar(String a, String b) {
        System.out.println("Bar constructor >>> " + a + " " + b);
    }

    public void printCL() {
        System.out.println("Bar class loader: " + Bar.class.getClassLoader());
    }
}
