package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int result = 0,i = 0, j = 0 ,num = 0;
		boolean exist[] = new boolean[256]; 
		char aa[] = new char[len];
		aa = s.toCharArray();
		while(j<len&&i<len){
			int num1 = (int) aa[j];
			//System.out.println(num1);
			if( exist[num1] == false){
				exist[num1] = true;
				j++;
				num++;
			}
			else{
				num1 = (int)aa[i];
				i++;
				
				exist[num1] = false;
				result = result>num?result:num;
				num--;
			}
		}
		result = result>num?result:num;
		return result;
        
    }
}
/*
 * 1.第三题，求的是一个字符串中，出现的不重复字符串的最大长度
 * 2.主要是o（n）的算法，两个指针，依次从前到后，并且根据字符与ASCII的转换，判断字符是否在之前出现过
 * 3.字符与ASCII的转换：(1)字符转ASCII: (int)s   (s为一个char）
 *   				 (2)ASCII转字符: (char)Integer.parseInt(chars[i])
 */





