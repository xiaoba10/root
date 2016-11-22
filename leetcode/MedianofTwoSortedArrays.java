package leetcode;

public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		int k = (m+n)/2;
		double result;
		System.out.println(k+" "+m+" "+n);
		System.out.println(find_k_value(nums1,0,nums2,0,k));
		System.out.println(find_k_value(nums1,0,nums2,0,k+1));

		if( m == 0)
			return n%2 == 0?(double)(nums2[n/2] + nums2[n/2-1])/2:nums2[n/2];
		if( n == 0)
			return m%2 == 0?(double)(nums1[m/2] + nums1[m/2-1])/2:nums1[m/2];
		if((m+n)%2 == 0)
			result = (double)(find_k_value(nums1,0,nums2,0,k)+find_k_value(nums1,0,nums2,0,k+1))/2;
		else
			result = find_k_value(nums1,0,nums2,0,k+1);
		return result;
        
    }
	public double find_k_value(int[] nums1, int n, int[] nums2, int m, int k){
		int len1 = nums1.length, len2 = nums2.length, k2;
		if( len1-n > len2-m)
			return find_k_value(nums2, m , nums1, n, k);
		if( k/2 < len1-n)
			k2 = k/2;
		else 
			k2 = len1-n;
		if( len1 == n ){
			return nums2[m+k-1];
		}
		if( len2 == m ){
			return nums1[n+k-1];
		}
		if( k == 1 )
			return nums1[n]>nums2[m]?nums2[m]:nums1[n];
		if( nums1[n+k2-1] >= nums2 [m+k2-1])
			return find_k_value(nums1, n, nums2, m+k2, k-k2);
		else 
			return find_k_value(nums1, n+k2 , nums2 , m, k-k2);
	}
}


/*
 * 1.求两个数组的中位数。要求复杂度O(log (m+n))。
 * 2.关键是算法，明显是二分查找，最主要的是转换思维，找到中位数，相当于找到第k个最小的数：奇数对应(m+n)/2+1偶数对应
 * (m+n)/2+1和(m+n)/2的平均数。
 * 3.主要是对于边界问题的控制，出现了很多错误。
 *
 */