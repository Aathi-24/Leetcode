class Solution {
    public int maxDigitRange(int[] nums) {
        int res = 0;
        int m = Integer.MIN_VALUE;
        for(int num : nums){
            int n = num;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while(n > 0){
                int i = n % 10;
                if(i > max) max = i;
                if(i < min) min = i;
                n /= 10;
            }
            int range = max - min;
            if(range > m) m = range;      
        }
        for(int num : nums){
            int n = num;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while(n > 0){
                int i = n % 10;
                if(i > max) max = i;
                if(i < min) min = i;
                n /= 10;
            }
            int r = max - min;
            if(r == m) res += num;      
        }
        return res;
    }
}