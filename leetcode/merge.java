package leetcode62;

public class merge {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if( n == 0)
            return ;
        if( m == 0){
            for( int i = 0;i<n;i++)
                nums1[i] = nums2[i];
            return ;
        }

		for( int i = m+n-1,j = m-1,k = n-1;i>=0;i--){
			if( j == -1){
				for( ;i>=0;i--,k--)
					nums1[i] = nums2[k];
				break;
			}else if( k == -1){
				break;
			}
			if( nums1[j] >= nums2[k] ){
				nums1[i] = nums1[j];
				j--;
			} else{
				nums1[i] = nums2[k];
				k--;
			}



		}
        
    
    
        
    }
}
