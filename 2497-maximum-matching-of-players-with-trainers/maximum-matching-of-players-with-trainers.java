class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j = 0;
        int res = 0;
        for(int i = 0; i < trainers.length; i++){
            if(j >= players.length) break;
            if(trainers[i] >= players[j]){
                res++;
                j++;
            }
        }
        return res;
    }
}