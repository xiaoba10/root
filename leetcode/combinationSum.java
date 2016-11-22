package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        getResult(candidates,target,0,result,new ArrayList<Integer>());
        return result;
    }
	
	public void getResult( int[] candidates, int target,int pos, List<List<Integer>> result,List<Integer> ans){
	    for( int i = pos;i <candidates.length; i++){
	       if( target == candidates[i]){
	            ans.add(candidates[i]);
                result.add(new ArrayList<Integer>(ans));
                ans.remove(ans.size()-1);
	            return;
	       }
	       else if(target > candidates[i]){
				ans.add(candidates[i]);
				getResult(candidates,target-candidates[i],i,result,ans);
				ans.remove(ans.size()-1);
		}else
		    return ;
	   }
	}
	/*
	 * 1.给出一个数组以及一个目标数，求出用数组中的数相加等于目标数的所有结果（数组中的数可以重复）；
	 * 2.78+21
	 * 
	 * 下面是100％，利用数组即可
	 * public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        getResult(candidates,target,0,result,new int[target],0);
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
				getResult(candidates,target-candidates[i],i,result,ans,num+1);
		}else
		    return ;
	   }
}
	 */
	
	
	
}
