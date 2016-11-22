package leetcode;

import java.util.HashMap;

public class romanToInt {
	public int romanToInt(String s) {
		int len = s.length(), result = 0;
		if( len<1 )
			return 0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		result = map.get(s.charAt(len-1));
		int cur = result;
		for( int i = len-2; i>=0; i--){
			int num = map.get(s.charAt(i));
			if( num<cur )
				result -= num;
			else
				result += num;
			cur = num;
		}
		return result;
		
		
		
		
//		int len = s.length() , i = 0;
//		int result = 0;
//		while( i < s.length() ){
//			if( s.charAt(i) == 'M'){
//				result +=1000;
//				i++;
//			}else if( s.charAt(i) == 'C'){
//				if( i+1<len && (s.charAt(i+1) == 'M' ||s.charAt(i+1) == 'D')){
//					result-=100;
//				}
//				else
//					result+=100;
//				i++;
//			}else if( s.charAt(i) == 'D'){
//				if( i+1<len && s.charAt(i+1) == 'M' ){
//					result-=500;
//				}
//				else
//					result+=500;
//				i++;
//			}else if( s.charAt(i) == 'X'){
//				if( i+1<len && (s.charAt(i+1) == 'L' ||s.charAt(i+1) == 'C')){
//					result-=10;
//				}
//				else
//					result+=10;
//				i++;
//			}else if( s.charAt(i) == 'L'){
//				if( i+1<len && s.charAt(i+1) == 'C' ){
//					result-=50;
//				}
//				else
//					result+=50;
//				i++;
//			}else if( s.charAt(i) == 'I'){
//				if( i+1<len && (s.charAt(i+1) == 'V' ||s.charAt(i+1) == 'X')){
//					result-=1;
//				}
//				else
//					result+=1;
//				i++;
//			}else if( s.charAt(i) == 'V'){
//				if( i+1<len && s.charAt(i+1) == 'X' ){
//					result-=5;
//				}
//				else
//					result+=5;
//				i++;
//			}
//		}
			
//		return result;
        
    }
	/*
	 * 1.将罗马数字转换成数字
	 * 2.走一遍就好，但是每次都要进行好多if－else的判断，而且代码量不少，感觉并不是最优，击败59的用户
	 * 3.discuss里面发现，判断过于复杂，从最后一位开始判断，如果新增一位比之前的和都要大，那么相加，否则相减。另外，可以使用map
	 * 或者使用一个数组存储。
	 * 4.修改之后虽然代码变得很好看，然而却只击败了36的用户，增加多余的数据结构会使得代码速度明显变慢。
	 */
}
