class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int curMax=nums[0], curSum=0;
        for(int num:nums){
            curSum =Math.max(num, num+curSum);
            curMax = Math.max(curMax, curSum);
        }
        return curMax;
    }
}
