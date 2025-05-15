package BinarySearch.BsOn1D.FloorCeil;

class Solution {
    /*
     * The floor of x is the largest element in the array which is smaller than or
     * equal to x.
     * The ceiling of x is the smallest element in the array greater than or equal
     * to x.
     * If no floor or ceil exists, output -1.
     */
    public static void findFloor(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int floor = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= x) {
                floor = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(floor);
    }

    public static void findCeil(int[] nums, int x) {
        int left = 0;
        int right = nums.length - 1;
        int ceil = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= x) {
                ceil = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ceil);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 4, 7, 8, 10 };
        int target = 5;
        findFloor(nums, target);
        findCeil(nums, target);
    }
}