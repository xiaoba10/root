package leetcode;

import java.util.List;
import java.util.ArrayList;

public class insert {

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		int start = newInterval.start, end = newInterval.end, len = intervals.size();
		int begin = 0, last = 0 ;
		if (len == 0) {
			intervals.add(newInterval);
			return intervals;
		}
		if ( end < intervals.get(0).start ){
			intervals.add(0, newInterval);
			return intervals;
		}
		if ( start > intervals.get(len-1).end){
			intervals.add(newInterval);
			return intervals;
		}
		while ( start > intervals.get(begin).end)
			begin++;
		last = begin;
		while ( last < len && end >= intervals.get(last).start )
			last++;
		if( begin == last ){
		    intervals.add(begin,newInterval);
		    return intervals;
		}
		
		System.out.println(begin+" "+last);
		intervals.get(begin).start = intervals.get(begin).start>start?start:intervals.get(begin).start;
		intervals.get(begin).end = intervals.get(last-1).end>end?intervals.get(last-1).end:end;
		for( int i = 0;i<len-last;i++)
		    intervals.set(begin+1+i,intervals.get(last+i));
		for ( int i = 1;i<last-begin;i++)
			intervals.remove(len-i);
		return intervals;
		
		
		
	}
}
