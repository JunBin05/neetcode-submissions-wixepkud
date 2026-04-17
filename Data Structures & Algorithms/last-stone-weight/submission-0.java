class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> check = new PriorityQueue<>((n1,n2)->n2-n1);
        for (int num: stones){
            check.add(num);
        }
        while(check.size()>1){
            int first=check.poll();
            int second=check.poll();
            int diff =Math.abs(first-second);
            if (diff!=0){
                check.add(diff);
            }
        }
        if (check.size()==1){
            return check.peek();
        }else{
            return 0;
        }
    }
}
