class Solution {
    public boolean isDigitorialPermutation(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int fact = 1;
        for(int i = 1; i <= 9; i++){
            fact *= i;
            list.add(fact);
        }
        int res = 0;
        int[] f1 = new int[10];
        while(n > 0){
            int n1 = n % 10;
            f1[n1]++;
            res += list.get(n1);
            n /= 10;
        }
        int[] f2 = new int[10];
        while(res > 0){
            int n1 = res % 10;
            f2[n1]++;
            res /= 10;
        }
        return Arrays.equals(f1, f2);
    }
}