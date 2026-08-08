class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] += i;
            arr[t.charAt(i) - 'a'] -= i;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) count += Math.abs(arr[i]);
        }
        return count;
    }
}