class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean res = false;
        int l = 0;
        for(int r = 0; r < nums.length; r++){
            if(map.containsKey(nums[r])){
                if(Math.abs(map.get(nums[r]) - r) <= k){
                    res = true;
                    break;
                }
                else map.put(nums[r], r);
            }
            else map.put(nums[r], r);
        }
        return res;
    }
}