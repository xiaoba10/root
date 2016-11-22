package Package126;

import java.util.*;

/**
 * Created by wangzunwen on 2016/11/5.
 */
public class findLadders {





    public static void main(String[] args){

        HashSet set = new HashSet();
        HashSet set2 = new HashSet();

        set.add("hot");
        //set.add("dot");
        set.add("dog");
        //set.add("lot");
        //set.add("log");


        findLadders.findLadders("hot", "dog", set);

    }
    static List list = new ArrayList<List>();
    static HashMap map = new HashMap<String,Integer>();


    public static List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {

        if( beginWord.length()  == 0 || wordList.size() == 0  )
            return list;

        BFS(beginWord,endWord,wordList);
        DFS(endWord,beginWord,new ArrayList<String>());

        return list;

    }
    public static void DFS(String beginWord,String endWord,List ans){


        if( beginWord.equals(endWord) ){
            ans.add(beginWord);
            Collections.reverse(ans);
            list.add(ans);
            return ;
        }
        if( map.get(beginWord) == null )
            return ;
        ans.add(beginWord);
        int deep = (int) map.get(beginWord)-1;
        for( int i = 0;i<beginWord.length();i++){
            char[] word = beginWord.toCharArray();
            for( char ch = 'a';ch<='z';ch++) {
                word[i] = ch;
                String nWord = new String(word);

                if ( map.get(nWord) != null && ((int) map.get(nWord) == deep)) {
                    ArrayList ll = new ArrayList<String>(ans);
                    DFS(nWord, endWord, ll);

                }
            }
        }







    }
    public static void BFS(String beginWord,String endWord,Set<String> wordList){


        Queue queue = new LinkedList<String>();
        queue.add(beginWord);
        map.put(beginWord,0);
        while( !queue.isEmpty() ){
            String str = (String) queue.poll();
            if( str.equals(endWord) )
                continue;
            for( int i = 0 ;i <beginWord.length();i++){
                char[] word = str.toCharArray();
                for( char ch = 'a';ch<='z';ch++) {
                    word[i] = ch;
                    String Nword = new String(word);
                    if ( Nword.equals(endWord) || wordList.contains(Nword)) {
                        if (!map.containsKey(Nword)) {
                            map.put(Nword, (int) map.get(str) + 1);
                            queue.add(Nword);
                        }
                    }
                }
            }
        }
    }




}
