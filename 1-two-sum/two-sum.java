public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Brute-force approach using two for-loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if sum of two elements equals target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no pair found
        return new int[] { -1, -1 };
    }

    // Main function to test the above code
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
