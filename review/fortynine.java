package review;

public class fortynine {
    //hoot 49 字母异位词分组
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String index = new String(c);
            map.computeIfAbsent(index,k ->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
