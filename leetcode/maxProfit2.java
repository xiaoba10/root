package leetcode101;

public class maxProfit2 {

	public int maxProfit(int[] prices) {
		int len = prices.length;
        if( len < 2)
            return 0;
        int result = 0;
        int start = 0;
        while( start < len ){
            start = getStart(prices,start);
            if( start == len-1)
                break;
            result+=(prices[start+1]-prices[start]);
            start++;
        }
        return result;
    }

    public int getStart(int[] prices,int start){
        int buy = prices[start];
        while( start < prices.length ){
            if( buy >= prices[start]){
                buy = prices[start];
                start++;
            }else
                break;
        }
        return start-1;

    }

}
