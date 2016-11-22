package Package126;
	
/**
 * Created by wangzunwen on 2016/11/14.
 */
public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {



        int len = gas.length;
        int sum = 0;
        int max = 0;
        int start = 0;
        for( int i = len-1;i>=0;i--){
            sum+=(gas[i]-cost[i]);
            if( sum > max ){
                max = sum;
                start = i;
            }
        }
        if( sum < 0)
            return -1;
        return start;



    }

}
