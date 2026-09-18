class Solution {
    public String stringHash(String s, int k) {
        String res = "";
        for(int i = 0; i < s.length(); i += k){
            String str = s.substring(i , i + k);
            int sum = 0;
            for(char c : str.toCharArray()){
                sum += (int)c - 97;
            }
            char c = (char)((sum % 26) + 97);
            res += c;
        }
        return res;
    }
}