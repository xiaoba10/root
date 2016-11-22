package leetcode62;

public class isNumber {
	public boolean isNumber(String s) {
		int len = s.length(); 	
		int flag1 = 0,flag2 = 0,flag3 = 0,flag4 = 0;
		int isnum = 0;
		for( int i = 0;i<len;i++){
			if( s.charAt(i) == ' ' && flag1 == 0 ){
				while(i<len && s.charAt(i) == ' ' )
					i++;
				i--;
				flag1 = 1;
			}
			else if( s.charAt(i) == '.' && flag2 == 0){
			    flag1 = 1;
				flag2 = 1;
			}
			else if( (s.charAt(i) == '-' || s.charAt(i) == '+') && flag3 == 0 && isnum == 0 && flag2 == 0){
			    flag1 = 1;
				flag3 = 1;
			}
			else if( s.charAt(i) == 'e' && flag4 == 0 && isnum == 1) {
			    flag1 = 1;
				flag4 = 1;
				flag2 = 1;
				isnum = 0;
				if( i<len-1 && (s.charAt(i+1) == '-' || s.charAt(i+1) == '+')){
					i++;
				}
			}
			else if( s.charAt(i) >= '0' && s.charAt(i) <= '9'){
			    flag1 = 1;
				isnum = 1;
			}
			else if( s.charAt(i) == ' '){
				while(i<len && s.charAt(i) == ' ' )
					i++;
				if( i == len && isnum == 1)
					return true;
				else
					return false;
			}else
				return false;
			
		}
		return isnum == 1?true:false;
		
		
		
    }
}
