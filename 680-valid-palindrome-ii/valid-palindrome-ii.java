class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                boolean skipl = ispal(s, l+1,r);
                boolean skipr = ispal(s, l,r-1);
                return skipl || skipr;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean ispal(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}