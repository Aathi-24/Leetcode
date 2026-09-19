class Solution {
    public boolean strongPasswordCheckerII(String pass) {
        boolean[] isvalid = new boolean[6];
        if(pass.length() >= 8) isvalid[0] = true;
        isvalid[5] = true;
        for(int i = 0; i < pass.length(); i++){
            char c = pass.charAt(i);
            if(Character.isLowerCase(c)) isvalid[1] = true;
            else if(Character.isUpperCase(c)) isvalid[2] = true;
            else if(Character.isDigit(c)) isvalid[3] = true;
            else isvalid[4] = true;
            if(i > 0){
                char prev = pass.charAt(i - 1);
                if(prev == c) isvalid[5] = false;
            }
        }
        for(boolean var : isvalid){
            if(!var) return false;
        }
        return true;
    }
}