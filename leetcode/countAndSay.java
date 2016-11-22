package leetcode;

public class countAndSay {
	 public String countAndSay(int n) {
	        String num = "1";
	       for(int m = 1; m<n ; m++ ){
	            num = getString(num);
	        }
	        return num;
	    }
	    public String getString(String num){
		    	StringBuffer result = new StringBuffer();
		    	int j = 0 , i = 0 , n = 0;
		        while( i< num.length()){
		        	char ch = num.charAt(i);
		        	while( j < num.length() && ch == num.charAt(j) )
		        	    j++;
		        	n = j - i;
		        	result.append(n).append(ch-'0');
		        	i = j;
		        }
		        return result.toString();
		    } 

    /*
     * 1.就是一个序列，一次一次变化，然后输出第n个数据
     * 2.80+19
     * 很重要的一点是  ch == num.charAt(j) 与 num.charAt(j) == ch 的所用时间并不一样。前者要比后者优秀
     * 
     */
}
