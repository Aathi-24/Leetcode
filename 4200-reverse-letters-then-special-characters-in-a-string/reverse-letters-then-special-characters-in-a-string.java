class Solution {
    public String reverseByType(String s) {
        String res = "";
        String let = "";
        String sym = "";
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)) let += c;
            else sym += c;
        }
        int a = let.length() - 1;
        int b = sym.length() - 1;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                res += let.charAt(a);
                a--;
            }
            else{
                res += sym.charAt(b);
                b--;
            }
        }
        return res;
    }
}