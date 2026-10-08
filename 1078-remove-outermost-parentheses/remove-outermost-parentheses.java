class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') count++;
            else if(c == ')') count--;
            if(count > 1 && c == '(') sb.append(c);
            else if(count != 0 && c == ')') sb.append(c);
        }
        return sb.toString();
    }
}