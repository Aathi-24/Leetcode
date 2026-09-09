class Solution {
    public long countCommas(long n) {
        long count = 0;
        long k = 1000;
        while(k <= n){
            count += n - k + 1;
            k *= 1000;
        }
        return count;
    }
}