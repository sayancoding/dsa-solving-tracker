package BinarySearch.BsOn1D.FindMinInRotatedArray;

public class FindMinInRotated {
    /*
     * first take min from sorted half 
     * then discard and find on unsorted half if any element lesser than that
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];

        while(left <= right){
            int mid = (left+right)/2;
            //left sort
            if(nums[left] <= nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1; // discard left part
            }else{
                //if right sort
                min = Math.min(min,nums[mid]);
                right = mid-1; // discard right part
            }
        }
        return min;
    }
}
