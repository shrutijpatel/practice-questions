class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int ct;
        for (int i = 0; i < nums.length; i++) {
            ct = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) ct++;
            }
            ans[i] = ct;
        }
        return ans;
    }
}
