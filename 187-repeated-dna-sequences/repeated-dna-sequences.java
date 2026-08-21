class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        for(int r  = 0; r <= s.length() - 10; r++){
            String sub = s.substring(r, r + 10);
            if(!s1.add(sub)) s2.add(sub);
        }
        return new ArrayList<>(s2);
    }
}