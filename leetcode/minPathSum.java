package leetcode62;

public class minPathSum {
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		if( m == 0 || n == 0)
			return 0;
		int result = 0;
		if( m == 1){
			for( int i = 0;i<n;i++)
				result+=grid[0][i];
			return result;
		}
		if( n == 1){
			for( int i = 0;i<m;i++){
				result += grid[i][0];
			}
			return result;
		}
		int[] dp = new int[n];
		dp[0] = grid[0][0];
		for( int i = 1 ;i<n;i++){
			dp[i] = dp[i-1]+grid[0][i];
		}
		for( int i = 1;i<m;i++){
			dp[0] = dp[0]+grid[i][0];
			for( int j = 1;j<n;j++){
				dp[j] = dp[j]>dp[j-1]?dp[j-1]+grid[i][j]:dp[j]+grid[i][j];
			}
		}
		return dp[n-1];
		
		
		
		
    }
}
