class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        int res = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && freq[i] % k == 0){
                res += i * freq[i];
            }
        }
        return res;
    }
}