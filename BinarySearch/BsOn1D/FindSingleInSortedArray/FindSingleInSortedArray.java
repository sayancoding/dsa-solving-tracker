package BinarySearch.BsOn1D.FindSingleInSortedArray;

public class FindSingleInSortedArray {
    /*
     * intuition is which part is good position, 
     * eliminate/discard that part and find on another part  
     * 
     * index   : [0 1 2 3 4 5 6 7 8]
     * example : [1,1,3,3,6,5,5,9,9]
     * 
     * Good left ->  index of (even,odd) = equal elements
     * Good right -> index of (odd,even) = equal elements
     */
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // 3-types of edge cases are handled
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int left = 1;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            /*
             * Check left part is good or not
             * Good means -> index of (even,odd) = equal elements
             * if good ans would be present on right side so we discard left part
             * left = mid+1
             */
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                left = mid + 1;
            } 
            else {
                /*
                 * Check right part is good or not
                 * Good means -> index of (odd,even) = equal elements
                 * if good ans would be present on left side so we discard right part
                 * right = mid-1
                 */
                right = mid - 1;
            }
        }
        return -1;
    }
}
