class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> check = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int need = target-nums[i];
            if (!check.isEmpty() && check.containsKey(need)){
                return (new int[]{Math.min(i,check.get(need)),Math.max(i,check.get(need))});
            }
            check.put(nums[i],i);
        }
        return new int[]{0,1};
    }
}
