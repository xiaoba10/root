package leetcode62;

import java.util.Stack;

public class simplifyPath {
	
	public static void main(String[] args){
		System.out.println(simplifyPath.simplifyPath("/a/./b/../../c/"));
	}
	
	
	public static String simplifyPath(String path) {
		int len = path.length();
		if (len == 0)
			return path;
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < len) {
			if (path.charAt(i) == '/') {
			    while( i<len && path.charAt(i) == '/')
                        i++;
                i--;
				if( i+1 == len)
					i++;
				else if( path.charAt(i+1) == '.'){
					if( i+2 == len || path.charAt(i+2) == '/')
						i+=2;
					else if( path.charAt(i+2) == '.'){
						if( i+3 == len || path.charAt(i+3) == '/'){
							int j = 0;
							
							while( j<stack.size() )
								if(  stack.pop() == '/')
									break;
								j++;
							
							i+=3;
						}else{
							stack.push('/');
							stack.push('.');
							stack.push('.');
							i+=3;
							while (i < len) {
								if (path.charAt(i) == '/')
									break;
								else 
									stack.push(path.charAt(i));
								i++;
							}
						}
					}else{
						stack.push('/');
						stack.push('.');
						i+=2;
						while (i < len) {
							if (path.charAt(i) == '/')
								break;
							else 
								stack.push(path.charAt(i));
							i++;
						}
					
					}
						
				}else{
				    i++;
				    stack.push('/');
				    
					while (i < len) {   
						if (path.charAt(i) == '/')
							break;
						else 
							stack.push(path.charAt(i));
						i++;
					}
				}
			} else {
			    if( path.charAt(i) == '.'){
			        if( i+1 == len || path.charAt(i+1) == '/')
			            i+=2;
			        else if( i+2 == len || (path.charAt(i+1) == '.' && path.charAt(i+2) == '/'))
			            i+=3;
			    }else{
			        stack.push('/');
				while (i < len) {
					if (path.charAt(i) == '/')
						break;
					else 
						stack.push(path.charAt(i));
					i++;
				}
			    }
			    
				stack.push('/');
				while (i < len) {
					if (path.charAt(i) == '/')
						break;
					else 
						stack.push(path.charAt(i));
					i++;
				}
			}
			
		}
		len = stack.size();
		if( len == 0)
		    return new String("/");
		char[] result = new char[len];
		for (int j = len - 1; j >= 0; j--) {
			result[j] = stack.pop();
		}
		return String.valueOf(result);

	}
}
