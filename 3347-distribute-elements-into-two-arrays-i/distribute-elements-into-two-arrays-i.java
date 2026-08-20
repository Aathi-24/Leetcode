class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        int n1 = 0;
        int n2 = 0;
        for(int i = 2; i < nums.length; i++){
            if(l1.get(n1) > l2.get(n2)){
                l1.add(nums[i]);
                n1++;
            }
            else{
                l2.add(nums[i]);
                n2++;
            }
        }
        int ind = 0;
        for(int i : l1){
            nums[ind++] = i;
        }
        for(int i : l2){
            nums[ind++] = i;
        }
        return nums;
    }
}