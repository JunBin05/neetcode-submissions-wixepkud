class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque <int[]> stack = new ArrayDeque<>();
        int maxArea=0;
        int canIndex=0;
        
        for (int i=0; i<heights.length; i++){      
            canIndex=i;    
            while ((!stack.isEmpty()) && heights[i]<stack.peek()[1]){
                    canIndex=stack.peek()[0];
                    maxArea=Math.max(maxArea, (i-canIndex)*stack.peek()[1]);
                    stack.pop();
            }
            stack.push(new int[] {canIndex, heights[i]});
        }
        while (!stack.isEmpty()){
            maxArea=Math.max(maxArea, (heights.length-stack.peek()[0])*stack.peek()[1]);
            stack.pop();
        }
        return maxArea;
    }
}
