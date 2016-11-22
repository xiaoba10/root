package leetcode;

public class divide {
	public int divide(int dividend, int divisor) {
	        int result = 0, flag = 0, div , num , flag1 = 0;
			if( dividend>0 && divisor<0 ){
				flag = 1;
				divisor = -divisor;
			}
			if(dividend<0 && divisor>0){
				flag = 1;
				dividend = -dividend;
			}
			if(dividend<0 && divisor<0){
				dividend = -dividend;
				divisor = -divisor;
			}
			
			if( dividend < 0 ){
			    dividend = dividend+divisor;
			    flag1 = 1;
			    dividend = -dividend;
			}
			System.out.println(result+" "+dividend+" "+ divisor);
			div = divisor;
			if( dividend<divisor || divisor<0){
			    if( flag1 == 1)
			        result++;
			    if( flag == 1 )
			        return -result;
			    else 
			        return result;
			}
			if( divisor<<1 < dividend && divisor<<1 >0){
				result = 1;
				divisor = divisor<<1;
			}
			else if( dividend >= divisor ){
			    while(dividend >= divisor){
			        dividend = dividend - divisor;
			        result++;
			    }
			    if( flag1 == 1)
			        result++;
			    if( flag == 1 )
			        return -result;
			    else 
			        return result;
			}
			else if( flag1 == 1){
			    System.out.println(result+" "+dividend+" "+ divisor);
			    result++;
			    if( flag == 1 )
			        return -result;
			    else 
			        return result;
			}
			
			System.out.println(result+" "+dividend+" "+ divisor);
			if( dividend - divisor <= 0)
					return result++;
				while(true){
					if( divisor<<1 < dividend && divisor<<1 >0){
						result = result << 1 ;
						divisor = divisor << 1;
					}
					else {
						dividend = dividend - divisor;
						divisor = divisor >> 1;
						result = result << 1;
						num = result >> 1;
						break;
					}
				}
				System.out.println(result+" "+dividend+" "+ divisor);
			while(true){
				if( dividend >= divisor){
				    result = result+num;
				    dividend = dividend - divisor;
				    divisor = divisor >> 1;
				}else
				    divisor  = divisor >> 1;
				num = num >> 1;
				if(divisor < div || result == Integer.MAX_VALUE)
					break;
			}
			System.out.println(result+" "+dividend+" "+ div+" "+flag1);
			if( flag1 == 1 && result == Integer.MAX_VALUE && flag == 1)
			    return Integer.MIN_VALUE;
			else if(flag1 == 1 && result == Integer.MAX_VALUE && flag == 0)
			    return Integer.MAX_VALUE;
			if( flag1 == 1)
			    result++;
			if( flag == 1 )
			    return -result;
			
			return result;
		
		
		
		
		
//		int result = 0, flag = 0;
//		if( divisor == 1)
//            return dividend;
//        else if(divisor == -1)
//            return -dividend;
//		if(dividend>0 && divisor<0){
//			flag = 1;
//			divisor = -divisor;
//		}
//		if(dividend<0 && divisor>0){
//			flag = 1;
//			dividend = -dividend;
//		}
//		if(dividend<0 && divisor<0){
//			dividend = -dividend;
//			divisor = -divisor;
//		}
//		while(true){
//			if(dividend-divisor>0){
//				result++;
//				dividend = dividend - divisor;
//			}
//			else
//				break;
//			if(result == Integer.MAX_VALUE)
//				break;
//		}
//		if( flag == 1)
//			return -result;
//        return result;
    }
	/*
	 * 1.求两个数的商，要求不能用乘，除，取余
	 * 2.第一次超时；
	 * 3.第二次用了位运算，速度特别慢
	 * 4.应该将int转变成long，然后在做这个运算就会省去很多便捷标间的判断。
	 */
}
