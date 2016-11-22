package leetcode62;

public class plusOne {
	public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        int flag = 1;
        for( int i = len-1;i>=0;i--){
        	if( digits[i] + 1 == 10 ){
        		digits[i] = 0;
        		flag = 1;
        	}
        	else{
        		digits[i]++;
        		flag = 0;
        		break;
        	}
        }
        if( flag == 1){
            int[] result = new int[len+1];
            result[0] = 1;
            for( int i = 1;i<=len;i++)
                result[i] = 0;
            return result;
        }
        return digits;
    
    }
}
