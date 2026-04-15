class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map <Integer, Double> moves = new TreeMap<>(Collections.reverseOrder());
        Deque <Double> stack = new ArrayDeque<>();
        for (int i=0; i<position.length; i++){
            moves.put(position[i],(double)(target-position[i])/speed[i]);
        }
        for (double move: moves.values() ){
            if (stack.isEmpty() || move>stack.peek()){
                stack.push(move);
            }
        }
        return stack.size();
    }
}
