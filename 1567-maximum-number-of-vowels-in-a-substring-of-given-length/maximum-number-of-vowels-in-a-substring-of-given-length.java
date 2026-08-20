class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int count = 0;
        int max = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
            if(r - l + 1 == k){
                max = Math.max(max , count);
                c = s.charAt(l);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count--;
                l++;
            }
        }
        return max;
    }
}