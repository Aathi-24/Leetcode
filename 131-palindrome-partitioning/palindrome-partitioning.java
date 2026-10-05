class Solution {
    List<List<String>> list;
    public List<List<String>> partition(String s) {
        list = new ArrayList<>();
        backtrack(s, 0, new ArrayList<String>(), list);
        return list;
    }

    public void backtrack(String s, int i, List<String> l, List<List<String>> list){
        if(i == s.length()){
            list.add(new ArrayList(l));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = i; j < s.length(); j++){
            sb.append(s.charAt(j));
            String sub = sb.toString();
            if(ispal(sub)){
                l.add(sub);
                backtrack(s, j+1, l, list);
                l.remove(l.size() - 1);
            }
        }
    }

    public boolean ispal(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}