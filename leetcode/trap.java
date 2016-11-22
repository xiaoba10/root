package leetcode;

public class trap {
	public int trap(int[] height) {
		int len = height.length;
		if (len < 2)
			return 0;
		int be = 0, af = len - 1, result = 0;
		int po1 = 0, po2 = len - 1;
		while (be < af) {
			if (height[po1] <= height[af]) {
				while (be < af && height[be] <= height[po1]) {
					result -= height[be];
					be++;
				}
				result += height[po1] * (be - po1);
				po1 = be;
			} else {
				while (af > be && height[af] <= height[po2]) {
					result -= height[af];
					af--;
				}
				result += height[po2] * (po2 - af);
				po2 = af;
			}
		}
		return result;

	}
}
