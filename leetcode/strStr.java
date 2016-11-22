package leetcode;

public class strStr {
	public int strStr(String haystack, String needle) {
		//kmp
		//移动位数 = 已匹配的字符数 - 对应的部分匹配值
		int[] next = nextInt(haystack);
		int i = 0, j = 0;
		while( i<haystack.length() && j<needle.length()){
			if( haystack.charAt(i) == needle.charAt(j)){
				i++;
				j++;
			}else
				j = next[j];
			
			
			
			
			
			
			
		}
		
		return -1;
	}
	public int[] nextInt(String haystack){
		int[] next = new int[haystack.length()];
		next[0] = -1;
		int i = 1, j = -1;
		for( ; i<haystack.length(); i++){
			j = next[ i-1 ];
			if( haystack.charAt(i) == haystack.charAt(j+1))
				next[i] = j+1;
			else{
				while( j >= 0 && haystack.charAt(j) != haystack.charAt(i)){
					j--;
				}
				next[i] = j;
			}
			
		}
		return next;
		
		
	}
		
	/*之后自己写的一个kmp
	 * public class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if( len2 == 0)
            return 0;
        if( len1<len2 || len1 == 0 )
            return -1;
        int[] next = new int[len2];
        next = GetNext(needle);
        // for(int i=0;i<len2;i++)
        //     System.out.println(next[i]);
        int pos = 0, i  = 0;
        while( pos<len1 && i<len2 && pos<len1 ){
            //System.out.println(pos+"   "+i);
            while( pos<len1 && i<len2 && haystack.charAt(pos) == needle.charAt(i) ) {
                i++;
                pos++;
            }
            //System.out.println(i+"   "+pos);
            if( i == len2)
                return pos-len2;
            if( i == 0 ){
                pos++;
                i = 0;
            }
            else
                i = next[i-1];
        
        }
        //System.out.println("!!!!!!");
        return -1;
    }
    
    public int[] GetNext(String needle){
        int len = needle.length();
        int[] next = new int[len];
        next[0] = 0;
        int k = 0;
        for(int q = 1; q<len; q++){
            while( k>0 && k<len && q<len && needle.charAt(k) != needle.charAt(q)  )
                k = next[k-1];
            if( needle.charAt(q) == needle.charAt(k)){
                    k++;
            }
            next[q] = k;
        }
        
        return next;
    }
    
    
    
}
    }	
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int result;
//		 
//	    if( needle.length() == 0)
//	        return 0;
//	   if(!haystack.contains(needle) || haystack.length()<needle.length())
//			 return -1;
//		 for( int i=0; i<haystack.length(); i++){
//			 if(haystack.charAt(i) == needle.charAt(0)){
//				 result = i;
//				 if( needle.length() == 1)
//						 return result;
//				 for(int j = 1,k = i+1;j<needle.length() && k<haystack.length(); j++,k++){
//					 if( haystack.charAt(k) != needle.charAt(j)){
//						 break;
//					 }
//					 else if( j == needle.length()-1 && haystack.charAt(k) == needle.charAt(j))
//					 {
//						 return result;
//					 }
//				 }
//			 }
//		 }
//		 return -1;
    }
	/*
	 * 1.求包含字串的位置，不存在返回－1；
	 * 2.第一次坐超时。
	 * 3.69+30
	 * 4.最好应该使用kmp
	 */
