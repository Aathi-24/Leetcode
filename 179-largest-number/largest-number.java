class Solution {
    public String largestNumber(int[] nums) {
        int sum  = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum == 0) return "0";
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a,b) -> {
            return (b + a).compareTo(a + b);
        });
        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            sb.append(i);
        }
        return sb.toString();
    }
}