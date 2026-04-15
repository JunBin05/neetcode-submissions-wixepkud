class Solution {
    public int evalRPN(String[] tokens) {
        int temp1=Integer.parseInt(tokens[0]);
        int temp2=0;
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(tokens[0]));
        
        if (tokens.length>1){
            stack.push(Integer.parseInt(tokens[1]));
        }
        
        for (int i=2; i<tokens.length; i++){
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                temp2=stack.pop();
                temp1=stack.pop();
                if (tokens[i].equals("+")){
                    temp1+=temp2;
                    stack.push(temp1);
                }else if (tokens[i].equals("-")){
                    temp1-=temp2;
                    stack.push(temp1);
                }else if (tokens[i].equals("*")){
                    temp1*=temp2;
                    stack.push(temp1);
                }else if (tokens[i].equals("/")){
                    temp1/=temp2;
                    stack.push(temp1);
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return temp1;
    }
}
