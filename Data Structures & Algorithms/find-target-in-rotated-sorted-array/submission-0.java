class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length-1;
        int left=0, right=n, mid=0, sep=0;
        while (left<right){
            mid=(left+right)/2;
            if (nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        sep=left;
        left=0;
        right=n;
        if (nums[n]<target){
            right=sep-1;
        }else if (nums[n]>target){
            left=sep;
        }else{
            return n;
        }
        while (left<=right){
            mid=(left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
