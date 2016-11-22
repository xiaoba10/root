package leetcode62;

public class uniquePathsWithObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (m == 0 || n == 0)
			return 0;
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				if (obstacleGrid[0][i] == 1)
					return 0;
			}
			return 1;
		}
		if (n == 1) {
			for (int i = 0; i < m; i++) {
				if (obstacleGrid[i][0] == 1)
					return 0;
			}
			return 1;
		}
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 1)
				while (i < n) {
					dp[i] = 0;
					i++;
				}
			else
				dp[i] = 1;
		}
		for (int i = 1; i < m; i++) {
			if (obstacleGrid[i][0] == 1) {
				int j = 0;
				while (j < n) {
					if (obstacleGrid[i][j] == 1)
						dp[j] = 0;
					else
						dp[j] = dp[j];
					j++;
				}
			}
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					dp[j] = 0;
				} else
					dp[j] += dp[j - 1];
			}
		}
		return dp[n - 1];

	}
}
