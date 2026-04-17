class KthLargest {
    PriorityQueue <Integer> check;
    int k;
    public KthLargest(int k, int[] nums) {
        check=new PriorityQueue<>();
        this.k=k;
        for (int num:nums){
            check.add(num);
            if (check.size()>k){
                check.poll();
            }
        }
    }
    
    public int add(int val) {
        check.add(val);
        if (check.size()>k){
            check.poll();
        }
        return check.peek();
    }
}
