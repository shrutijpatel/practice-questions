class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
		boolean check = false;
		for(int i : nums){
			if(set.contains(i)){
				check = true;
			} else {
				set.add(i);
			}
		}

		return check;
        
    }
}
