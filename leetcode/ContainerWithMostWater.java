package leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		if ( height == null || height.length == 0) { return 0; }
		int result = 0;
		int i = 0, j = height.length-1;
		while( i<j){
			result = Math.max(result, Math.min(height[i], height[j])*(j-i));
			if( height[i]<height[j] ){
				int k = i+1;
				for( ;k<j && height[k] <= height[i]; k++){}
				i = k;
			}
			else{
				int k = j-1;
				for( ; k>i && height[k] <= height[j]; k--){}
				j = k;
			}
		}
		return result;
		
		
		
		
		
//		int len = height.length;
//		int result = 0;
//		for(int i = 0; i<len ; i++){
//			for( int j = 0; j<len; j++){
//				result = result>(min(height[i],height[j])*(j-i))?result:(min(height[i],height[j])*(j-i));
//			}
//		}
		//return result;
    }
//	public int min(int a,int b){
//		return a<b?a:b;
//	}
	/*
	 * 1.���������
	 * 2.��һ��д��ʱ�临�Ӷ���o(n^2)�Ĳ�û��ͨ������ʱ�ˡ�
	 * 3.������ָ�룬Ȼ��͵�һ����Щ���ƣ����ݴ�С���ƶ���С���Ǳߡ�
	 */
}
