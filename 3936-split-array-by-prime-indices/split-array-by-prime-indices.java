class Solution {
    public long splitArray(int[] nums) {
        long s1 = 0;
        long s2 = 0;
        boolean[] prime = isprime(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(prime[i]) s1 += nums[i];
            else s2 += nums[i];
        }
        return Math.abs(s1 - s2);
    }

    public boolean[] isprime(int n){
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i * i <= n; i++){
            if(prime[i]){
                for(int j = i * i; j <= n; j += i){
                    prime[j] = false; 
                }
            }
        }
        return prime;
    }
}