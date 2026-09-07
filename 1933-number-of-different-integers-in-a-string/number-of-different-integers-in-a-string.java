class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()){
            if(Character.isDigit(c)) sb.append(c);
            else sb.append(" ");
        }
        String[] nums = sb.toString().split("\\s+");
        Set<String> set = new HashSet<>();
        for(String s : nums){
            if(s.isEmpty()) continue;
            s = s.replaceFirst("^0+", "");
            if(s.isEmpty()) s = "0";
            set.add(s);
        }
        return set.size();
    }
}