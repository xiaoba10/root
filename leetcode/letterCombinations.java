package leetcode;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();        
        char[][] target = {{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},
        		{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        char[] ans = new char[digits.length()];
        System.out.println(target[digits.charAt(0)-'1'].length+" "+digits.length());
        getans(target,digits,0,ans,result);
        
        return result;
        
    }
	public void getans(char[][] target,String digits,int pos,char[] ans,List<String> result){
		if( pos == digits.length() ){
			System.out.println(ans);
			result.add(new String(ans));
			return ;
		}
		for( int i=0; i<target[digits.charAt(pos)-'1'].length; i++){
			ans[pos] = target[digits.charAt(pos)-'1'][i];
			getans(target,digits,pos+1,ans,result);
		}
		
	}
	/*
	 * 1.�����оŹ������������ֵ����
	 * 2.���˺þã�����������ƺ�û��ʲô�ر�򵥵ķ��������ǵݹ飬Ȼ����46+54
	 * 3.�򵥵Ľ����������Ľṹ�����н���ġ�
	 */
	
}
