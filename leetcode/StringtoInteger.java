package leetcode;

public class StringtoInteger {
	public int myAtoi(String str) {
		if (str == null || str.length() < 1)  
	        return 0; 
        int i=0,flag=1;
        str=str.trim();
        if(str.charAt(i)=='-'){
        	i++;
        	flag=0;
        }else if(str.charAt(i)=='+'){
        	i++;
        }
        System.out.println(str.toString());
        int len=str.length();
        double result = 0;
        while(len>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
        	result=result*10+(str.charAt(i)-'0');
        	i++;
        }
        System.out.println(result);
        if(flag==0)
        	result=-result;
        if(result>Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        return (int)result;
    }
	/*
	 * 1.将字符串转换成数字
	 * 2.需要注意的点很多，题目下方有提示，虽然是简单类型的题，但是通过率并不是很高。
	 */
}
