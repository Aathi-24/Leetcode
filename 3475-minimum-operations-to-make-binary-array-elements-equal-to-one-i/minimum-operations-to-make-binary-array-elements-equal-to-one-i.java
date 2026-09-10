class Solution {
    public int minOperations(int[] arr) {
        int l = 0;
        int count = 0;
        for(int r = 0; r < arr.length; r++){
            if(r - l + 1 == 3){
                if(arr[l] == 0){
                    arr[l] = (arr[l] == 0) ? 1 : 0;
                    arr[l + 1] = (arr[l + 1] == 0) ? 1 : 0;
                    arr[l + 2] = (arr[l + 2] == 0) ? 1 : 0;
                    count++;
                }
                l++;
            }
        }
        for(int i : arr){
            if(i == 0) return -1;
        }
        return count;
    }
}