class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*') stk.pop();
            else stk.push(c);
        }
        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty()){
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
}