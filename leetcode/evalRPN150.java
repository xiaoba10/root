package Package126;

import java.util.Stack;

/**
 * Created by wangzunwen on 2016/11/18.
 */


public class evalRPN150 {

    public int evalRPN(String[] tokens) {


        Stack<Integer> stack = new Stack<Integer>();

    	int len = tokens.length;
    	if( len == 0)
    		return 0;
    	int pos = len;
    	boolean[] exit = new boolean[len];
    	for( int i = 0 ; i < len ; i ++){
    		if( tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/"){
    			pos = i;
    			exit[pos] = true;
    			break;
    		}
    	}
    	int result = Integer.valueOf(tokens[pos-1]);
    	exit[pos-1] = true;
    	int num = pos-2;
    	while( num >= 0){

    		for( int i = num;i>=0;i--){
    			if( exit[i] == false){
    				num = i;
    				break;
    			}
    		}
    		int num1 = Integer.valueOf(tokens[num]);
    		if( tokens[pos] == "+")
    			result = result+num1;
    		else if( tokens[pos] == "-")
    			result = num1-result;
    		else if( tokens[pos] == "*")
    			result = num1*result;
    		else if( tokens[pos] == "/")
    			result = num1/result;
    		for( int i = pos+1 ; i < len ; i ++){
    			if( tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/"){
    				pos = i;
    				exit[pos] = true;
    				break;
    			}
    			if( i == len-1)
    				num = -1;
			}
    		num = pos-1;
    	}
    	return result;

    }
}
