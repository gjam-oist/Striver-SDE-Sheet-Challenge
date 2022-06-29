import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// Using Kadane's Algo
        long curSum = 0;
        long maxSum = 0;
        for(int i = 0; i < n; i++){
            curSum += arr[i];
            if(maxSum < curSum){
                maxSum = curSum;
            }
            
            if(curSum < 0){
                curSum = 0;
            }
         }
        
        return maxSum;
	}

}
