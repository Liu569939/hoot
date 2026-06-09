public class sixF {
    //hoot 4 寻找两个正序数组的中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        return len%2 == 1? getKth(nums1,nums2,len/2+1):(getKth(nums1,nums2,len/2)+getKth(nums1,nums2,len/2+1))/2.0;
    }
    private int getKth(int[] nums1,int [] nums2,int k){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int start1 =0,start2 =0;
        while(true){
            if(start1 == len1) {return nums2[start2+k-1];}
            if(start2 == len2) {return nums1[start1+k-1];}
            if(k == 1){return Math.min(nums1[start1],nums2[start2]);}
            int i = Math.min(start1+k/2,len1)-1;
            int j = Math.min(start2+k/2,len2)-1;
            if(nums1[i]<=nums2[j]){
                k -= (i-start1+1);
                start1 =i+1;

            }else{
                k -= (j-start2+1);
                start2 = j+1;

            }
        }

    }
}
//本题核心 : 寻找两个正序数组的中位数，利用二分查找，找到两个数组中第k小的数，k为数组长度的1/2+1，
//难点在于更新nums1和nums2的索引，以及判断k的取值。
