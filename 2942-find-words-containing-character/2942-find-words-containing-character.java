class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < words.length; j++){
            String word = words[j];
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == x){
                    list.add(j);
                    break;
                }
            }
        }
        return list;
    }
}