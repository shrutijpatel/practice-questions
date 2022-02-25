public class Question1 {
    public int countOdds(int low, int high) {
        int sum = 0;
        int start = low;
        if (start % 2 == 0){
            start++;
        }
        while (start <= high){
            sum++;
            start+=2;
        }

        return sum;
    }
}

*********************OR***************************

class Solution {
    public int countOdds(int low, int high) {
       return (high+1)/2 - low/2;
    }   
}
