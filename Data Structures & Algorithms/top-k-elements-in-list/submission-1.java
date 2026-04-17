class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> check = new HashMap<>();
        int[]ans=new int[k];
        for (int num:nums){
            check.put(num,check.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>sorts = new PriorityQueue<>((n1,n2)->check.get(n1)-check.get(n2));
        for (int num:check.keySet()){
            sorts.add(num);
            if (sorts.size()>k){
                sorts.poll();
            }
        }
        for (int i=0;i<k;i++){
            ans[i]=sorts.poll();
        }
        return ans;
    }
}
