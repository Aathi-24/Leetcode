class Solution {
    public int totalFruit(int[] f) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = 0; 
        int max = 0;
        for(int r = 0; r < f.length; r++){
            map.put(f[r], map.getOrDefault(f[r], 0) + 1);
            while(map.size() > 2){
                map.put(f[l], map.get(f[l]) - 1);
                if(map.get(f[l]) == 0) map.remove(f[l]);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}