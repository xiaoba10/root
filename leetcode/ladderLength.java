package Package126;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by wangzunwen on 2016/11/6.
 */
public class ladderLength {


    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {

        if( beginWord == null || beginWord.length()  == 0 || wordList.size() == 0 || beginWord.length() != endWord.length() )
            return 0;

        Queue queue = new LinkedList<String>();
        queue.add(beginWord);
        int result = 1;
        while( ! queue.isEmpty() ){
            int len = queue.size();
            for( int i = 0;i<len;i++){
                String str = (String) queue.poll();
                for( int ii = 0; ii < str.length();ii++){
                    char[] word = str.toCharArray();
                    for( char ch = 'a'; ch<='z';ch++){
                        word[ii] = ch;
                        String newWord = new String(word);
                        if( wordList.contains(newWord) ){
                            wordList.remove(newWord);
                            queue.add(newWord);

                        }
                        if( newWord.equals(endWord) )
                            return result+1;
                    }
                }
            }
            result++;
        }
        return 0;

    }


}
