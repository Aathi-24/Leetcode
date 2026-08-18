class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] fix = new boolean[baskets.length];
        int count = 0;
        for(int i = 0; i < fruits.length; i++){
            boolean placed = false;
            for(int j = 0; j < fruits.length; j++){
                if(baskets[j] >= fruits[i] && !fix[j]){
                    fix[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed) count++;
        }
        return count;
    }
}