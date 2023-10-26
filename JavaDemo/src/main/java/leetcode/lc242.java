package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class lc242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            if(sMap.containsKey(ch)){
                sMap.replace(ch,sMap.get(ch)+1);
            }else{
                sMap.put(ch,1);
            }
            char ch2 = t.charAt(i);

            if(tMap.containsKey(ch2)){
                tMap.replace(ch,tMap.get(ch)+1);
            }else{
                tMap.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> item:tMap.entrySet()){
            Character key = item.getKey();
            Integer val = item.getValue();
            if(!Objects.equals(sMap.get(key), val)){
                return false;
            }
        }
        return true;
    }
}
