class Solution {
    public String mergeAlternately(String word1, String word2) {
        var m = word1.length();
	var n = word2.length();
	var min = Math.min(m, n);
	var i = 0;
	var merged = new StringBuilder();

	while (i < min)
		merged.append(word1.charAt(i))
			  .append(word2.charAt(i++));
			  
	return merged.append(word1, i, m)
				 .append(word2, i, n)
				 .toString();
    }
}
