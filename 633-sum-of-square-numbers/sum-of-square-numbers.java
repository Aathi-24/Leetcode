class Solution {
    public boolean judgeSquareSum(int c) {
        int l = 0;
        long r = (long)Math.sqrt(c);
        while(l <= r){
            long n = (l * l) + (r * r);
            if(n == c) return true;
            else if(n < c) l++;
            else r--;
        }
        return false;
    }
}