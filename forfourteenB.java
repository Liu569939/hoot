public class forfourteenB {
//hoot - 70 爬楼梯
        public int climbStairs(int n) {
            int p =0,q =0,t =1;
            for(int i =0 ;i<n;i++){
                p = q;
                q= t;
                t =p+q;
            }
            return t;
        }

}
