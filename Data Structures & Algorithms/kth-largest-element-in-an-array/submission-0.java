class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> check = new PriorityQueue<>();
        for (int num:nums){
            check.add(num);
            if (check.size()>k){
                check.poll();
            }
        }
        return check.peek();
    }
}
