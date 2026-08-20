class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int count = 0;
        int min = blocks.length();
        for(int r = 0; r < blocks.length(); r++){
            char c = blocks.charAt(r);
            if(c == 'W') count++;
            if(r - l + 1 == k){
                min = Math.min(min, count);
                c = blocks.charAt(l);
                if(c == 'W') count--;
                l++;
            }
        }
        return min;
    }
}