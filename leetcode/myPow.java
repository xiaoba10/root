package leetcode;

import java.math.BigDecimal;

public class myPow {
	
	public static void main(String[] args){
		double tt = 2341.111;
		int count = 0;
		System.out.println(tt%0.1);

		
		
	}
	
	
	public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            return 1/(myPow(x, Integer.MAX_VALUE)*x);
        }
		if( n == 0)
			return 1;
		if( n < 0 )
			return 1/myPow(x,-n);
		return n%2 == 0? myPow(x*x,n/2):x*myPow(x,n-1);
	}
}
