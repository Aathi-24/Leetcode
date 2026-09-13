class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) list.add(i);
        }
        int[] res = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            int min = s.length();
            for(int j : list){
                if(Math.abs(i - j) < min){
                    min = Math.abs(i - j);
                }
            }
            res[i] = min;
        }
        return res;
    }
}