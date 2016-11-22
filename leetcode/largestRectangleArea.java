package leetcode62;

public class largestRectangleArea {
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
