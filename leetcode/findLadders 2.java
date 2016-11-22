package leetcode101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findLadders {


	static List list = new ArrayList<List>();
	
	public static void main(String[] args){
		
		HashSet set = new HashSet();
		set.add("abe");
		set.add("awe");
		set.add("qwe");
		
		findLadders.findLadders("abc", "qwe", set);
		
	}
	
	public static List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
	
		List ans = new ArrayList<String>();
		ans.add(beginWord);
		String[] words = new String[wordList.length()];
		int i = 0 ;
		for( String str : wordList ){
			words[i] = str;
			i++;
		}
		helper(beginWord,endWord,wordList,ans);
		return list;
        
    }

    public static void helper(String beginWord,String endWord, String[] wordList,List ans){
    	
    	
    	for( int i = 0;i<ans.size();i++)
    		System.out.print(ans.get(i));

    	if( beginWord.equals(endWord) || OneDiff(beginWord,endWord)){
    		List ll = new ArrayList<String>();
    		ll.addAll(ans);
    		ll.add(endWord);
    		list.add(ll);
    	}

    	for( String str : wordList){

    		if( OneDiff(beginWord,str) ){
    			ans.add(str);
    			wordList.remove(str);
    			helper(str,endWord,wordList,ans);
    			wordList.add(str);
    		}
    	}
    	

    }

    public static boolean OneDiff(String word1,String word2){
    	int flag = 0;
    	for( int i = 0;i<word1.length();i++){

    		if( word1.charAt(i) == word2.charAt(i) )
    			continue;
    		else{
    			if( flag == 0)
    				flag =1;
    			else
    				return false;
    		}

    	}
    	return true;
    }
}
