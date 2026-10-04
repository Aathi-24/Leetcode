class Solution {
    public boolean checkValidString(String s) {
        int a = 0;
        int b = 0;
        for(char c : s.toCharArray()){
            if(c =='('){
                a++;
                b++;
            }
            else if(c == ')'){
                a--;
                b--;
            }
            else{
                a++;
                b--;
            }
            if(b < 0) b = 0;
            if(a < 0) return false;
        }
        return b == 0;
    }
}