package exception;

import java.sql.Time;

public class TryCatchTest {
    private static Long loopTime = 1_000_000_000L;

    public static void main(String[] args) {
        System.out.println("循环外try-catch："+outLoop());
        System.out.println("循环内try-catch（无异常）："+innerLoop());
        System.out.println("循环内try-catch（有异常）："+innerThrowLoop());
    }

    public static Long outLoop(){
        int n = 0;
        Long startTime =  System.currentTimeMillis();
        try{
            for (int i = 0; i < loopTime; i++) {
                ++n;
            }
        }catch (Exception e){
        }
        Long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static Long innerThrowLoop(){
        int n = 0;
        Long startTime =  System.currentTimeMillis();
        for (int i = 0; i < loopTime; i++) {
            try {
                ++n;
                if(n == 1){
                    throw new Exception("");
                }
            }catch (Exception e){
            }
        }
        Long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static Long innerLoop(){
        int n = 0;
        Long startTime =  System.currentTimeMillis();
        for (int i = 0; i < loopTime; i++) {
            try {
                ++n;
            }catch (Exception e){
            }
        }
        Long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
}
