class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] freq = new int[51];
        for(int i = 0; i < ranges.length; i++){
            int start = ranges[i][0];
            int end = ranges[i][1];
            for(int j = start; j <= end; j++){
                freq[j]++;
            }
        }
        for(int i = left; i <= right; i++){
            if(freq[i] == 0) return false;
        }
        return true;
    }
}