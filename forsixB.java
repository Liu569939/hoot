import java.util.ArrayList;
import java.util.List;

public class forsixB {
    //hoot-438 找到字符串中所有字母异位词
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        int slen = s.length();
        int plen = p.length();
        if(slen<plen){
            return findlist;
        }
        int [] count = new int[26];
        for(int i=0;i<plen;i++){
            ++count[s.charAt(i)-'a'];
            --count[p.charAt(i)-'a'];
        }
        int differ = 0;
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                differ++;
            }
        }
        if(differ==0){
            res.add(0);
        }
        for(int i = 0;i<slen-plen;i++){
            if(count[s.charAt(i)-'a']==0){
                differ++;
            }else if(count[s.charAt(i)-'a']==1){
                differ--;
            }
            --count[s.charAt(i)-'a'];
           if(count[s.charAt(i+plen)-'a']==0){
               differ++;
           }if (count[s.charAt(i+plen)-'a']==-1){
               differ--;
            }
           ++count[s.charAt(i+plen)-'a'];
           if(differ==0){
               res.add(i+1);
           }
        }return res;
    }
}
