package leetcode;

import java.util.ArrayList;
import java.util.List;

public class solveNQueens {
	
	public static void main(String[] args){
		
		solveNQueens aa = new solveNQueens();
		aa.solveNQueens(4);
		
		
		
	}
	public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        int[] pos = new int[n];
        putQueen(pos,0,result);
        return result;
    }
	public void putQueen(int[] pos,int num,List<List<String>> result){
		if( num == pos.length ){
			List<String> res = new ArrayList<String>();
			char[] ans = new char[pos.length];
			for( int j =0;j<pos.length ;j++)
					ans[j] = '.';
			for( int i = 0;i<pos.length; i++ ){
				ans[pos[i]] = 'Q';
				res.add(new String(ans));
				ans[pos[i]] = '.';
			}
			result.add(res);
		}
		int[] exi = new int[pos.length];
		for( int i = 0;i<num;i++){
			exi[pos[i]] = 1;
			if( pos[i]-(num-i) >= 0)
				exi[pos[i]-(num-i)] = 1;
			if( pos[i]+num-i < pos.length)
				exi[pos[i]+num-i] = 1;
		}
		
		for( int i = 0; i<pos.length;i++){
			if( exi[i] == 0){
			    pos[num] = i;
				putQueen(pos,num+1,result);
			}
		}	
	}
}
