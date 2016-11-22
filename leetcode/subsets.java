package leetcode62;

import java.util.ArrayList;
import java.util.List;

public class subsets {

	List<List<Integer>> res = new ArrayList<>();
	int[] num;
	int len;

	public List<List<Integer>> subsets(int[] nums) {
		len = nums.length;
		num = nums;
		res.add(new ArrayList<>());
		sub(0,new ArrayList<>() );

        return res;
    }

    public void sub(int start,List<Integer> ans){

    	for( int i = start;i<len;i++){
    		ans.add(num[i]);
    		res.add(new ArrayList<Integer>(ans));
    		sub(i+1,ans);
    		ans.remove(ans.size()-1);
    	}
    	return ;
    }
}
