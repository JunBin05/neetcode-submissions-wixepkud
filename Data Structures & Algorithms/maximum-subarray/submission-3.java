class Solution {
    public int maxSubArray(int[] nums) {
        int total=nums[0];
        int max=nums[0];
        for (int i=1; i<nums.length;i++){
            total=Math.max(nums[i],total+nums[i]);
            max=Math.max(max,total);
        }
        return max;
    }
}
