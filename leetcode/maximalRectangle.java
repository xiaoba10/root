package leetcode62;

public class maximalRectangle {
	public int maximalRectangle(char[][] matrix) {
		int len1 = matrix.length;
		if( len1 == 0)
			return 0;
		int len2 = matrix[0].length;
		if( len2 == 0)
			return 0;
		int result = 0;
		int[][] heights = new int[len1][len2];
		for( int i = 0;i<len2;i++){
			if( matrix[0][i] == '1')
				heights[0][i] = 1;
		}
		for( int i = 1;i < len1;i++){
			for( int j = 0;j<len2;j++){
				if( matrix[i][j] == '1')
					heights[i][j] = heights[i-1][j]+1;
			}
		}
        for( int i = 0;i<len1;i++){
        	result = Math.max(result,largestRectangleArea(heights[i]));
        }
        return result;



    }
    public int largestRectangleArea(int[] heights) {


		int len = heights.length;
		int result = 0;
		if( len == 0)
			return 0;

		int[] left = new int[len];
		int[] right = new int[len];

		left[0] = 0;
		for( int i = 1;i<len;i++){
			int CurLeft = i-1;
			while( CurLeft >= 0 && heights[CurLeft]>=heights[i]){
				CurLeft = left[CurLeft]-1;
			}
			left[i] = CurLeft+1;
		}
		right[len-1] = len-1;
		for( int i = len-2;i>=0;i--){
			int CurRight = i+1;
			while( CurRight<len && heights[CurRight]>=heights[i])
				CurRight = right[CurRight]+1;
			right[i] = CurRight-1;
		}
		for( int i = 0;i<len;i++){
			result = Math.max(result,(right[i]-left[i]+1)*(heights[i]));
		}
    	return result;
    }
}
