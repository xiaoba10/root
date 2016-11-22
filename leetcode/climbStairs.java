package leetcode62;

public class climbStairs {
	public int climbStairs(int n) {
        if( n == 0 )
        	return 0;
        if( n == 1)
        	return 1;
        if( n == 2)
        	return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for( int i = 2;i<n;i++){
        	dp[n] = dp[n-2]+dp[n-1];
        }
        return dp[n-1];
    }
}
