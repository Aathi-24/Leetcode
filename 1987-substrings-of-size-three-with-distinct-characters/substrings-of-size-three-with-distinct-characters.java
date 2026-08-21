class Solution {
    public int countGoodSubstrings(String s) {
        int l = 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            if(r - l + 1 == 3){
                if(set.size() == 3) count++;
                set.remove(s.charAt(l));
                l++;
            }
        }
        return count;
    }
}