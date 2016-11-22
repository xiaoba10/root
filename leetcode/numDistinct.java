package leetcode101;

public class numDistinct {


	

	public int numDistinct(String s, String t) {
		int len1 = s.length(),len2 = t.length();
		if( len1 < len2 )
			return 0;
		char[] word1 = s.toCharArray();
		char[] word2 = t.toCharArray();
		int[][] dp = new int[len1+1][len2+1];


		for( int i = 0;i<=len1;i++){

			for( int j = 0;j<=i;j++){		
				if( i == 0 )
					dp[i][j] = 0;
				else if( j == 0)
					dp[i][j] = 1;
				else if( word1[i-1] == word2[j-1] )
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
				else
					dp[i][j] = dp[i][j-1];



			}
		}

		return dp[len1][len2];
		

    }
}
