package leetcode62;

public class sortColors {
	public void sortColors(int[] nums) {
        int len = nums.length;
        int red_start = -1,white_start = -1, blue_start = -1;
        for( int i = 0;i<len;i++){
  			if( nums[i] == 0 ){
  				if( red_start == -1){
  					if( white_start == -1 && blue_start == -1)
  						;
  					else if( white_start == -1){
  						nums[i] = 2;
  						blue_start++;
  					}else if( blue_start == -1){
  						nums[i] = 1;
  						white_start++;
  					}else{
  						nums[i] = 2;
  						nums[blue_start] = 1;
  						nums[white_start] = 2;
  						blue_start++;
  						white_start++;
  					}
  					nums[0] = 0;
  					red_start = 0;
  				}else if( white_start == -1 && blue_start == -1)
  					;
  				else if( white_start == -1){
  					nums[blue_start] = 0;
  					nums[i] = 2;
  					blue_start++;
  				}else if( blue_start == -1){
  					nums[white_start] = 0;
  					nums[i] = 1;
  					white_start++;
  				}else{
  					nums[white_start] = 0;
  					nums[blue_start] = 1;
  					nums[i] = 2;
  					white_start++;
  					blue_start++;
  				}
  			}else if( nums[i] == 1 ){
  				if( white_start == -1 && blue_start == -1)
  					white_start = i;
  				else if( blue_start == -1){
  					;
  				}else if( white_start == -1){
  					nums[i] = 2;
  					nums[blue_start] = 1;
  					white_start = blue_start;
  					blue_start++;
  				}else{
  					nums[blue_start] = 1;
  					nums[i] = 2;
  					blue_start++;
  				}
  			}else{
  				if( blue_start == -1)
  					blue_start = i;
  			}
        }
    }
}
