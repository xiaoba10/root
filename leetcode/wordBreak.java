package Package126;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class wordBreak {



    public boolean wordBreak(String s, Set<String> wordDict) {



        int len = s.length(),maxLen = 0;
        boolean[] dp = new boolean[len];
        for( String str : wordDict ){
            maxLen = Math.max(maxLen,str.length());
        }

        for( int i = 0 ;i<len;i++){

            for( int j = i;j>=0 && i-j<maxLen;j-- ){
                if( ( j == 0 || dp[j-1] == true ) && wordDict.contains(s.substring(j,i+1)) ){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len-1];

    }


}
