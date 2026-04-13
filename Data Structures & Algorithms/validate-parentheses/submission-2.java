class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        for (char alpha:s.toCharArray()){
            if (alpha=='('){
                stack.push(')');
            }else if (alpha=='{'){
                stack.push('}');
            }else if (alpha=='['){
                stack.push(']');
            }else if (stack.isEmpty() || (stack.peek()!=alpha)){
                return false;
            }else{
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }
}
