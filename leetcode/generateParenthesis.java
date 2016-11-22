package leetcode;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {	
	public int num = 0;
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if( n == 0){
        	result.add(new String(""));
        	return result;
        }
        List<String> str1 ;
        List<String> str2 ;
        for(int i =0; i<n;i++){
        	int j = n-i-1;
        	str1 = generateParenthesis(i);
        	str2 = generateParenthesis(j);
        	for(int k = 0;k<str1.size();k++){
        		for(int m =0;m<str2.size();m++){
        			result.add(new String("("+str1.get(k)+")"+str2.get(m)));
        			System.out.println("("+str1.get(k)+")"+str2.get(m));
        		}
        	}
        }
        
        
//        char[] ans = new char[2*n];
//        get_res(result,n,ans,0,2*n-1);
//        System.out.println(num);
		return result;
    }
	
	
	
	public void get_res2(List<String> result,int n,char[] ans,int start,int end){
		if( n == 1){
			
		}
	}
	
	
	
	
	public void get_res(List<String> result,int n,char[] ans,int start,int end){
		if( n == 1){
			ans[start] = '(';
			ans[end] = ')';
			if(!result.contains(new String(ans))){
				result.add(new String(ans));
				System.out.println(ans);
				num++;
			}
			
			return ;
		}
		ans[start] = '(';
		ans[end] = ')';
		get_res(result,n-1,ans,start+1,end-1);
		ans[start] = '(';
		ans[start+1] = ')';
		get_res(result,n-1,ans,start+2,end);
		ans[end-1] = '(';
		ans[end] = ')';
		get_res(result,n-1,ans,start,end-2);
		if(n>3){
			int j = n, i = 2;
			while(i<j){
				for(int k = 0;k<i;k++){
					ans[start+k] = '(';
					ans[start+i+k] = ')';
				}
				get_res(result,n-i,ans,start+2*i,end);
				for( int k = 0;k<i ; k++){
					ans[end-k] = ')';
					ans[end-i-k] = '(';
				}
				get_res(result,n-i,ans,start,end-2*i);
				i++;
			}
			
		}
	}
	/*
	 * 1.求n对括号的组合
	 * 2.刚开始的想法导致有很多组都没有计算到，一直企图修改但是失败了
	 * 3.11＋？
	 * 4.public List<String> generateParenthesis(int n) {
        ArrayList<String> m=new ArrayList<>();
        generate(m, "", n, n);
        return m;
    }
    public void generate(ArrayList m, String s, int l, int r){
        if(l==0 && r==0){ 
            m.add(s);
            return;
        }
        if(l>0) generate(m, s+"(",  l-1,  r);
        if(r>l) generate(m, s+")",  l,  r-1);
    }
	变成了较快的程序。
	 */
}
