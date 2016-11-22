package Package126;

/**
 * Created by wangzunwen on 2016/11/14.
 */
public class candy {
    public int candy(int[] ratings) {


        
        int len = ratings.length;
    		
    	int result = 0;

    	int pos = len-1;
    	int flag = 0,target = 0;
    	while( pos >= 0){

    		int size = 1;
    		while( pos >= 1 && ratings[pos-1] < ratings[pos] ){
    			size++;
    			pos--;
    			target = ratings[pos];
    		}
    		
    		if( size > 1){
    			result+=(1+size)*size/2;
    			if(size <= flag ){
    			    if( pos+size<len && ratings[pos+size] != ratings[pos-1+size])
    			        result+=(flag-size+1);
    			}
    			flag = 1;
    		}
    		else {
    		    if( pos<len-1 && ratings[pos] == ratings[pos+1]){
    		        flag = 1;
    		        result+=1;
    		    }
    		    else{
    			    result += flag+1;
    			    flag++;
    		    }
    		}

    		pos--;

    	}
    	
		return result;

    




    }

    
}
