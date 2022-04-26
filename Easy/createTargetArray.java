class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         if (nums.length == 1) return nums;
           List<Integer> list = new ArrayList<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i],nums[i]);
            }

            int[] target = new int[nums.length];
            for(int i = 0; i < nums.length; i++) 
                target[i] = list.get(i);
            return target;
    }
}
