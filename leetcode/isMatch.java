package leetcode;

public class isMatch {
	
	
	public static int count = 0;
	public static void main(String[] args) throws InterruptedException{
		System.out.println(isMatch.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb","**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
		System.out.println(count);
	}
	
	
	
	
	public static boolean isMatch(String s, String p)  {
		int len1 = s.length(),len2 = p.length();
		System.out.println( s.length()+"  "+p.length());
		char[] str1 = s.toCharArray();
        char[] str2 = p.toCharArray();
        int i = 0, j = 0, pre = -1,before_i = -1,before_j = -1;
		while( i < len1 ){
			if( j < len2 && (str1[i] == str2[j] || str2[j] == '?')){
				i++;
				j++;
			}
			else if( j < len2 && str2[j] == '*'){
				before_i = i;
				before_j = j;
				j++;
			}else if( before_i != -1){
				i = before_i;
				j = before_j+1;
				before_i++;
			}else
				return false;
		}
		while( j<len2 && str2[j] == '*')
			j++;
		if( j == len2 )
			return true;
		else
			return false;
		
		
		
		
		
 }
	
	
	
	
	
	
	
	
	
	
	
}
