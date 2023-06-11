class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer index = hmap.get(nums[i]);
            if (index != null) {
                return new int[] { index, i };
            }
            hmap.put(target - nums[i], i);
        }
        return null;
    }
}