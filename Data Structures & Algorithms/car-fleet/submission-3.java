class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map <Integer, Double> moves = new TreeMap<>(Collections.reverseOrder());
        double max=Double.MIN_VALUE;
        int fleet=0;
        for (int i=0; i<position.length; i++){
            moves.put(position[i],(double)(target-position[i])/speed[i]);
        }
        for (double move: moves.values() ){
            if (move>max){
                max=move;
                fleet++;
            }
        }
        return fleet;
    }
}
