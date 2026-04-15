class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int [] result = new int [temperatures.length];
        for (int i=1; i<temperatures.length; i++){
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp>temperatures[stack.peek()]){
                result[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
