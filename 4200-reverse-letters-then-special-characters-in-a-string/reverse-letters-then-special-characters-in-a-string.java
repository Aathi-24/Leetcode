class Solution {
    public String reverseByType(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder let = new StringBuilder();
        StringBuilder sym = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z') let.append(c);
            else sym.append(c);
        }
        let.reverse();
        sym.reverse();
        int a = 0;
        int b = 0;
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                res.append(let.charAt(a++));
            }
            else{
                res.append(sym.charAt(b++));
            }
        }
        return res.toString();
    }
}