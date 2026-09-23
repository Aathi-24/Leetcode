class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int end = nums.length - 1;
        int last = 0;
        int max = 0;
        if(nums.length == 1) return 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, i + nums[i]);
            if(i == last){
                last = max;
                res++;
                if(max >= end) return res;
            }
        }
        return res;
    }
}