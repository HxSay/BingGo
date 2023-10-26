package bytecode;

import java.io.Serializable;

public class T09100_ByteCode09 extends T0100_ByteCode01 implements Serializable {
    private int data;
    private static int staticData;
    private final int finalData = 0;
    private String string;
    private Object object;

    int test(){
        int ret = data+staticData;
        return ret;
    }

    static void staticTest(){

    }
}
