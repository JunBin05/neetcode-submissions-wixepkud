class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> op=new HashMap<>();
        for (char task: tasks){
            op.put(task,op.getOrDefault(task,0)+1);
        }
        PriorityQueue <Integer> ready = new PriorityQueue<>((n1,n2)->n2-n1);
        for (int task:op.values()){
            ready.add(task);
        }
        Queue <int[]> cooldown = new LinkedList<>();
        int time=0;
        while (!ready.isEmpty() || !cooldown.isEmpty()){
            time++;
            if (!ready.isEmpty()){
                int current=ready.poll();
                current--;
                if (current>0){
                    cooldown.add(new int[]{current,n+time});
                }
            }
            if(!cooldown.isEmpty() && cooldown.peek()[1]==time){
                ready.add(cooldown.poll()[0]);
            }
        }
        return time;
    }
}