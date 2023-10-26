package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        Date start = new Date(-5513000L);
        Date end = new Date(52094000L);
        Date now = new Date();
        if(compareTime(start,now,"HH:mm:ss") || compareTime(now,end,"HH:mm:ss")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    public static boolean compareTime(Date leftTime, Date rightTime, String formatter){
        SimpleDateFormat format = new SimpleDateFormat(formatter);
        String left = format.format(leftTime);
        String right = format.format(rightTime);
        if (left.compareTo(right) > 0){
            return true;
        }
        return false;
    }
}
