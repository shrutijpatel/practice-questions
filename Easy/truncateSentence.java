class Solution {
    public String truncateSentence(String s, int k) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){ 
                if(--k == 0){ 
                    return s.substring(0, i);
                }
            }
        }
        return s;  //if the words in a sentence are less than k return sentence
    } 
}
