class Solution {
    public boolean scoreBalance(String s) {
        int tot = 0;
        for(char c : s.toCharArray()){
            tot += (c - 'a' + 1);
        }
        int cur = 0;
        for(int i = 0; i < s.length() - 1; i++){
            cur += (s.charAt(i) - 'a' + 1);
            if(tot - cur == cur) return true;
        }
        return false;
    }
}