package leetcode;

public class lc12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    public static String intToRoman(int num) {
        int[] splited = splitNum(num);
        return getRomanStr(splited[3], "", "", "M") +
                getRomanStr(splited[2], "D", "M", "C") +
                getRomanStr(splited[1], "L", "C", "X") +
                getRomanStr(splited[0], "V", "X", "I");
    }

    public static String getRomanStr(int num, String low,String up,String unit){
        if(num == 0) return "";
        StringBuilder ret = new StringBuilder();
        if(num == 4){
            ret.append(unit).append(low);
        }else if(num > 4  && num < 9){
            ret.append(low);
            for(int i=5;i<num;++i){
              ret.append(unit);
            }
        } else if(num == 9){
            ret.append(unit).append(up);
        }else {
            for(int i=0;i<num;++i){
                ret.append(unit);
            }
        }
        return ret.toString();
    }

    public static int[] splitNum(int num){
        int[] ans = new int[]{0,0,0,0};
        int i = 0;
        while(num > 0){
            int div = num%10;
            num/=10;
            ans[i++] = div;
        }
        return ans;
    }
}
