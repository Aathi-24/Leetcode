class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        String res = "";
        for(String s : words){
            char c = Character.toLowerCase(s.charAt(0));
            String row = "";
            if(r1.contains("" + c)) row = r1;
            else if(r2.contains("" + c)) row = r2;
            else row = r3;
            int count = 0;
            for(char ch : s.toCharArray()){
                ch = Character.toLowerCase(ch);
                if(row.contains("" + ch)) count++;
            }
            if(count == s.length()){
                res += s;
                res += " ";
            }
        }
        String[] result = res.trim().split("\\s+");
        return (res.length() > 0) ? result : new String[0];
    }
}