package leetcode;

import java.math.BigInteger;

public class multiply {

	public static void main(String[] args) {
		String aa = "12313122131231242353424234234";
		System.out.println(aa + "  " + Integer.MAX_VALUE);
		int ww = 1111;
		aa = String.valueOf(ww);

		System.out.println(" ===== ");

		System.out.println(multiply.multiply("12313","345346"));
	}

	public static String multiply(String num1, String num2) {
		int len1 = num1.length() ,len2 = num2.length();
		int[] Num1 = ToInt(num1);
		int[] Num2 = ToInt(num2);
		int[] res = new int[len1+len2];
		
		
		for( int i =0;i<num1.length();i++)
			System.out.print(Num1[i]);
		System.out.println("");
		for( int i =len1-1; i>=0;i--){
			add(Num1[i],Num2,res,i);
		}
		for( int i = 0 ;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
		for( int i = len1+len2-1,b = 0;i>=0;i--){
			int a = res[i] + b;
			res[i] = a%10;
			b = a/10;
		}
		StringBuilder result = new StringBuilder();
		
		for(int i = 0;i< res.length;i++){
			if( res[i] != 0 ){
				while( i<res.length){
					result.append(res[i]);
					i++;
				}
			}
		}
		if( result.length() == 0)
			return "0";
		return result.toString();
		
		
	}
	
	public static void add(int num,int[] num1,int[] res,int pos){
		for( int i =num1.length-1 ; i >=0;i--){
			res[i+pos+1] += num*num1[i];
		}
		
	}
	
	
	public static int[] ToInt(String num){
		int[] res = new int[num.length()];
		for( int i =0;i<num.length(); i++){
			res[i] = num.charAt(i)-'0';
		}
		return res;
	}
}
