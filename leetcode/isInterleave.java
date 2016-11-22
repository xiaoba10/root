package leetcode62;

public class isInterleave {

	public boolean isInterleave(String s1, String s2, String s3) {

		
		if( s1.length()+s2.length() != s3.length())
			return false;
		if( s1.length() == 0)
			return s2.equals(s3);
		if( s2.length() == 0)
			return s1.equals(s3);
		char[] word1 = s1.toCharArray();
		char[] word2 = s2.toCharArray();
		char[] word3 = s3.toCharArray();
		boolean[] result = new boolean[s2.length()+1];
		result[0] = true;
		for( int i = 0;i<=s1.length();i++){
			for( int j = 0;j<=s2.length();j++){
				if( i == 0 && j == 0)
					result[0] = true;
				else if( j == 0){
					result[0] = result[0] && word1[i-1] == word3[i-1];
				}else if( i == 0){
				    result[j] = result[j-1] && word2[j-1] == word3[j-1];
				}
				else{
					if( result[j]  && word1[i-1] == word3[i+j-1])
						result[j] = true;
					else if( result[j-1] && word2[j-1] == word3[i+j-1])
						result[j] = true;
					else
					    result[j] = false;
				}

			}
		}
		return result[s2.length()];

        
    }

    

}
