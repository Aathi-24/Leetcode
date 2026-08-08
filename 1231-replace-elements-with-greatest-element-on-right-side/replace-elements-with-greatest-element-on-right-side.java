class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[arr.length];
        int max = -1;
        for(int i = n - 1; i >= 0; i--){
            res[i] = max;
            if(arr[i] > max) max = arr[i];
        }
        return res;
    }
}