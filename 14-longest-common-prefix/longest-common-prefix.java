class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String minstr = "";
        for(String s : strs){
            if(s.length() < min){
                min = s.length();
                minstr = s;
            }
        }
        StringBuilder sb = new StringBuilder(minstr);
        while(sb.length() > 0){
            int count = 0;
            for(String s : strs){
                if(s.startsWith(sb.toString())) count++;
            }
            if(count == strs.length) break;
            else{
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}