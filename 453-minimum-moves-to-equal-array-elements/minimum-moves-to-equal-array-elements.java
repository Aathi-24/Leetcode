class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(i < min) min = i;
        }
        return sum - n * min;
    }
}