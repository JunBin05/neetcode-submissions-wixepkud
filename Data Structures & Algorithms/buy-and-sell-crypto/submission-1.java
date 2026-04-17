class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=prices.length-1;
        int max=0;
        int min = Integer.MAX_VALUE;
        while(left<right){
            min=Math.min(min,prices[left]);
            max=Math.max(max,prices[right]);
            int leftd = prices[left]-prices[left+1];
            int rightd = prices[right-1]-prices[right];
            if (leftd>=rightd){
                left++;
            }else{
                right--;
            }
        }
        if ((max-min)>0){
            return max-min;
        }else{
            return 0;
        }
    }
}
