package leetcode;

public class generateMatrix {
	public int[][] generateMatrix(int n) {
        int[][]	result = new int[n][n];
        int num = n/2+1;
        int left = 0,right = n-1;
        int ans = 1;
        for ( int circle = 0;circle < num;circle++){
        	for( int i = left;i<=right;i++){
        		result[circle][i] = ans;
        		ans++;
        	}
        	for( int i = left+1;i<=right;i++){
        		result[i][n-circle-1] = ans;
        		ans++;
        	}
        	for( int i =right-1;i>=left;i--){
        		result[n-circle-1][i] = ans;
        		ans++;
        	}
        	for( int i = right-1;i>left;i--){
        		result[i][circle] = ans;
        		ans++;
        	}
        	left++;
        	right--;
        }
     
        return result;
    }
}
