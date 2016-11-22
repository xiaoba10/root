package leetcode;

import java.util.Arrays;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		int len = s.length(), id = 0;
		if( numRows < 2)
			return s;
        String result = new String();
        for( int i=0; i<numRows; i++){
        	id = i;
        	while( id<len ){
        		result += s.charAt(id);
        		id += 2*numRows -2;
        		if( i>0 && i<numRows-1 && id-2*i < len)
        			result += s.charAt(id-2*i);
        	}
        }
        System.out.println(result);
        return result;
	}
}
/*
	1.这道题就是纯属找规律
*/