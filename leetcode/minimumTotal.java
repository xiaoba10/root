package leetcode101;

import java.util.List;

public class minimumTotal {


	public int minimumTotal(List<List<Integer>> triangle) {
		

		int height = triangle.size();

		int[] dp = new int[height];
		dp[0] = dp[0]+triangle.get(0).get(0);
		for( int i = 1;i<height;i++){
		    int a = dp[0],b = dp[1];
			dp[0] = dp[0]+triangle.get(i).get(0);
			for( int j = 1;j<i;j++){
				dp[j] = Math.min(a,b)+triangle.get(i).get(j);
				a = b;
				b = dp[j+1];
			}
			dp[i] = a+triangle.get(i).get(i);
		}
		int result = dp[0];
		for( int i = 1;i<height;i++)
			result = Math.min(result,dp[i]);
		
		return result;

    

    }
}
