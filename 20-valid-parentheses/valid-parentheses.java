class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') stk.push(c);
            else if(c == ')'){
                if(!stk.isEmpty() && stk.peek() == '(') stk.pop();
                else return false;
            }
            else if(c == '[') stk.push(c);
            else if(c == ']'){
                if(!stk.isEmpty() && stk.peek() == '[') stk.pop();
                else return false;
            }
            else if(c == '{') stk.push(c);
            else{
                if(!stk.isEmpty() && stk.peek() == '{') stk.pop();
                else return false;
            }
        }
        return stk.isEmpty();
    }
}