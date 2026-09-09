class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3) list.add(key);
        }
        return list;
    }
}