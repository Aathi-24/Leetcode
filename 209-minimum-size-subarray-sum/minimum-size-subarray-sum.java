class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > target){
                sum -= nums[l];
                min = Math.min(min, r - l + 1);
                l++;
            }
            if(sum == target) min = Math.min(min, r - l + 1);
        }
        if(l == 0 && sum < target) return 0;
        return min;
    }
}