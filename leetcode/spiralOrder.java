package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if( matrix.length == 0)
            return result;
        int left = 0,right = matrix[0].length-1;
        int num = matrix.length>matrix[0].length?matrix[0].length:matrix.length;
        num = num%2 == 0?num/2:num/2+1;
        for(int circle = 0 ;circle<num;circle++){
            if( circle == matrix.length-circle-1){
                for( int i = left;i<=right;i++)
        		    result.add(matrix[circle][i]);
        		return result;
            }
            if( left == right){
                for( int i = circle;i<matrix.length-circle;i++)
        		    result.add(matrix[i][right]);
        		return result;
            }
        	for( int i = left;i<=right;i++)
        		result.add(matrix[circle][i]);
        	for( int i = circle+1;i<matrix.length-circle;i++)
        		result.add(matrix[i][right]);
        	for( int i = right-1;i>=left;i--)
        		result.add(matrix[matrix.length-circle-1][i]);
        	for( int i = matrix.length-circle-2;i>circle;i--)
        		result.add(matrix[i][left]);
        	left++;
        	right--;
        }
        return result;
    }	
}
