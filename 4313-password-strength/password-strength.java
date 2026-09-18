class Solution {
    public int passwordStrength(String p) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(char c : p.toCharArray()){
            if(set.add(c)){
                if(Character.isLowerCase(c)) res += 1;
                else if(Character.isUpperCase(c)) res += 2;
                else if(Character.isDigit(c)) res += 3;
                else res += 5;
            }
        }
        return res;
    }
}