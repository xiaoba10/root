package leetcode62;

public class numDecodings {
	public int numDecodings(String s) {
		int len = s.length();
		if (len == 0)
			return 0;
		else if (len == 1)
			return s.charAt(0) == '0' ? 0 : 1;
		int[] num = new int[len];
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				num[i] = s.charAt(i) - '0';
			else
				num[i] = -1;
		}
		for (int i = 0; i < len; i++)
			num[i] = s.charAt(i) - '0';
		int[] dp = new int[len];
		if (num[0] == 0)
			return 0;
		else
			dp[0] = 1;
		if (num[1] == 0) {
			if ((num[0] > 2 || num[0] < 1))
				return 0;
			else
				dp[1] = 1;
		} else if ((num[0] == 1 && num[1] > 0)
				|| (num[0] == 2 && num[1] < 7 && num[1] > 0))
			dp[1] = 2;
		else
			dp[1] = dp[0];
		for (int i = 2; i < len; i++) {
			if (num[i] == 0) {
				if (num[i - 1] > 2 || num[i - 1] < 1)
					return 0;
				else
					dp[i] = dp[i - 2];
			} else if ((num[i - 1] == 1 && num[i] > 0)
					|| (num[i - 1] == 2 && num[i] < 7))
				dp[i] = dp[i - 1] + dp[i - 2];
			else
				dp[i] = dp[i - 1];

		}
		return dp[len - 1];
	}
}
