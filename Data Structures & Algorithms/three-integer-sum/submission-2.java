class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++){
            if ((i>=1) && (nums[i]==nums[i-1])){
                continue;
            }
            int left =i+1;
            int right=nums.length-1;
            int want = 0-nums[i];
            while (left<right){
                int sum = nums[left]+nums[right];
                if (sum==want){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    while ((left<right) && (nums[left]==nums[left+1])){
                        left++;
                    }
                    while ((left<right) && (nums[right]==nums[right-1])){
                        right--;
                    }
                    left++;
                    right--;
                }else if (sum<want){
                    left++;
                }else if (sum>want){
                    right--;
                }
            }
        }
        return ans;
    }
}