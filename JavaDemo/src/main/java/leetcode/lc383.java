package leetcode;

import java.util.HashMap;
import java.util.Map;

public class lc383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> rHash = new HashMap<>();
        HashMap<Character,Integer> mHash = new HashMap<>();
        for(int i=0;i<ransomNote.length();++i){
            char ch = ransomNote.charAt(i);
            if(!rHash.containsKey(ch)){
                rHash.put(ch,1);
            }else{
                rHash.replace(ch,rHash.get(ch)+1);
            }
        }

        for(int i=0;i<magazine.length();++i){
            char ch = magazine.charAt(i);
            if(!mHash.containsKey(ch)){
                mHash.put(ch,1);
            }else{
                mHash.replace(ch,rHash.get(ch)+1);
            }
        }

        for(Map.Entry<Character,Integer> item: rHash.entrySet()){
            Character key = item.getKey();
            Integer val = item.getValue();
            if(mHash.get(key)!=null || mHash.get(key) < val) return false;
        }
        return true;
    }
}
