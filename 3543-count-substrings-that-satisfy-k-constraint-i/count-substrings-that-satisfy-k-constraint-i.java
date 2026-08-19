class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String sub = s.substring(i, j);
                int ones = 0;
                int zeros = 0;
                for(char c : sub.toCharArray()){
                    if(c == '1') ones++;
                    else zeros++;
                }
                if(ones <= k || zeros <= k) count++;
            }
        }
        return count;
    }
}