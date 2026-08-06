class Solution {
    Set<List<Integer>> set;
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        set = new HashSet<>();
        combine(nums, k , n, 0, new ArrayList<>());
        return new ArrayList<>(set);
    }

    public void combine(int[] nums, int k, int n, int start, List<Integer> list){
        if(list.size() == k && sum(list) == n){
            set.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            combine(nums, k , n, i + 1, list);
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