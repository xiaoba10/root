package leetcode62;

public class uniquePaths {
	public int uniquePaths(int m, int n) {
		if( m < n)
            return uniquePaths(n,m);
        if( n == 1)
            return 1;
        if( n == 2)
            return m;
        int result[] = new int[m];
        for( int i = 0;i<m;i++)
            result[i] = 1;
        for( int i = 1;i<n;i++)
            for( int j = 1;j<m;j++)
                result[j] +=result[j-1];
        return result[m-1];
		
		
		
		
		
        
    }
}
