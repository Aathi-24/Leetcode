class Solution {
    Set<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new HashSet<>();
        permute(nums, new ArrayList<Integer>(), new HashSet<>());
        return new ArrayList<>(res);
    }

    public void permute(int[] nums, List<Integer> list, Set<Integer> set){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(i)){
                list.add(nums[i]);
                set.add(i);
                permute(nums, list, set);
                list.remove(list.size() - 1);
                set.remove(i);
            }
        }
    }
}