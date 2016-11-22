package leetcode;

import java.util.Arrays;

public class getPermutation {
	
	public static void main(String[] args){
		getPermutation tt = new getPermutation();
		System.out.println(tt.getPermutation(4,1));
	}
	
	
	
	public String getPermutation(int n, int k) {
        int[] flag = new int[n];
        String result ;
        char[] ans  = new char[n];
        int count = 1;
        for( int i = 2;i<n;i++)
        	count*=i;
        for( int i = 0;i<n;i++){
        	System.out.println(count+"  "+k);
        	if ( k == 1){
        		System.out.println(new String(Arrays.toString(flag))+" "+new String(Arrays.toString(ans)));
        		for( int j = 0;j<n;j++){
        			if( flag[j] == 0){
        				ans[i] = (char) (j+49);
        				i++;
        				flag[j] = 1;
        			}
        		}
        		for( int q = 0;q<n;q++)
        			System.out.print(ans[q]);
        		return new String(ans);
        	}
        	
        	int num = (k-1)/count;
        	k = k - num*count;
        	count = count/(n-1-i);
       	System.out.println(k+" "+count+" "+num+" "+new String(Arrays.toString(flag)));
        	for( int j = 0;j<n;j++){
        		if( flag[j] == 0){
        			if( num == 0){
        				ans[i] = (char) (j+49);
        				flag[j] = 1;
        				break;
        			}else
        				num--;
        		}
        	}
        	
        	System.out.println(k+" "+ans[i]+" "+new String(Arrays.toString(flag)));
        	
        	
        }
        
        
        
        
        
        
        
        return new String(ans);
		
		
    }
}
