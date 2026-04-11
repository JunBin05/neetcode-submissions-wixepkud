class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n = matrix[0].length,ans=0;
        int left1=0, right1=m*n-1, mid=0;
        while (left1<=right1){
            mid=(left1+right1)/2;
            ans= matrix[mid/n][mid%n];
            if (ans==target){
                return true;
            }else if (ans<target){
                left1=mid+1;
            }else{
                right1=mid-1;
            }
        }
        return false;
    }
}
