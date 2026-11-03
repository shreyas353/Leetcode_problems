class Solution {
    public int reverseBits(int n) {
        String binary=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reverse=new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(reverse,2);
    }
}