class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int r = 2; r < s.length(); r++){
            if(s.charAt(r) != s.charAt(r - 1) && s.charAt(r) != s.charAt(r - 2) && s.charAt(r - 1) != s.charAt(r - 2)) count++;
        }
        return count;
    }
}