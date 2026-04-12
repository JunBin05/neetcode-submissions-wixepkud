class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = (nums1.length+nums2.length+1)/2;
        int[] toFind;
        int[] second;
        if(nums1.length<nums2.length){
            toFind=nums1;
            second=nums2;
        }else{
            toFind=nums2;
            second=nums1;
        }
        int left=0, right=toFind.length, mid=0;
        while (left<=right){
            mid=(left+right)/2;
            int cut = n-mid;
            int leftMax2, leftMax1;
            if (cut<=0){
                leftMax2=Integer.MIN_VALUE;
            }else{
                leftMax2 = second[cut-1];
            }
            if (mid<=0){
                leftMax1=Integer.MIN_VALUE;
            }else{
                leftMax1=toFind[mid-1];
            }
            int rightMin1, rightMin2;
            if (mid==toFind.length){
                rightMin1=Integer.MAX_VALUE;
            }else{
                rightMin1 = toFind[mid];
            }
            if (cut==second.length){
                rightMin2=Integer.MAX_VALUE;
            }else{
                rightMin2 = second[cut];
            }
            if (leftMax1<=rightMin2 && leftMax2<=rightMin1){
                if ((nums1.length+nums2.length)%2==0){
                    return ((double)(Math.max(leftMax1,leftMax2)+Math.min(rightMin1,rightMin2))/2);
                }else{
                    return (double)Math.max(leftMax1,leftMax2);
                }
            }else if (leftMax1>rightMin2){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
