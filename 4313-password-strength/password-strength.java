class Solution {
    public int passwordStrength(String password) {
        boolean[] seen = new boolean[128];
        int total = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (seen[ch]) {
                continue;
            }
            seen[ch] = true;
            if (ch >= 'a' && ch <= 'z') {
                total += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                total += 2;
            } else if (ch >= '0' && ch <= '9') {
                total += 3;
            } else { 
                total += 5;
            }
        }
        return total;
    }
}