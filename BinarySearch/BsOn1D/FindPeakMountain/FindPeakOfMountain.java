package BinarySearch.BsOn1D.FindPeakMountain;

public class FindPeakOfMountain {
    /*
     * peak will i, if arr[i+1] < arr[i] > arr[i+1]
     * If(arr[mid-1] < arr[mid] < arr[mid+1]) that means its lie on left side / incline side
     * so need ti discard incline side and look at right side 
     * so left = mid+1
     * 
     * otherwise it present on decline/ right side or might be at reversal-peak 
     * so discard it and look on other side (left)
     * 
     * incline -> arr[mid-1] < arr[mid] < arr[mid+1]
     * decline -> arr[mid-1] > arr[mid] > arr[mid+1]
     * reversal-peak -> arr[mid-1] > arr[mid] < arr[mid+1]
     * ans(peak) -> arr[mid-1] < arr[mid] > arr[mid+1]
     */

    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n-1;
        /* edge-case handled */
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        while(left <= right){
            int mid = (left+right)/2;
            //exact answer(peak)
            if((arr[mid-1] < arr[mid]) && (arr[mid] > arr[mid+1])){
                return mid;
            }
            //incline
            else if((arr[mid-1] < arr[mid]) && (arr[mid] < arr[mid+1])){
                left = mid +1;
            }
            // decline or reversal-peak 
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}