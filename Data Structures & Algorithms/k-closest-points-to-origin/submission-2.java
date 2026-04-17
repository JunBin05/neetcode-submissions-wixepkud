class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> check = new PriorityQueue<>((n1,n2)->Integer.compare(n2[0]*n2[0]+n2[1]*n2[1],n1[0]*n1[0]+n1[1]*n1[1]));
        int [][] ans =new int [k][2];
        for (int[] num:points){
            check.add(num);
            if (check.size()>k){
                check.poll();
            }
        }
        for (int i=0; i<k;i++){
            ans[i]=check.poll();
        }
        return ans;
    }
}
