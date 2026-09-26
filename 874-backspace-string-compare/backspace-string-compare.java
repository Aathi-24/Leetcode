class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else s1.push(c);
        }
        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else s2.push(c);
        }
        if(s1.equals(s2)) return true;
        return false;
    }
}