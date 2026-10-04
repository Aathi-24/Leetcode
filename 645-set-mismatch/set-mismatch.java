class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) == 2) res[0] = i;
        }
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                res[1] = i;
                break;
            } 
        }
        return res;
    }
}