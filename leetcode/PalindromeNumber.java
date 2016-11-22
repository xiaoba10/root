package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x<0)	return false;
        int result=0,mid=0,a=x;
        while(a!=0){
        	mid=a%10;
        	result=result*10+mid;
        	a=a/10;
        }
        System.out.println(result);
        if(x==result)
        	return true;
        else
        	return false;
    }
	/*
	 * 1.判断一个数字是否是回文数
	 * 2.比较简单，注意的就是负数都不是
	 */
}
