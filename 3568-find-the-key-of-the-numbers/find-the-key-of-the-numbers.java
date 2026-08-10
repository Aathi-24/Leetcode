class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String a = String.format("%04d",num1);
        String b = String.format("%04d",num2);
        String c = String.format("%04d",num3);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            sb.append((char)Math.min(Math.min((int)a.charAt(i), (int)b.charAt(i)),(int)c.charAt(i)));
        }
        return Integer.parseInt(sb.toString());
    }
}