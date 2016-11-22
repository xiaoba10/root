package leetcode101;

public class maxProfit {
	public int maxProfit(int[] prices) {
        int len = prices.length;
        if( len < 2 )
        	return 0;
        int result = 0;
        int buy = prices[0];
        for( int i = 1;i<len;i++){
        	if( prices[i] > buy  )
        	{
        		result = Math.max(result,prices[i]-buy);
        	}else
        	    buy = prices[i];
        }

        return result;

    }
}
