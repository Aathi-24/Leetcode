class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], i);
        }
        for(int i = 1; i <= n; i++){
            if(!map.containsKey(i)) res.add(i);
        }
        return res;
    }
}