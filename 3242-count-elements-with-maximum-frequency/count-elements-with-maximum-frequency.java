class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i : freq){
            if(i > max) max = i;
        }
        int res = 0;
        for(int i : freq){
            if(i == max) res += i;
        }
        return res;
    }
}