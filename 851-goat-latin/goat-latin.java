class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split("\\s+");
        for(int i = 0; i < words.length; i++){
            if("aeiouAEIOU".contains("" + words[i].charAt(0))){
                words[i] += "ma";
            }
            else{
                StringBuilder sb = new StringBuilder(words[i]);
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                sb.append("ma");
                words[i] = sb.toString();
            }
        }
        String a = "a";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            words[i] += a;
            a += "a";
            res.append(words[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}