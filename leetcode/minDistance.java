package leetcode62;

public class minDistance {
	
	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int[][] pos = new int[len1+1][len2+1];
		for (int i = 0; i <= len2; i++) 
			pos[0][i] = i ;
		for (int i = 0; i <= len1; i++) 
			pos[i][0] = i ;
		for (int i = 1; i <= len1 ; i++) {
			for (int j = 1; j<= len2 ; j++) {
				if( word1.charAt(i-1) == word2.charAt(j-1))
					pos[i][j] = Math.min(Math.min(pos[i - 1][j] + 1, pos[i][j - 1] + 1),pos[i - 1][j - 1]); 
				else
					pos[i][j] = Math.min(Math.min(pos[i - 1][j] + 1, pos[i][j - 1] + 1),pos[i - 1][j - 1]+1); 
			}
		}
		return pos[len1][len2];
	}
}
