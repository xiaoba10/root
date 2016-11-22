package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class longestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String result = "";
		int len = strs.length;
		if( len == 0)
			return result;
		int j = 0;
		while(true){
			if( j>= strs[0].length())
				return result;
			for( int i=0; i<len ; i++){
				if( j>= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j))
					return result;
			}
			result += strs[0].charAt(j);
			j++;
		}
		
    }
	/*
	 * 1.���ַ����������󹫹�ǰ׺
	 * 2.40+23
	 * 3.����һ�����ĳ���
	 * 	if(strs == null || strs.length == 0)    return "";
    	String pre = strs[0];
    	int i = 1;
    	while(i < strs.length){
        	while(strs[i].indexOf(pre) != 0)
            	pre = pre.substring(0,pre.length()-1);
        	i++;
    	}
    	return pre;
	 * ���������indexof������ String �����ڵ�һ�γ������ַ������ַ�λ�á� 
	 */
}
