class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0;
        int max = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] > threshold){
                l = r + 1;
                continue;
            }
            if(r > 0 && (nums[r] % 2 == nums[r - 1] % 2 || nums[r - 1] > threshold)){
                l = r;
            }
            while(l <= r && nums[l] % 2 != 0){
                l++;
            }
            if(l <= r) max = Math.max(max, r - l + 1);
        }
        return max;
    }
}