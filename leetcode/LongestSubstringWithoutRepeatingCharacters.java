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
 * 1.�����⣬�����һ���ַ����У����ֵĲ��ظ��ַ�������󳤶�
 * 2.��Ҫ��o��n�����㷨������ָ�룬���δ�ǰ���󣬲��Ҹ����ַ���ASCII��ת�����ж��ַ��Ƿ���֮ǰ���ֹ�
 * 3.�ַ���ASCII��ת����(1)�ַ�תASCII: (int)s   (sΪһ��char��
 *   				 (2)ASCIIת�ַ�: (char)Integer.parseInt(chars[i])
 */





