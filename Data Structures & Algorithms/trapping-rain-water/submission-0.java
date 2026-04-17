class Solution {
    public int trap(int[] height) {
        int area=0;
        int left=0, right=height.length-1;
        int leftTall=height[left], rightTall=height[right];
        while (left<right){
            if (height[left]<=height[right]){
                area+=(leftTall-height[left]);
                left++;
                leftTall=Math.max(height[left],leftTall);
            }else{
                area+=(rightTall-height[right]);
                right--;
                rightTall=Math.max(height[right],rightTall);
            }
        }
        return area;
    }
}
