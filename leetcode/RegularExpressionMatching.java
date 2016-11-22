package leetcode;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
		if (p.isEmpty()) {
	        return s.isEmpty();
	    }

	    if (p.length() == 1 || p.charAt(1) != '*') {
	        if (s.isEmpty() || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))) {
	            return false;
	        } else {
	            return isMatch(s.substring(1), p.substring(1));
	        }
	    }

	    //P.length() >=2
	    while (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {  
	        if (isMatch(s, p.substring(2))) { 
	            return true;                     
	        }                                    
	        s = s.substring(1);
	    }

	    return isMatch(s, p.substring(2));
//        int len1 = s.length(), len2 = p.length();
//        int i = 0, j = 0 , hard_pos = 0, pos = 0, hard_now = 0 , same1 = 0, same2 = 0, _pos = 0;
//        char flag = 0;
//        int[] hard = new int[len1];
//        while(( i<len1 && j<len2)||( i != len1 && j == len2 && hard_now != hard_pos ) ){
//        	if( i != len1 && j == len2 && hard_now != hard_pos ){
//        		j = pos;
//				if(hard_now >= hard_pos)
//					return false;
//				i = hard[ hard_now];
//				hard_now++;
//        	}
//        	if(s.charAt(i) == p.charAt(j)){
//        		i++;
//        		j++;
//        	}//一样的时候
//        	else{
//        		if(p.charAt(j) == '*' ){
//        			if( s.charAt(i) != s.charAt(i-1))
//        				j++;
//        			else{
//        				flag = s.charAt(i);
//        				same1 = same2 = 0;
//        				while(i<len1 && s.charAt(i) == s.charAt(i-1) ){
//        					i++;
//        					same1++;
//        				}
//        				int k = j-1 ;
//        				j++;
//        				while( j < len2 && p.charAt(j) == p.charAt(k) ){
//        					j++;
//        					same2++;
//        				}
//        				if( same1 < same2)
//        					return false;
//        			}
//        		}//出现＊的时候
//        		else if( p.charAt(j) == '.'){
//        			if( j+1 < len2 && p.charAt(j+1) != '*'){
//        				i++;
//        				j++;
//        			}
//        			else if( j+1 == len2)
//        				return true;
//        			else{
//        				int k = i;
//        				j += 2;
//        				if( j>=len2 )
//        					return true;
//        				pos = j;
//        				hard_pos = 0;
//        				while( k<len1){
//        					if( p.charAt(j) == s.charAt(k)){
//        						hard[hard_pos] = k;
//        						hard_pos++;
//        					}
//        					k++;
//        				}
//        				i = hard[0];
//        			}//出现.*的情况。
//        			
//        		}//出现.的时候
//        		else{
//        			if( j+1 < len2 && p.charAt(j+1) == '*')
//        				j +=2;
//        			else if( hard_pos > 0){
//        				j = pos;
//        				if(hard_now >= hard_pos)
//        					return false;
//        				i = hard[ hard_now];
//        				hard_now++;
//        			}else if(s.charAt(i) == flag){
//        				
//        			}
//        			else
//        				return false;
//        		}//不一样的时候
//        		
//        	}
//        }
//        if(i == len1 && j == len2)
//        	return true;
//        else
//        	return false;
	}
 }
/*
 * 1.求正则表达式
 * 2.递归很方便，但是不容易想出来，刚开始写的是直接循环判断，但是需要注意的点非常多
 * 3.还有一种动态规划的方法（dp），这是最优解法，但是由于没有接触过dp，所以还是比较困难的
 */
