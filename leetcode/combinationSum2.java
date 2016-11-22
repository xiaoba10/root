package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        getResult(candidates,target,0,result,new int[candidates.length],0);
        return result;
    }
	
	public void getResult( int[] candidates, int target,int pos, List<List<Integer>> result,int[] ans,int num){
	    for( int i = pos;i <candidates.length; i++){
	       if( target == candidates[i]){
	            List<Integer> aa = new ArrayList<Integer>();
	            for( int ii =0; ii<num; ii++)
	                aa.add(ans[ii]);
	            aa.add(candidates[i]);
                result.add(aa);
	            return;
	       }
	       else if(target > candidates[i]){
				ans[num] = candidates[i];
				getResult(candidates,target-candidates[i],i+1,result,ans,num+1);
				while( i+1< candidates.length && candidates[i] == candidates[i+1])
				    i++;
			
		}else
		    return ;
	   }
}
	/*
	 * 1.这道题和conbinationSum很相似，只不过不能使用重复的数字。
	 * 2.100
	 */
}
