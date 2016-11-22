package leetcode;

import java.util.Stack;

public class longestValidParentheses {
	public int longestValidParentheses(String s) {

		
		int result = 0;
		int len = s.length();
		if( len<2 )
			return 0;
		int i = 0,max = len -1;
		
		while( i <= max ){
			while( i < len && s.charAt(i) == ')')
				i++;
			while( max >= 0 && s.charAt(max) == '(' )
		        max--;
			int j = i, k = 0,ans = 0,flag = i;
			while( j <= max ){
				if( s.charAt(j) == '('){
					k++;
				}else if( s.charAt(j) == ')' && k > 0){
					k--;
					ans++;
				}else{
				    while( j<=max && s.charAt(j) == ')'){
				        j++;
				    }
				    i = j-1;
				    break;
				}
				if( k == 0 ){
				    flag = j;
					result = result>ans?result:ans;
				}
				j++;
			}
			i = flag +1;
			
			
			int last = max;
			ans = 0;
			k = 0;
			flag = max;
			while(last>=0){
			    if( s.charAt(last) == ')')
			        k++;
			    else if( s.charAt(last) == '(' && k>0 ){
			        k--;
			        ans++;
			    }else {
			        while( last>=0 && s.charAt(last) == '('){
				        last--;
				    }
				    max = last+1;
				    break;
				}
				if( k == 0 ){
				    flag = last;
					result = result>ans?result:ans;
				}
				last--;
			}
			max = flag-1;

			
			
			
		}
		return result*2;
	}
}

/*
 * 1.刚开始题意理解不透彻 2.之后应该是正确解答，但是超时 
 * 3.修改之后13＋6并不理想
 * 4.运用stack可以有效提高，36+18
 * public int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }
 */
