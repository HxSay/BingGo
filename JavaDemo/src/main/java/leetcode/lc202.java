package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int sum = splitSum(n);
        while(sum!=1){
            sum = splitSum(sum);
            if(sum<10 && sum!=1) return false;
        }
        return true;
    }


    static int splitSum(int n){
        List<Integer> arr = new ArrayList<>();
        while(n != 0){
            arr.add(n%10);
            n /=10;
        }
        int sum = 0;
        for(int i=0;i<arr.size();++i){
            sum+=arr.get(i)*arr.get(i);
        }
        return sum;
    }
}
