class Solution {
    public int passwordStrength(String p) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()){
            if(Character.isLowerCase(c)) res += 1;
            else if(Character.isUpperCase(c)) res += 2;
            else if(Character.isDigit(c)) res += 3;
            else res += 5;
        }
        return res;
    }
}