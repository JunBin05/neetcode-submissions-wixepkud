class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right=0, mid=0, ans=h;
        for (int i=0; i<piles.length; i++){
            if (piles[i]>right){
                right=piles[i];
            }
        }
        while (left<=right){
            int total=0;
            mid=(left+right)/2;
            for (int i=0; i<piles.length;i++){
                total+=Math.ceil((double)(piles[i])/mid);
            }
            if (total<=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
