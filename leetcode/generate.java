package leetcode101;

import java.util.ArrayList;
import java.util.List;

public class generate {


	List list = new ArrayList<List<Integer>>();

	public List<List<Integer>> generate(int numRows) {

		for( int i = 0;i<numRows;i++)
			help(i+1);
		
		return list;
    }

    public void help(int num){

    	List ans = new ArrayList<Integer>();

    	if( num == 1){
    		ans.add(1);
    		list.add(ans);
    		return ;
    	}else if( num == 2 ){
    		ans.add(1);
    		ans.add(1);
    		list.add(ans);
    		return ;
    	}
    	ArrayList<Integer> last = (ArrayList<Integer>) list.get(num-2);
    	ans.add(1);
    	int a = last.get(0);
    	int b = last.get(1);
    	for( int i = 2;i<last.size();i++){
    		ans.add(a+b);
    		a = b;
    		b = last.get(i);
    	}
    	ans.add(a+b);
    	ans.add(1);
    	list.add(ans);
    }
}
