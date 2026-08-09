class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int deck_capacity=n*n;
        int weight_capacity=maxWeight/w;
        return Math.min(deck_capacity,weight_capacity);
    }
}