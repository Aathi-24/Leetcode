class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int res = 0;
        for(int r = 0; r < nums.length; r++){
            while(nums[r] - nums[l] > 1){
                l++;
            }
            if(nums[r] - nums[l] == 1) res = Math.max(res , r - l + 1);
        }
        return res;
    }
}