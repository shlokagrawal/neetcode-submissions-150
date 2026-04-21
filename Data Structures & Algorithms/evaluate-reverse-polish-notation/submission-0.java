class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand1 = 0;
        int operand2 = 0;
        int answer = 0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                operand1 = stack.pop();
                operand2 = stack.pop();
                answer = operand2 + operand1;
                stack.push(answer);
            }else if(tokens[i].equals("-")){
                operand1 = stack.pop();
                operand2 = stack.pop();
                answer = operand2 - operand1;
                stack.push(answer);
            }else if(tokens[i].equals("*")){
                operand1 = stack.pop();
                operand2 = stack.pop();
                answer = operand2 * operand1;
                stack.push(answer);
            }else if(tokens[i].equals("/")){
                operand1 = stack.pop();
                operand2 = stack.pop();
                answer = operand2 / operand1;
                stack.push(answer);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
