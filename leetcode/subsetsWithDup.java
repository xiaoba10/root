package leetcode62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    List<List<Integer>> res = new ArrayList<>();
	int[] num;
	int len;

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		len = nums.length;
		num = nums;
		Arrays.sort(num);
		res.add(new ArrayList<>());
		sub(0,new ArrayList<>() );

        return res;
    }

    public void sub(int start,List<Integer> ans){
        int flag = 0;
    	for( int i = start;i<len;i++){
    		if( i > 0 && flag == 1 && num[i] == num[i-1])
    			continue;
    		ans.add(num[i]);
            flag = 1;
    	    res.add(new ArrayList<Integer>(ans));
    		sub(i+1,ans);
    		ans.remove(ans.size()-1);
    	}
    	return ;
    }
}
