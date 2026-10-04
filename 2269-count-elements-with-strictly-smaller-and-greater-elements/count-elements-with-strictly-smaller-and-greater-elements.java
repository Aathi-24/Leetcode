class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int min_count = 0;
        int max_count = 0;
        for(int i : nums){
            if(i > max){
                max_count = 0;
                max = i;
            }
            if(i < min){
                min_count = 0;
                min = i;
            }
            if(i == max) max_count++;
            if(i == min) min_count++;
        }
        return (max == min) ? 0 : n - min_count - max_count;
    }
}