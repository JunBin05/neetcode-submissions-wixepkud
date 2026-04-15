class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++){
            int right = numbers.length-1;
            while ((numbers[i]+numbers[right])>=target){
                if ((numbers[i]+numbers[right])==target){
                    return (new int [] {i+1,right+1});
                }else{
                    right--;
                }
            }
        }
        return new int [] {1,2};
    }
}
