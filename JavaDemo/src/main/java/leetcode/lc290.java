package leetcode;

import java.util.HashMap;

public class lc290 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> spMap = new HashMap<>();
        HashMap<Character,String> psMap = new HashMap<>();
        String[] sArr = s.split(" ");
        int n = sArr.length;
        for(int i=0;i<n;++i){
            char pch = pattern.charAt(i);
            String sstr = sArr[i];
            if((psMap.containsKey(pch) && !psMap.get(pch).equals(sstr)) ||
                    (spMap.containsKey(sstr) && spMap.get(sstr)!=pch)
            ){
                return false;
            }
            spMap.put(sstr,pch);
            psMap.put(pch,sstr);
        }
        return true;
    }
}
