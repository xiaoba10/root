package leetcode62;

public class mySqrt {
	public int mySqrt(int x) {
        int max = 46340;
        int flag = max/2;
        if( x >= max*max )
        	return max;
        int start = 0,end = max;
        while( true ){
        	if( x >= flag*flag ){
        		if( x < (flag+1)*(flag+1) )
        			return flag;
        		else{
        			start = flag;
        			
        		}
        	}else{
        		if( x <= (flag-1)*(flag-1))
        			return flag-1;
        		else{
        			end = flag;
        		}
        	}
        	flag = (end-start)/2;
        }
    }
}
