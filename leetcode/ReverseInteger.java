package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		int flag = 0;
		int result = 0;
		System.out.println(x);
		do{
			int a = x%10;
			result = result*10 + a;
			System.out.println(a+" "+result+" "+" "+x);
			x = x/10;
			if((result > 214748364 && x!=0)||(result == 214748364 && x>6)||
					(result <-214748364 && x!=0)||(result == 214748364 && x>7))
				return 0;
		}while(x!=0);
		return result;
		
    }
	/*
	 * 1.��һ�����ֵĻ�����
	 * 2.ע��ĵ����int�ķ�Χ��Ҫ���ƣ�����������������int�ķ�Χ����ô��Ҫ����0��
	 * 3.�㷨����һ��һ��ȡ�ࡣȻ��ԭ������10
	 */
}
