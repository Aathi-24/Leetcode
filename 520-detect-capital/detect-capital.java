class Solution {
    public boolean detectCapitalUse(String word) {
        int n = 0;
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c)) n++;
        }
        return (n == word.length() || n == 0 || (n == 1 && Character.isUpperCase(word.charAt(0)))) ;
    }
}