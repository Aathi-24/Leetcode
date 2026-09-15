class Solution {
    public String removeOccurrences(String s, String part) {
        int n = (s.length() / part.length()) + 1;
        while(n > 0){
            s = s.replaceFirst(part, "");
            n--;
        }
        return s;
    }
}