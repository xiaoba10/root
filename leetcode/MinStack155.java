package leetcode152;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by wangzunwen on 2016/11/19.
 */
public class MinStack155 {

    /** initialize your data structure here. */

    ArrayList<Integer> list;
    int min ;
    public MinStack155() {
        list = new ArrayList<Integer>();
    }

    public void push(int x) {
        list.add(x);
        if( list.size() == 1)
            min = x;
    }

    public void pop() {
        list.remove( list.size()-1 );
        for( int i = 0 ; i < list.size();i++)
            min = Math.min(min,list.get(i));

    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */