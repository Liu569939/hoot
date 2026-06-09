import java.util.HashMap;

public class sixN {
    //hoot 76 最小覆盖子串
    public String minWindow(String s, String t) {
        int tlen = t.length();
        int slen = s.length();
        if (tlen > slen || tlen == 0) return "";
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();
        for (char c : t.toCharArray()) {
            int j = tmap.getOrDefault(c, 0) + 1;
            tmap.put(c, j);
        }
        int count = 0, l = 0, len = slen + 1, start = 0;

        for (int r = 0; r < slen; r++) {
            char c = s.charAt(r);
            if (tmap.containsKey(c)) {
                int temp = smap.getOrDefault(c, 0) + 1;
                smap.put(c, temp);
                if (temp == tmap.get(c)) count++;
            }
            while (count == tmap.size()) {
                if (len > r - l + 1) {
                    len = r - l + 1;
                    start = l;
                }
                char d = s.charAt(l++);
                if (tmap.containsKey(d)) {
                    int temp = smap.get(d);
                    if (temp == tmap.get(d)) count--;
                    smap.put(d, --temp);

                }
            }
        }
        return len == slen + 1 ? "" : s.substring(start, start + len);
    }
}
//本题核心 : 与hoot 438 找到字符串中所有字母异位词类似
//滑动窗口，窗口大小为t的长度，窗口的左右边界为l和r，窗口内有效元素个数count，窗口内有效元素个数等于t中长度时，计算窗口长度，以及更新起始指针
//有效元素指的是 窗口中指定元素的个数等于t中指定元素个数
//同时需要注意分辨无子串的情况
