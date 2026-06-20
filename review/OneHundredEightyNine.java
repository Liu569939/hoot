package review;

public class OneHundredEightyNine {
    // hoot 189 轮转数组
    public void rotate(int[] marix,int k){
        k %= marix.length;
        reverse(marix,0,marix.length-1);
        reverse(marix,0,k-1);
        reverse(marix,k,marix.length-1);
    }

    public void reverse(int[] marix,int left,int right){
        while(left<right){
            int temp = marix[left];
            marix[left] = marix[right];
            marix[right] = temp;
            left++;
            right--;
        }

    }
}
