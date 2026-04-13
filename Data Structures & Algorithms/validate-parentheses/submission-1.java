class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        HashMap <Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        for (int i=0; i<s.length();i++){
            char op = s.charAt(i);
            if (!map.containsKey(op)){
                stack.push(op);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                if (map.get(op)==stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }
}
