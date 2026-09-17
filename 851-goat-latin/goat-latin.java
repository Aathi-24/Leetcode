class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split("\\s+");
        String a = "maa";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            char b = words[i].charAt(0);
            if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U'){
                words[i] += a;
            }
            else{
                StringBuilder sb = new StringBuilder(words[i]);
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                sb.append(a);
                words[i] = sb.toString();
            }
            a += "a";
            res.append(words[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}