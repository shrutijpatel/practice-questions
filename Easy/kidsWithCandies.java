class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> l = new ArrayList<>();
        
       for (int i : candies) {
        max = Math.max(max, i);
       }
        
        for(int j : candies){
            if(j+extraCandies >= max) l.add(true);
            else l.add(false);
        }
        return l;
    }
}
