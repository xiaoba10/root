package Package126;

import java.util.*;

/**
 * Created by wangzunwen on 2016/11/6.
 */
public class solve {

   public void solve(char[][] board) {



       int row = board.length;
       if( row < 2 )
           return ;
       int col = board[0].length;
       if( col < 2 )
           return ;
       Queue<Integer> queue = new LinkedList<Integer>();
       for( int i = 0;i<col;i++){
           if( board[0][i] == 'O' )
               queue.add(i);
           if( board[row-1][i] == 'O')
               queue.add((row-1)*col+i);
       }
       for( int i = 0;i < row ;i++){
           if( board[i][col-1] == 'O')
               queue.add(i*col+col-1);
           if( board[i][0] == 'O')
               queue.add(i*col);
       }
       while( !queue.isEmpty() ){
           int num = queue.poll();
           int x = num/col,y = num%col;
           if( board[x][y] != 'O')
               continue;
           board[x][y] = 'o';
           if( x-1>=0 &&  board[x-1][y] == 'O')
               queue.add(num-col);
           if( x+1<row && board[x+1][y] == 'O')
               queue.add(num+col);
           if( y-1>=0 && board[x][y-1] == 'O')
               queue.add(num-1);
           if( y+1<col && board[x][y+1] == 'O')
               queue.add(num+1);
       }

       for( int i = 0;i<row;i++){
           for( int j = 0;j<col;j++){
               if( board[i][j] == 'O')
                   board[i][j] = 'X';
               else if( board[i][j] == 'o')
                   board[i][j] = 'O';
           }
       }



       return ;

   }


    



}
