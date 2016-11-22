package leetcode62;

import java.util.ArrayList;
import java.util.List;


public class fullJustify {
	public List<String> fullJustify(String[] words, int maxWidth) {
        
		List<String> result = new ArrayList<String>();
		int num = 0, j = 0 ,space = 0,pos = 0,more = 0;
		int[] ans = new int[maxWidth+1];
		char[] Ch = new char[maxWidth];
		int i = 0;
        while(i<words.length){
        	j = 0;
        	num = 0;
       		while( i < words.length && num+words[i].length()<=maxWidth	){
       			num+=words[i].length();
       			ans[j] = i;
       			i++;
       			j++;
       			num++;
       		}
       		pos = 0;
       		if( i == words.length){
       		    space = 1;
       		    more = maxWidth-num;
       		}else if( j == 1){
       		    space = maxWidth-num+j;
       		    more = 0;
       		}else{
       		    space = (maxWidth-num+j)/(j-1);
       		    more = (maxWidth-num+j)%(j-1);
       		}
       		for( int k = 0;k<j;k++){
       			for( int a = 0;a<words[ans[k]].length();a++,pos++)
       				Ch[pos] = words[ans[k]].charAt(a);
       			for( int a = 0;a<space && pos < maxWidth;a++,pos++)
       				Ch[pos] = ' ';
       			if( more > 0 && pos < maxWidth && i!= words.length){
       				Ch[pos] = ' ';
       				more--;
       				pos++;
       			}
       			if( i == words.length && k == j-1){
       			    for( int a = 0;a<more;a++,pos++)
       				    Ch[pos] = ' ';
       			}
       			
       		}
       		result.add(String.valueOf(Ch));

        }
        
        return result;
    }
}
