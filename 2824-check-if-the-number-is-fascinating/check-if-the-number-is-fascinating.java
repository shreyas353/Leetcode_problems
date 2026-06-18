class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (n * 2) + (n * 3);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr).equals("123456789");
    }
}