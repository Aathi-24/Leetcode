class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int[] xor = new int[arr.length];
        int[] res = new int[q.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum ^= arr[i];
            xor[i] = sum;
        }
        int index = 0;
        for(int[] nums : q){
            int st = nums[0];
            int end = nums[1];
            if(st == 0) res[index++] = xor[end];
            else res[index++] = xor[end] ^ xor[st - 1];
        }
        return res;
    }
}