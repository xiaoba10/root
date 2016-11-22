package leetcode;

public class rotate {
	public void rotate(int[][] matrix) {
        int len = matrix[0].length;
        if( len < 2)
        	return ;
        int time = len/2;
        for( int i = 0;i<time ;i++){
        	len-=2;
        	for( int j = i;j<len;j++){
        		int num = matrix[i][j];
        		matrix[i][j] = matrix[len-j][i];
        		matrix[len-j][i] = matrix[len-i][len-j];
        		matrix[len-i][len-j] = matrix[j][len-i];
        		matrix[j][len-i] = num;
        	}
        	
        	
        }
    }
}
