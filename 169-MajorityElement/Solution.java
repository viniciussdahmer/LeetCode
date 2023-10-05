import java.util.Optional;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
        }

        Optional<Integer> maxKey = map.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);
        
        return maxKey.isPresent() ? maxKey.get() : -1;
    }
}
