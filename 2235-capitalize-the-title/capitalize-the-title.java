class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
            if(words[i].length() <= 2) continue;
            else words[i] = "" + Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1,words[i].length());
        }
        StringBuilder res = new StringBuilder();
        for(String s : words){
            res.append(s).append(" ");
        }
        return res.toString().trim();
    }
}