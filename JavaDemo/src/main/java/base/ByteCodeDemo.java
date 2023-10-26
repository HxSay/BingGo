package base;
public class ByteCodeDemo {
    public int val = 1;
    public static int sVal = 1;
    public static void main(String[] args) {
        ByteCodeDemo codeDemo = new ByteCodeDemo();
        int a = 0;
        int b = 0;
        int c = codeDemo.add(a,b);
        System.out.println(c);
    }

    public int add(int a,int b) {
        return a+b;
    }
}
