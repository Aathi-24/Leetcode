class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] Min = new int[n];
        Min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Min[i] = Math.min(nums[i], Min[i + 1]);
        }
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Max = Math.max(Max, nums[i]);
            if (Max - Min[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}