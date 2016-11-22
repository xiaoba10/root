package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class permute {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		permute.permute(a);

	}

	public static  List<List<Integer>> permute(int[] nums) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    List<Integer> element = new ArrayList<Integer>();
	    getResult(result, element, nums, 0);
	    return result;
	}

	private static void getResult(List<List<Integer>> result, List<Integer> element, int[] nums, int n){
	    if(n==nums.length){
	        result.add(element);
	        return;
	    }

	    int size = element.size();
	    for(int i = 0; i <= size; i++){
	        List<Integer> temp = new ArrayList<Integer>(element); 
	        temp.add(i,nums[n]);
	        getResult(result, temp, nums, n+1);
	    }
	    return;
	}

}
