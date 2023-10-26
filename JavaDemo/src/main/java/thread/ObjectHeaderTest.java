package thread;

import org.openjdk.jol.info.ClassLayout;

public class ObjectHeaderTest {
    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(10000);
        Object object = new Object();
        System.out.println(ClassLayout.parseInstance(object).toPrintable());
        synchronized (object){
            System.out.println(ClassLayout.parseInstance(object).toPrintable());
        }
    }
}
