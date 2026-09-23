class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i : nums){
            total += i;
        }
        x = total - x;
        if(x < 0) return -1;
        if(x == 0) return nums.length;
        int sum = 0;
        int l = 0;
        int max = -1;
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > x && l <= r){
                sum -= nums[l];
                l++;
            }
            if(sum == x){
                max = Math.max(max, r - l + 1);
            }
        }
        if(max == -1) return -1;
        return nums.length - max;
    }
}