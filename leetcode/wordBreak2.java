package Package126;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class wordBreak2 {


	
	String[] result;
	List list;

    public List<String> wordBreak(String s, Set<String> wordDict) {



        int len = s.length(),maxLen = 0;
        result = new String[len];
        list = new ArrayList<String>();

        for( String str : wordDict ){
            maxLen = Math.max(maxLen,str.length());
        }
        boolean[] dp = new boolean[len];
        for( int i = 0 ;i<len;i++){

            for( int j = i;j>=0 && i-j<maxLen;j-- ){
                if( ( j == 0 || dp[j-1] == true ) && wordDict.contains(s.substring(j,i+1)) ){
                    dp[i] = true;
                    break;
                }
            }
        }
        if( dp[len-1] == false)
            return list;

        helper(s,0,wordDict,maxLen,0);
        return list;

    }

    public void helper(String s,int pos,Set<String> wordDict,int maxLen,int count){


        if( pos == s.length() ){
            String str = result[0];
            for( int i = 1 ; i<count-1;i++){
                str =str+ " "+result[i];
            }
            if( count > 1)
                str = str+" "+result[count-1];
            list.add(str);
        }
        int flag = 0;
        for( int i = pos;pos - i<maxLen && i<s.length();i++){
            if( wordDict.contains( s.substring(pos,i+1) )){
                result[count] = s.substring(pos,i+1);
                helper(s,i+1,wordDict,maxLen,count+1);
                flag = 1;
            }
        }

    }


}
