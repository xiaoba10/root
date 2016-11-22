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
     * 1.����һ�����У�һ��һ�α仯��Ȼ�������n������
     * 2.80+19
     * ����Ҫ��һ����  ch == num.charAt(j) �� num.charAt(j) == ch ������ʱ�䲢��һ����ǰ��Ҫ�Ⱥ�������
     * 
     */
}
