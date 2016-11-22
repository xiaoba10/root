package leetcode62;

import java.util.ArrayList;
import java.util.List;

public class grayCode {
	public List<Integer> grayCode(int n) {
		List result = new ArrayList<Integer>();
		if( n == 0){
			result.add(0);
			return result;
		}else if ( n == 1){
			result.add(0);
			result.add(1);
			return result;
		}else 	
			result.addAll(grayCode(n-1));


		int max = 1;
		for( int i = 1;i<n;i++){
			max*=2;
		}
		int size = result.size();
		
		for( int i = 0;i<size;i++){
			result.add((int)result.get(max-i)+max);
		}		
		return result;
	}
        
}
