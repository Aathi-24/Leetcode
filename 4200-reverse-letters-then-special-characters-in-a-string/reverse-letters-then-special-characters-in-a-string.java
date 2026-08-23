class Solution {
    public String reverseByType(String s) {
        String res = "";
        int sym = s.length() - 1;
        int let = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                while(let >= 0 && !Character.isLetter(s.charAt(let))){
                    let--;
                }
                res += s.charAt(let);
                let--;
            }
            else{
                while(sym >= 0 && Character.isLetter(s.charAt(sym))){
                    sym--;
                }
                res += s.charAt(sym);
                sym--;
            }
        }
        return res;
    }
}