class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int l = 0;
        int count = 0;
        for(int r = 0; r < s.length(); r++){
            if(r - l + 1 == k){
                int n = Integer.valueOf(s.substring(l,r+1));
                if(n > 0 && num % n == 0) count++;
                l++;
            } 
        }
        return count;
    }
}