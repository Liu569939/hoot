package test;

import java.util.*;

public class hootforN {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for(String s :strs){
                char [] chars = s.toCharArray();
                Arrays.sort(chars);
                String s1 = new String(chars);
                if(map.containsKey(s1)){
                    map.get(s1).add(s);
                }else{
                    List<String> list = new ArrayList<>();
                    list.add(s);
                    map.put(s1,list);
                }
            }
            return new ArrayList<>(map.values());
        }}
}
//hoot 49 字母异位词分组
//值得注意的点是map的key是排序后的字符串
//以及返回时注意是 new ArrayList<>(map.values());而不是 new List<List<String>>()
