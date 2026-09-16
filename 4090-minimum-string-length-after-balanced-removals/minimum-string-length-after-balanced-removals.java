class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && ((stk.peek() == 'a' && c == 'b') || (stk.peek() == 'b' && c == 'a'))){
                stk.pop();
            }
            else stk.push(c);
        }
        return stk.size();
    }
}