class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[] {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sumOfTwo = nums[i] + nums[j];
                if (sumOfTwo == target) {
                    ans = new int[] {i, j};
                }
            }
        }

        return ans;
    }
}