package classloader;

public class T001_ClassLoader {
    public static void main(String[] args) {
        System.out.println(T.count);
    }
}

class T{
    public static int count = 2;
    public static T t = new T();
    private T(){
        count++;
    }
}
