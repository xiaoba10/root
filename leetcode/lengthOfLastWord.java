package leetcode;

public class lengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int result = 0,i = s.length()-1;
		while( i>=0 && s.charAt(i) == ' ' ){
			i--;
		}
		while( i>=0 && s.charAt(i) != ' '){
			result++;
			i--;
		}
		return result;
    }
}
