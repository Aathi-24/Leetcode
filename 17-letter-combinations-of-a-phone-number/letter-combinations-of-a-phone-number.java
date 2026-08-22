class Solution {
    List<String> res;
    Map<Character,String> map;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length() != 0) backtrack(digits, 0, "");
        return res;
    }

    public void backtrack(String digits, int i, String s){
        if(s.length() == digits.length()){
            res.add(s);
            return;
        }
        String str = map.get(digits.charAt(i));
        for(char c : str.toCharArray()){
            backtrack(digits, i + 1, s + c);
        }
    }
}