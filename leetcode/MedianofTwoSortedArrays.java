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
 * 1.�������������λ����Ҫ���Ӷ�O(log (m+n))��
 * 2.�ؼ����㷨�������Ƕ��ֲ��ң�����Ҫ����ת��˼ά���ҵ���λ�����൱���ҵ���k����С������������Ӧ(m+n)/2+1ż����Ӧ
 * (m+n)/2+1��(m+n)/2��ƽ������
 * 3.��Ҫ�Ƕ��ڱ߽�����Ŀ��ƣ������˺ܶ����
 *
 */