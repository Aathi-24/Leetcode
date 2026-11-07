class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        int index = 0;
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!(map.containsKey(key))){
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(key,l);
            }
            else{
                List<String> l = map.get(key);
                l.add(s);
                map.put(key,l);
            }
        }
        for(String s : map.keySet()){
            list.add(map.get(s));
        }
        return list;
    }
}