package leetcode;

public class longestPalindrome {
	public String longestPalindrome(String s) {
		int len = s.length(), result = 0, result_pos = 0;
		char[] s2 = new char[2*len+1];
		for(int i = 0,j=0; i < len*2 + 1; i++){
			if( i%2 == 0)
				s2[i] = '*';
			else{
				s2[i] = s.charAt(j);
				j++;
			}
		}
		int[] s_len = new int[2*len+1];
		int i = 1, r = 0 , r_max = 0 , pos = 0;//r_maxָ�������ұ߽߱��λ�ã���ǰ���ǵĻ��Ĵ�����Զ���룩
		//rָ����׼��������ַ��İ뾶��pos��r_max��Ӧ��λ��
		while( i<2*len+1 ){
			if( r_max < i){
				r = 0;
				int left = i-1, right = i+1;
				while( left >= 0 && right < 2*len+1 && s2[left] == s2[right] ){
					left --;
					right ++;
					r++;
				}
				s_len[i] = r;
				if( result<r){
					result = r;
					result_pos = i;
				}
				r_max = r+i;
				pos = i;
				
			}
			else{
				if( s_len[pos]-i+pos == s_len[ 2*pos -i]){
					r = s_len[ 2*pos-i ];
					int left = i-r-1, right = i+r+1;
					while( left >= 0 && right < 2*len+1 && s2[left] == s2[right] ){
						left--;
						right++;
						r++;
					}
					s_len[i] = r;
					if( result<r){
						result = r;
						result_pos = i;
					}
					if( r_max <= i+r){
						r_max = r+i;
						pos = i;
					}
				}
				else
					s_len[i] = 0;
			}
			
			i++;
		}
		System.out.println(result+" "+pos+" "+result_pos+" "+s_len[result_pos]);
		String Result ;
		Result = s.substring((result_pos-result+1)/2, (result_pos+result+1)/2);
		System.out.println(Result);
		return Result;
        
    }
}


/*
	1.���������Ӵ�
	2.�����ܶ࣬��򵥵���o(n^3)���㷨��������򵥵�o(n)���ҿռ�Ϊo(n)���㷨������Ҫ�����鿴���˵��㷨��
	��������Manacher�㷨��
*/