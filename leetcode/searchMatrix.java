package leetcode62;

public class searchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {


		int len1 = matrix.length;
		if( len1 == 0 )
			return false;
		int len2 = matrix[0].length;
		if( len2 == 0 || target < matrix[0][0])
			return false;
		int start = 0,end = len1*len2-1,flag ;
		while( start <= end ){
			flag = (start+end)/2;
			int num = matrix[flag/len2][flag%len2];
			if( target > num)
				start = flag+1;
			else if ( target < num)
				end = flag-1;
			else
				return true;
		}
		return false;
		


    
    }
}
