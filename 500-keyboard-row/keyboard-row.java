class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
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
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}