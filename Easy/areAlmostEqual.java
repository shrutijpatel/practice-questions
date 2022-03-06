class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i1 = -1, i2 = -1;
        for(int i = 0; i < s1.length(); i++){  
            if(s1.charAt(i) == s2.charAt(i)){ 
                continue;
            }
            if(i2 != -1){ 
                return false;
            }
            if(i1 == -1){ 
                i1 = i;
            }
            else{ 
                i2 = i;
            }
        }
        if(i1 == i2){ 
            return true;
        }
        if(i2 == -1){
            return false;
        }
		
        if(s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1)){ //
            return true;
        }
        return false;
    }
}
