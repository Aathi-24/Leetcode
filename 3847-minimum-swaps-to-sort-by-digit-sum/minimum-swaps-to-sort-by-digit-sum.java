class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            int n1 = Sum(a[0]);
            int n2 = Sum(b[0]);
            if (n1 != n2) {
                return n1 - n2;
            }
            return a[0] - b[0];
        });
        boolean[] visited = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            int cycleSize = 0;
            int curr = i;
            while (!visited[curr]) {
                visited[curr] = true;
                curr = arr[curr][1];
                cycleSize++;
            }
            if (cycleSize > 1) {
                res += (cycleSize - 1);
            }
        }
        return res;
    }
    
    public int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}