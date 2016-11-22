package Package126;

/**
 * Created by wangzunwen on 2016/11/18.
 */
public class reverseWords151 {


    public static void main(String[] args){
        System.out.println(reverseWords(" sadasd asd as das das d "));

    }
    public static String reverseWords(String s) {

    	int len = s.length();
    	if( len == 0)
    		return s;
    	StringBuffer result = new StringBuffer() ;
    	int end = len-1,start = 0;
    	while( end >= 0 && s.charAt(end) == ' ')
    		end--;
        if( end == -1)
            return result.toString();
    	while( start < len && s.charAt(start) == ' ')
    		start++;
        int pos = end+1;
    	for( int i = end ; i >= start ; i-- ){
    		if( s.charAt(i) == ' ') {
                result.append(s.substring(i+1,pos));
                result.append(" ");
                while (i < end && s.charAt(i) == ' ')
                    i--;
                i++;
                pos = i;

            }


        }
        System.out.println(pos+" "+end);
        result.append(s.substring(start,pos));
        return result.toString();

    }
}
