package leetcode101;

public class maxProfit3 {
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if( len < 2 )
		    return 0;
		int[] preProfit = new int[len];
		int[] maxProfit = new int[len];
		int cur = prices[0];
		preProfit[0] = 0;
		for( int i = 1;i<len;i++){
			cur = Math.min(cur,prices[i]);
			preProfit[i] = Math.max(preProfit[i-1],prices[i] - cur);
		}
		cur = prices[len-1];
		maxProfit[len-1] = 0;
		for( int i = len-2;i>=0;i--){
			cur = Math.max(cur,prices[i]);
			maxProfit[i] = Math.max(maxProfit[i+1],cur - prices[i]);
		}
		
		int result = 0;
		for( int i = 0;i<len;i++){
			result = Math.max(preProfit[i]+maxProfit[i],result);
		}
		return result;

	
	}

	
}
