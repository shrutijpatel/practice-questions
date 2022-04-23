class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                for(int k = 0; k < arr.length; k++) {
                    if(0 <= i && i < j && j < k && k < arr.length) {
                        if(Math.abs(arr[i] - arr[j]) <= a) {
                            if(Math.abs(arr[j] - arr[k]) <= b) {
                                if(Math.abs(arr[i] - arr[k]) <= c) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
