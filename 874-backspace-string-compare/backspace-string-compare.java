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
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(!s1.isEmpty()){
            sb1.append(s1.pop());
        }
        while(!s2.isEmpty()){
            sb2.append(s2.pop());
        }
        if(sb1.reverse().toString().equals(sb2.reverse().toString())) return true;
        return false;
    }
}