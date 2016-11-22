package Package126;

import java.util.*;

/**
 * Created by wangzunwen on 2016/11/16.
 */
public class LRUCache {



	int size,num;
	
	Map<Integer,Integer> map;

    public LRUCache(int capacity) {

    	size = capacity;

		List list =new LinkedList();
		
    	map = new LinkedHashMap<Integer,Integer>();


    }

    public int get(int key) {

    	if( map.containsKey(key) ){
    		int value = map.get(key);
    		map.remove(key);
    		map.put(key,value);
    		return value;
    	}
    	else
    		return -1;

    }

    public void set(int key, int value) {

    		


    	if( map.containsKey(key) ){
    		map.remove(key);
    		map.put(key,value);	
    	}else{
    		if( num == size ){
				int firstKey = map.keySet().iterator().next();
				map.remove(firstKey);
				map.put(key,value);
    		}else{
    			map.put(key,value);
    			num++;
    		}
    	}


    	
    }
}
