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
	 * 1.����������ת��������
	 * 2.��һ��ͺã�����ÿ�ζ�Ҫ���кö�if��else���жϣ����Ҵ��������٣��о����������ţ�����59���û�
	 * 3.discuss���淢�֣��жϹ��ڸ��ӣ������һλ��ʼ�жϣ��������һλ��֮ǰ�ĺͶ�Ҫ����ô��ӣ�������������⣬����ʹ��map
	 * ����ʹ��һ������洢��
	 * 4.�޸�֮����Ȼ�����úܺÿ���Ȼ��ȴֻ������36���û������Ӷ�������ݽṹ��ʹ�ô����ٶ����Ա�����
	 */
}
