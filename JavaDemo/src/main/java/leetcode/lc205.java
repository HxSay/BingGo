package leetcode;

import java.util.HashMap;

public class lc205 {

    public static void main(String[] args) {
        isIsomorphic("foo","bar");
    }

    public static boolean isIsomorphicV1(String s, String t) {
        HashMap<Character,Character> stMap = new HashMap<>();
        int n = s.length();
        StringBuilder stemp = new StringBuilder();
        for(int i=0;i<n;++i){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(!stMap.containsKey(sch)){
                stMap.put(sch,tch);
            }else{
                tch = stMap.get(sch);
            }
            stemp.append(tch);
        }
        stMap = new HashMap<>();
        StringBuilder ttemp = new StringBuilder();
        for(int i=0;i<n;++i){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(!stMap.containsKey(tch)){
                stMap.put(tch,sch);
            }else{
                sch = stMap.get(tch);
            }
            ttemp.append(sch);
        }
        return s.equals(ttemp.toString()) && t.equals(stemp.toString());
    }

    public static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> stMap = new HashMap<>();
        HashMap<Character,Character> tsMap = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;++i){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if((stMap.containsKey(sch) && stMap.get(sch)!=tch) || (tsMap.containsKey(tch) && tsMap.get(tch)!=sch)){
                return false;
            }
            stMap.put(sch,tch);
            tsMap.put(tch,sch);
        }
        return true;
    }

}
