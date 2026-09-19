class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int total=amount[0]+amount[1]+amount[2];
        int max=amount[2];
        return Math.max(max,(total+1)/2);
    }
}