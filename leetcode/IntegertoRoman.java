package leetcode;

public class IntegertoRoman {
	public String intToRoman(int num) {
		String result = "";
		String[][] Roman = 	{{"","I","II","III","IV","V","VI","VII","VIII","IX"},
			   	{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
				{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
				{"","M","MM","MMM"}};
		int i = 0 , j = 0;
		while( num != 0){
			j = num%10;
			result += Roman[i][j];
			num = num/10;
			i++;
		}
		
		
		return result;
        
    }
	/*
	 * 1.������ת������������
	 * 2.ֱ�ӽ�����λ������һ����ά�����У�Ȼ��ֱ�Ӷ�ȡ�ͺ��ˣ�Ȼ��ֻ������17���û�
	 * 3.��Ȼ�뷨һ�������ǻ��Ǵ��ڸ��ŵķ�ʽ������
	 * String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
        �����ʽ����д������2ms��Ҳ��˻�����34���û���
	 */

}
