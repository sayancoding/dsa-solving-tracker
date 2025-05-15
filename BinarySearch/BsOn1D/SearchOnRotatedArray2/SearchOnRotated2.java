package BinarySearch.BsOn1D.SearchOnRotatedArray2;

public class SearchOnRotated2 {
    /*
     * Here array is sorted but rotated but present duplicate elements
     * So if we first consider mid, 
     * then one half always would be sorted and another half would be unsorted
     * 
     * so first considering from sorted half then think target will be present on that space or not
     * if yes then proceed , else discard this part and choose another half
     * 
     * Extra check for skipping redundancy 
     * when arr[left] == arr[mid] == arr[right] , need to skip the steps
     * example array = [1,0,1,1,1] and target = 0
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;

            // extra check here
            if(nums[left] == nums[mid] && nums[left] == nums[right]){
                left = left+1;
                right = right-1;
                continue;
            }

            // left sort
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;  // consider left
                } else {
                    left = mid + 1; //or discard left and consider right back
                }
            }
            // right sorted
            else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1; //consider right
                } else {
                    right = mid - 1; //or discard right and consider left
                }
            }
        }
        return -1;
    }
}
