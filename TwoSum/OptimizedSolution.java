class OptimizedSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementValue = target - nums[i];
            if (map.containsKey(complementValue)) {
                return new int[] {i, map.get(complementValue)};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}