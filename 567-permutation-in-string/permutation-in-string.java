class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int k = s1.length();
        for(char c : s1.toCharArray()){
            freq1[c - 'a']++;
        }
        int[] freq2 = new int[26];
        int l = 0;
        for(int r = 0;  r < s2.length(); r++){
            freq2[s2.charAt(r) - 'a']++;
            if(r - l + 1 == k){
                if(Arrays.equals(freq1,freq2)) return true;
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }
        }
        return false;
    }
}