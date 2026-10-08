class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        boolean[] seen = new boolean[100001];
        int l = 0;
        long sum = 0;
        for(int r = 0; r < nums.length; r++){
            while(seen[nums[r]]){
                seen[nums[l]] = false;
                sum -= nums[l];
                l++;
            }
            sum += nums[r];
            seen[nums[r]] = true;
            if(r - l + 1 == k){
                max = Math.max(max, sum);
                sum -= nums[l];
                seen[nums[l]] = false;
                l++;
            }
        }
        return max;
    }
}