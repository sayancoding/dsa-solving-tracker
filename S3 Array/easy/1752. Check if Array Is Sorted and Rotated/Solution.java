class Solution {
    public boolean check(int[] nums) {
        boolean hasOneBreak = false;

        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] <= nums[i]){
                continue;
            }
            else{
                if(hasOneBreak) return false;
                hasOneBreak = true;
            }
        }
        if(hasOneBreak && nums.length > 2){
            /* rotation check if has one break sequence */
            if(nums[0] >= nums[nums.length-1]) return true; 
            else return false;
        }
        return true;
    }
}