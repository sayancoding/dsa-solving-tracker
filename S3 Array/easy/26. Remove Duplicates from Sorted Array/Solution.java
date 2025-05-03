class Solution {
    public int removeDuplicates(int[] nums) {
        //edge case handle
        if(nums.length < 2) return nums.length;

        int len = nums.length;
        int i = 0;
        int j = 1;
        int k = 0;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                /*
                 * If have distinct element then
                 * updating that elem to left side of array
                 */
                nums[++k] = nums[j];
                /* updating two pointer */
                i = j; 
                j++;
            }else{
                /* if found duplicate then decrease total length count */
                len--;
                j++;
            }
        }
        return len;
    }
}