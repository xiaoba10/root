package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class merge {
	
	public static void main(String[] args){
		List<Interval> test = new ArrayList<Interval>();

		Interval www = new Interval(1,2);
		Interval w2 = new Interval(2,3);
		
		
	}
	

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
//[[1,2],[2,3],[33,35],[55,89],[2,5],[23,123],[4,3]]
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		int len = intervals.size();
		if( len < 2 )
			return intervals;
		int[] start = new int[len];
		int[] end = new int[len];
		for( int i = 0;i<len;i++){
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int begin,over;
		int i = 0,j = 1;
		while( i< len ){
			if( i == len-1){
				result.add(new Interval(start[i],end[i]));
				return result;
			}
			Interval ans = new Interval();
			ans.start = start[i];
			begin = start[j];
			over = end[i];
			while( over >= begin ){
				over = over>end[j]?over:end[j];
				j++;
				if( j == len)
					break;
				begin = start[j];
			}
			ans.end = over;
			result.add(ans);
			
			i = j;
			j = j+1;
		}
		
		
		return result;
	}
}

