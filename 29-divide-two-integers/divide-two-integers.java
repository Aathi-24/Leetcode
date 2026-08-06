class Solution {
    public int divide(int n, int d) {
        if(n == Integer.MIN_VALUE && d == -1) return Integer.MAX_VALUE;
        boolean sign = (n < 0) ^ (d < 0);
        long dvd = Math.abs((long)n);
        long dvs = Math.abs((long)d);
        int res = 0;
        for(int i = 31; i >= 0; i--){
            if((dvd >> i) >= dvs){
                dvd -= (dvs << i);
                res += (1 << i);
            }
        }
        if(sign) return -res;
        return res;
    }
}