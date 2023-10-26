package classloader;

public class T005_LoadClassByHand {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = T001_ClassLoader.class.getClassLoader().loadClass("classloader.T002_ClassLoaderLevel");
        System.out.println(clazz.getName());
    }
}
