class Solution {
    public boolean isPalindrome(int x) {
         if(x < 0 &&  x/10 == 0 || x < 0){
            return false;
        }
        // divide x and then add remainder to k and then after check they
        //are same or not.....
        int k = x % 10;
        int a = x / 10;
        while(a > 0){
            int rem = a % 10;
            a= a/10;
            k = k*10 + rem;
        }
        return k == x;
    }
}
