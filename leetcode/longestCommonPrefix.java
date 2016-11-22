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
	 * 1.求字符串数组的最大公共前缀
	 * 2.40+23
	 * 3.看到一个最快的程序
	 * 	if(strs == null || strs.length == 0)    return "";
    	String pre = strs[0];
    	int i = 1;
    	while(i < strs.length){
        	while(strs[i].indexOf(pre) != 0)
            	pre = pre.substring(0,pre.length()-1);
        	i++;
    	}
    	return pre;
	 * 这个是利用indexof即返回 String 对象内第一次出现子字符串的字符位置。 
	 */
}
