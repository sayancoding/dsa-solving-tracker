package BinarySearch.BsOn1D.FindFirstNLastOccur;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[] {first,last};
    }
    public static int findFirst(int[] arr, int x){
        int left = 0;
        int ans = -1;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] >= x){
                if(arr[mid] == x) ans = mid;
                right = mid-1;
            }else{
                left = mid +1;
            }
        }
        return ans;
    }
    public static int findLast(int[] arr, int x){
        int left = 0;
        int ans = -1;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] <= x){
                if(arr[mid] == x) ans = mid;
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}
