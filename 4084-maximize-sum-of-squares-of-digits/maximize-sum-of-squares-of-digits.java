class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num * 9) return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            int k = Math.min(9, sum);
            sum -= k;
            sb.append(k);
        }
        return sb.toString();
    }
}