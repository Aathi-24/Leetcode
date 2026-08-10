class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String[] arr = new String[3];
        arr[0] = String.format("%04d",num1);
        arr[1] = String.format("%04d",num2);
        arr[2] = String.format("%04d",num3);
        String res = "";
        for(int i = 0; i < 4; i++){
            res += (char)Math.min(Math.min((int)arr[0].charAt(i), (int)arr[1].charAt(i)),(int)arr[2].charAt(i));
        }
        return Integer.parseInt(res);
    }
}