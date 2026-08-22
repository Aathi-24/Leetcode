class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int num = n;
        while(n > 0){
            int r = n % 10;
            sum += r;
            prod *= r;
            n /= 10;
        }
        return num % (sum + prod) == 0;
    }
}