class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int j = nums.length -1; j >= 2; j--) {
            if (nums[j-1] + nums[j-2] > nums[j]) {
                return nums[j-1] + nums[j-2] + nums[j];
            }
        }
        return 0; 
    }
}
