class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int max = 0;
        int zeros = 0;
        int count = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 1) count++;
            else zeros++;
            while(zeros > k){
                if(nums[l] == 1) count--;
                else zeros--;
                l++;
            }
            max = Math.max(max, count + zeros);
        }
        return max;
    }
}