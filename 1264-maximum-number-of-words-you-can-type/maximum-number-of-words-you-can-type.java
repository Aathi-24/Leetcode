class Solution {
    public int canBeTypedWords(String text, String b) {
        String[] words = text.split("\\s+");
        int count = 0;
        for(String s : words){
            for(char c : s.toCharArray()){
                if(b.contains("" + c)){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}