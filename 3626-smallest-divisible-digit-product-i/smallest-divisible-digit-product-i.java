class Solution {
    public int smallestNumber(int n, int t) {
        int end = n + 10;
        for(int i = n; i < end; i++){
            int prod = 1;
            int num = i;
            while(num > 0){
                prod *= num % 10;
                num /= 10;
            }
            if(prod % t == 0) return i;
        }
        return -1;
    }
}