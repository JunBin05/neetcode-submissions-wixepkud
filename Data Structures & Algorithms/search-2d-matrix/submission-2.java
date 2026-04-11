class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left1=0, right1=matrix.length-1, mid=(left1+right1)/2;
        while (left1<=right1){
            if (matrix[mid][0]==target){
                return true;
            }else if (matrix[mid][0]>target){
                right1=mid-1;
            }else{
                left1=mid+1;
            }
            mid = (left1+right1)/2;
        }
        int left2=0, right2=matrix[mid].length-1, mid2=0;
        while (left2<=right2){
            mid2 = (left2+right2)/2;
            if (matrix[mid][mid2]==target){
                return true;
            }else if (matrix[mid][mid2]>target){
                right2=mid2-1;
            }else{
                left2=mid2+1;
            }
        }
        return false;
    }
}
