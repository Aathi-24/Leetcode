class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        combine(nums, target, 0, new ArrayList<>());
        return res;
    }

    public void combine(int[] nums, int k, int start, List<Integer> list){
        if(sum(list) > k) return;
        if(sum(list) == k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            combine(nums, k, i, list);
            list.remove(list.size() - 1);
        }
    } 

    public int sum(List<Integer> list){
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }
}