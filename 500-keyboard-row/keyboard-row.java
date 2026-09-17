class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String s : words){
            String temp = s.toLowerCase();
            String row = "";
            if(r1.indexOf(temp.charAt(0)) != -1) row = r1;
            else if(r2.indexOf(temp.charAt(0)) != -1) row = r2;
            else row = r3;
            boolean can = true;
            for(char c : temp.toCharArray()){
                if(row.indexOf(c) == -1) can = false;
            }
            if(can){
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}