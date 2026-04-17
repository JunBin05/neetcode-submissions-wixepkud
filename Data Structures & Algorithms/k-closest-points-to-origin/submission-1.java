class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<Integer,Double> co = new HashMap<>();
        PriorityQueue<Integer> check = new PriorityQueue<>((n1,n2)->Double.compare(co.get(n2),co.get(n1)));
        int [][] ans =new int [k][2];
        for (int i=0; i<points.length;i++){
            int diffx = 0-points[i][0];
            int diffy = 0-points[i][1];
            double distance = Math.sqrt((diffx*diffx)+(diffy*diffy));
            co.put(i,distance);
            check.add(i);
            if (check.size()>k){
                check.poll();
            }
        }
        for (int i=0; i<k;i++){
            ans[i]=points[check.poll()];
        }
        return ans;
    }
}
