package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		int flag = 0;
		int result = 0;
		System.out.println(x);
		do{
			int a = x%10;
			result = result*10 + a;
			System.out.println(a+" "+result+" "+" "+x);
			x = x/10;
			if((result > 214748364 && x!=0)||(result == 214748364 && x>6)||
					(result <-214748364 && x!=0)||(result == 214748364 && x>7))
				return 0;
		}while(x!=0);
		return result;
		
    }
	/*
	 * 1.求一个数字的回文数
	 * 2.注意的点就是int的范围需要控制，如果所求的数超过了int的范围，那么需要返回0；
	 * 3.算法就是一个一个取余。然后原数除以10
	 */
}
