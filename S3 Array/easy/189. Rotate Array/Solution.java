class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        /* this solution is using extra memory */
        /*-------------------------------------------------- */
        // int[] result = new int[nums.length];
        
        // int mid = nums.length - k;
        // int idx = 0;
        // for(int i = mid; i < nums.length; i++){
        //     result[idx++] = nums[i];
        // }
        // for(int i = 0; i < mid; i++){
        //     result[idx++] = nums[i];
        // }

        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = result[i];
        // }
        /*-------------------------------------------------- */
        /* this solution overriding original array
         * step 1 : reverse original array
         * step 2 : reverse again two part of array separately 
         */
        int left = 0;
        int right = nums.length - 1;
        /* reverse whole array */
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        int p1 = 0;
        int p2 = k-1;
        int p3 = k;
        int p4 = nums.length - 1;
        /* reverse 1st part [0..k-1] */
        while(p1 < p2){
            int temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;

            p1++;
            p2--;
        }
        /* reverse 2nd part [k..n] */
        while(p3 < p4){
            int temp = nums[p3];
            nums[p3] = nums[p4];
            nums[p4] = temp;

            p3++;
            p4--;
        }
    }
}