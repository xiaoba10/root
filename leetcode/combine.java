package leetcode62;

import java.util.ArrayList;
import java.util.List;

public class combine {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
public List<List<Integer>> combine(int n, int k) {
    Con(n,k,0,new ArrayList<Integer>());
    return res;
}
public void Con( int n,int k,int start,List<Integer> ans){
	if( ans.size() == k){
		res.add(new ArrayList<Integer>(ans));
		return ;
	} 
	
	for( int i = start;i<n;i++){
		ans.add(i+1);
		Con(n,k,i+1,ans);
		ans.remove(ans.size()-1);
	}
	return ;
}}
