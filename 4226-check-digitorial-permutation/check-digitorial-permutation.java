class Solution {
    public boolean isDigitorialPermutation(int n) {
        int fact = 1;
        int temp = n;
        int sum = 0;
        while(temp != 0){
            sum += factorial(temp % 10);
            temp /= 10;
        }
        int res = 0;
        int[] f1 = new int[10];
        while(n > 0){
            int n1 = n % 10;
            f1[n1]++;
            n /= 10;
        }
        while(sum > 0){
            int n1 = sum % 10;
            f1[n1]--;
            sum /= 10;
        }
        for(int i : f1){
            if(i != 0) return false;
        }
        return true;
    }
    public int factorial(int num){
        int fact = 1;
        for(int i =1;i <= num;i++){
            fact *= i;
        }
        return fact;
    }
}