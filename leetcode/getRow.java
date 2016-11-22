package leetcode101;

import java.util.ArrayList;
import java.util.List;

public class getRow {
	public List<Integer> getRow(int rowIndex) {

		List ans = new ArrayList<Integer>();

		if( rowIndex == 0){
		    ans.add(1);
			return ans;
		}
		else if( rowIndex == 1){
			ans.add(1);
			ans.add(1);
			return ans;
		}	

		int[] result = new int[rowIndex+1];

		result[0] = 1;
		result[1] = 1;
		for( int i = 2;i<rowIndex+1;i++){
			int a = result[0];
			int b = result[1];
			result[i] = 1;
			for( int j = 1;j<i;j++){
				result[j] = a+b;
				a = b;
				b = result[j+1];

			}
		}
		for( int i = 0 ;i<rowIndex+1;i++)
			ans.add(result[i]);


		return ans;
        
    }
}
