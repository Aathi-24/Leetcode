class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        for(char c : p.toCharArray()){
            freq1[c - 'a']++;
        }
        int k = p.length();
        int l = 0;
        List<Integer> list = new ArrayList<>();
        int[] freq2 = new int[26];
        for(int r = 0; r < s.length(); r++){
            freq2[s.charAt(r) - 'a']++;
            if(r - l + 1 == k){
                if(Arrays.equals(freq1,freq2)) list.add(l);
                freq2[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return list;
    }
}