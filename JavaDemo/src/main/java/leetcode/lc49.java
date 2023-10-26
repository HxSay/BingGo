package leetcode;

import java.util.*;

public class lc49 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("eat");
        list.add("tea");
        list.add("tan");
        list.add("ate");
        list.add("nat");
        list.add("bat");
        groupAnagrams(list);
    }
    /**
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static List<List<String>> groupAnagrams(List<String> strs) {
        TreeMap<String,List<String>> hashMap = new TreeMap<>();
        for(String s:strs){
            String sorted = sort(s);
            if(hashMap.containsKey(sorted)){
                List<String> list = hashMap.get(sorted);
                list.add(s);
                hashMap.replace(sorted,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                hashMap.put(sorted,list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> item:hashMap.entrySet()){
            ans.add(item.getValue());
        }
        ans.sort(Comparator.comparingInt(List::size));
        return ans;
    }

    static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
