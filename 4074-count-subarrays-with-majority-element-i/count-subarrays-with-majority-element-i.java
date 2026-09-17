class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int n = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == target) count++;
                n++;
                if(2 * count > n) res++;
            }
        }
        return res;
    }
}