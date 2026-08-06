class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int i : nums){
            tot += i;
        }
        int left = 0;
        int right = tot;
        for(int i = 0; i < nums.length; i++){
            if(i > 0) left += nums[i - 1];
            right = tot - (nums[i] + left);
            if(left == right) return i;
        }
        return -1;
    }
}