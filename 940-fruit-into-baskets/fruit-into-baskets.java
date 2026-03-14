class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low = 0, res = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int high = 0; high < n; high++)
        {
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) + 1);
            while (freq.size() > 2)// shrink window if more than k unique
            {
                int leftFruit = fruits[low];
                freq.put(leftFruit, freq.get(leftFruit) - 1);
                if (freq.get(leftFruit) == 0){
                    freq.remove(leftFruit);
                }
                low++;
            }
            res = Math.max(res, high - low + 1);  
        }
        return res;
    }
}