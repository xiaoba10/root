package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import leetcode.test.ListNode;

public class findSubstring {
	
	
	public List<Integer> findSubstring(String s, String[] words) {
		
		List<Integer> result = new ArrayList<Integer>();
		if (s == null || words == null || words.length == 0) return result;
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		int len = words[0].length();
		for( String w : words){
			map.put(w, map.containsKey(w) ? map.get(w)+1 : 1);
		}
		for( int i=0; i <= s.length()-len*words.length ; i++){
			
			Map<String,Integer> copy = new HashMap<String,Integer>(map);
			
			for(int j = 0; j < words.length ; j++ ){
				String str = s.substring(i + j*len, i+j*len+len);
				if( copy.containsKey(str)){
					int count = copy.get(str);
					copy.remove(str);
					if( count != 1)
						copy.put(str, count-1);
					if( j == words.length -1)
						result.add(i);
				}
				else
					break;
			}
			
		}
		
		
		
        return result;
    }
	
	
	
	
	/*
	 *1.并没有使用AC算法，主要是尝试几次之后失败
	 *2.使用map，比较暴力，刚开始没有注意到的点是单词有可能重复。 
	 *3.因此，只击败了6.84
	 *优化之后的算法97
	 *但是不知道时间复杂度是如何计算的。
	 *
	 public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> res = new ArrayList<Integer>();
        int n = s.length(), m = words.length, k;
        if (n == 0 || m == 0 || (k = words[0].length()) == 0)
            return res;

        HashMap<String, Integer> wDict = new HashMap<String, Integer>();

        for (String word : words) {
            if (wDict.containsKey(word))
                wDict.put(word, wDict.get(word) + 1);
            else
                wDict.put(word, 1);
        }
		
        int i, j, start, x, wordsLen = m * k;
        HashMap<String, Integer> curDict = new HashMap<String, Integer>();
        String test, temp;
        for (i = 0; i < k; i++) {
            curDict.clear();
            start = i;
            if (start + wordsLen > n)
                return res;
            for (j = i; j + k <= n; j += k) {
                test = s.substring(j, j + k);
				//k为每个单词长度，j为当前位置，
                if (wDict.containsKey(test)) {
                    if (!curDict.containsKey(test)) {
                        curDict.put(test, 1);

                        start = checkFound(res, start, wordsLen, j, k, curDict, s);
                        continue;
                    }

                    // curDict.containsKey(test)
                    x = curDict.get(test);
                    if (x < wDict.get(test)) {
                        curDict.put(test, x + 1);

                        start = checkFound(res, start, wordsLen, j, k, curDict, s);
                        continue;
                    }

                    // curDict.get(test)==wDict.get(test), slide start to
                    // the next word of the first same word as test
                    while (!(temp = s.substring(start, start + k)).equals(test)) {
                        decreaseCount(curDict, temp);
                        start += k;
                    }
                    start += k;
                    if (start + wordsLen > n)
                        break;
                    continue;
                }

                // totally failed up to index j+k, slide start and reset all
                start = j + k;
                if (start + wordsLen > n)
                    break;
                curDict.clear();
            }
        }
        return res;
    }

    public int checkFound(List<Integer> res, int start, int wordsLen, int j, int k,
            HashMap<String, Integer> curDict, String s) {
        if (start + wordsLen == j + k) {
            res.add(start);
            decreaseCount(curDict, s.substring(start, start + k));
            return start + k;
        }
        return start;
    }

    public void decreaseCount(HashMap<String, Integer> curDict, String key) {
        // remove key if curDict.get(key)==1, otherwise decrease it by 1
        int x = curDict.get(key);
        if (x == 1)
            curDict.remove(key);
        else
            curDict.put(key, x - 1);
    }
	 *
	 *
	 */
}
