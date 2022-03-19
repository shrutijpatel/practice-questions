class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int even = 0, odd = 1;
        for(int i = 0 ; i < nums.length ; i++){
           if(i<n){
               result[even] = nums[i];
               even+=2;
           }else{
               result[odd] = nums[i];
               odd+=2;
           }
        }
        return result;
    }
}
