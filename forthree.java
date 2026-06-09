public class forthree {
    public void rotate(int[] marix,int k){
        k%=marix.length;
        resvreverse(marix,0,marix.length-1);
        resvreverse(marix,0,k-1);
        resvreverse(marix,k,marix.length-1);
    }
    public void resvreverse(int[] marix,int start,int end){

        while(start<end){
            int temp = marix[start];
            marix[start] = marix[end];
            marix[end] = temp;
            start++;
            end--;
        }
    }
}
