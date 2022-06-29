import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int minSoFar = prices.get(0);
        int maxProfit = 0;
        
        for(int i = 0; i < prices.size(); i++){
            minSoFar = Math.min(minSoFar, prices.get(i));
            
            maxProfit = Math.max(maxProfit, prices.get(i) - minSoFar);
        }
        
        return maxProfit;
    }
}
