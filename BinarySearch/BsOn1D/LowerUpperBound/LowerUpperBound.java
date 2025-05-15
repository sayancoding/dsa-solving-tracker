package BinarySearch.BsOn1D.LowerUpperBound;

public class LowerUpperBound {
    /*
     * Lower bound -> greater than or equal to target
     * Upper bound -> only greater that target
     */
    public static void lower_bound(int[] arr,int x){
        int left = 0;
        int ans = -1;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left+right)/2;
            /* if find then try to find left side 
             *
             * as its sorted array if find on hypo indx that meet criteria
             * then again search on left side if any other have or not 
             * reason may be more greater or equal elements can have that 
             * lesser that hypo indx element
             */
            if(arr[mid] >= x){
                ans = mid;
                right = mid-1;
            }else{
                left = mid +1;
            }
        }
        System.err.println("lower : "+ans);
    }
    public static void upper_bound(int[] arr,int x){
        int left = 0;
        int ans = -1;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left+right)/2;
            //if find then try to find left side 
            if(arr[mid] > x){ 
                ans = mid;
                right = mid-1;
            }else{
                left = mid +1;
            }
        }
        System.err.println("upper : "+ans);
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 12, 18, 20};
        int x = 20;
        lower_bound(arr, x);
        upper_bound(arr, x);
    }
}
