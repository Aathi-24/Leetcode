class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                String skipl = s.substring(l+1,r+1);
                String skipr = s.substring(l,r);
                return (skipl.equals(new StringBuilder(skipl).reverse().toString()) || skipr.equals(new StringBuilder(skipr).reverse().toString()));
            }
            l++;
            r--;
        }
        return true;
    }
}