public class forfourteenC {
    //hoot - 763 划分字母区间
        public List<Integer> partitionLabels(String s) {
            char [] chars =s.toCharArray();
            int n =chars.length;
            int [] last =new int [26];
            for(int i=0;i<n;i++){
                last[chars[i]-'a'] = i;
            }
            int len =0;
            int star=-1;
            List<Integer> list =new ArrayList<Integer>();
            for(int i =0;i<n;i++){
                if(len<last[chars[i]-'a']){
                    len = last[chars[i]-'a'];
                }
                if(i==len){
                    list.add(i-star);
                    star =i;
                }
            }
            return list;
        }

}
