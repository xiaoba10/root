package leetcode62;

public class addBinary {
	public String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int num = len1 > len2 ? len1 : len2;
		char[] result = new char[num];
		int i = len1 - 1, j = len2 - 1, flag = 0, k = 0, pos = num - 1;
		while (i >= 0 && j >= 0) {
			k = a.charAt(i) + b.charAt(j) - '0' - '0' + flag;
			flag = k / 2;
			result[pos] = (char) ('0' + k % 2);
			i--;
			j--;
			pos--;
		}
		while (i >= 0) {
			k = a.charAt(i) - '0' + flag;
			flag = k / 2;
			result[pos] = (char) ('0' + k % 2);
			pos--;
			i--;
		}
		while (j >= 0) {
			k = b.charAt(j) - '0' + flag;
			flag = k / 2;
			result[pos] = (char) ('0' + k % 2);
			pos--;
			j--;
		}
		if (flag == 1)
			return "1" + String.valueOf(result);
		else
			return String.valueOf(result);

	}
}
