class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyVal = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        keyVal.put(')','(');
        keyVal.put('}','{');
        keyVal.put(']','[');
        for(Character c: s.toCharArray()){
            if(keyVal.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==keyVal.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
