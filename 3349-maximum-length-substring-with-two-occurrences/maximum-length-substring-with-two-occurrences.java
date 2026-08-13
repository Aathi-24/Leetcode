class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.get(c) > 2){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}