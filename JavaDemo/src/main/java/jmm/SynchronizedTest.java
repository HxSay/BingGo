package jmm;

public class SynchronizedTest {
    synchronized void m(){

    }

    void n(){
        synchronized (this){

        }
    }
}
