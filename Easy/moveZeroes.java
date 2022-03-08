class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            int x = nums[i];
            if(x != 0)
                ans[j++] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
    }
}
