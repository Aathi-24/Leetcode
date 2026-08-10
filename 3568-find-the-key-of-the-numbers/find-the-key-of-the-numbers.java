class Solution {
    public int generateKey(int num1, int num2, int num3){
        int res = 0;
        int x = 1;
        while(num1 > 0 || num2 > 0 || num3 > 0){
            int min = Math.min(Math.min(num1 % 10, num2 % 10) , num3 % 10);
            res += x * min;
            x *= 10;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return res;
    }
}