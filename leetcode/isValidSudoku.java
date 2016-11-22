package leetcode;

import java.util.HashSet;


public class isValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		
		HashSet[] hashset = new HashSet[27];
		for( int i=0; i<27; i++)
			hashset[i] = new HashSet<Character>();
		for( int i = 0; i < 9; i++){
			for( int j = 0; j < 9; j++){
				char Char = board[i][j];
				if( Char == '.')
				    continue;
				if( hashset[i].contains(Char) || hashset[9+j].contains(Char) 
						|| hashset[18+(i/3)*3+j/3].contains(Char) )
					return false;
				else{
					hashset[i].add(Char);
					hashset[9+j].add(Char);
					hashset[18+(i/3)*3+j/3].add(Char);
				}
			}		
		}

		
		return true;
    }
	/*
	 * 1.求是否符合规则，第一次19＋8.8
	 * 2.利用为运算最快。99+
	 * int [] vset = new int [9];
    int [] hset = new int [9];
    int [] bckt = new int [9];
    int idx = 0;
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] != '.') {
                idx = 1 << (board[i][j] - '0') ;
                if ((hset[i] & idx) > 0 ||
                    (vset[j] & idx) > 0 ||
                    (bckt[(i / 3) * 3 + j / 3] & idx) > 0) return false;
                hset[i] |= idx;
                vset[j] |= idx;
                bckt[(i / 3) * 3 + j / 3] |= idx;
            }
        }
    }
    return true;
	 * 
	 */
}
