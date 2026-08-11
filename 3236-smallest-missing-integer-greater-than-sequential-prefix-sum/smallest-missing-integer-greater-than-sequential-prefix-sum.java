class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1] + 1){
                break;
            }
            sum += nums[i];
        }
        boolean[] found = new boolean[52];
        for(int i : nums){
            found[i] = true;
        }
        for(int i = sum; i <= 51; i++){
            if(!found[i]) return i;
        }
        return sum;
    }
}