public class forfourteen {
//hoot - 118 杨辉三角
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> listmap = new ArrayList<List<Integer>>();
            for(int i=0;i<numRows;++i){
                List<Integer> intlist = new ArrayList<Integer>();

                for(int j=0;j<=i;++j){
                    if(j==0||j==i){
                        intlist.add(1);
                    }else{
                        intlist.add(listmap.get(i-1).get(j-1) + listmap.get(i-1).get(j));}
                }listmap.add(intlist);
            }return listmap;
        }

}
