package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {
	public static void main(String[] args){
		String[] tt = {"aa","az","bc","ccc","bb"};
		for(String a: tt)
			System.out.println(a);
		Arrays.sort(tt);
		
		for(String a: tt)
			System.out.println(a);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		int len = strs.length;
		for( String s : strs){
			char[] ss = s.toCharArray();
			Arrays.sort(ss);
			String sort = new String(ss);
			if( map.containsKey(sort) ){
				map.get(sort).add(s);                         
			}else{
				List<String> s2 = new ArrayList<String>();
				s2.add(s);
				map.put(sort, s2);
				result.add(s2);
			}
		}
		return result;

	}
}
