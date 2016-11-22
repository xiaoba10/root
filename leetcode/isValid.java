package leetcode;

import java.util.Stack;

public class isValid {
	public boolean isValid(String s) {
		if(s.length()%2!=0)
			return false;
		Stack stack = new Stack();
		int i = 0;
		while(i<s.length()){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if(stack.empty())
				return false;
			else if(s.charAt(i) == ')'){
				if( (Character)stack.pop() != '(')
					return false;
			}else if(s.charAt(i) == ']'){
				if(  (Character)stack.pop() != '[')
					return false;
			}else if(s.charAt(i) == '}'){
				if(  (Character)stack.pop() != '{')
					return false;
			}else
				return false;
			i++;
		}
		if(stack.empty())
			return true;
		else
			return false;
        
    }
	/*
	 * 1.求括号是否匹配
	 * 2.54+44，利用栈很简单。
	 */
}
