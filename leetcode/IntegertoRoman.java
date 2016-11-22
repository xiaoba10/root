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
	 * 1.将数字转换成罗马数字
	 * 2.直接将各个位数存在一个二维数组中，然后直接读取就好了，然而只击败了17的用户
	 * 3.虽然想法一样，但是还是存在更优的方式，例如
	 * String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
        这个方式比我写的少了2ms，也因此击败了34的用户。
	 */

}
