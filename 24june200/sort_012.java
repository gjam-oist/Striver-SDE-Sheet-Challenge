import java.util.* ;
import java.io.*; 
public class Solution 
{
   
    public static void sort012(int[] arr)
    {
        int cnt0 = 0,cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case 0: cnt0++;
                    break;
                    
                case 1: cnt1++;
                    break;
                    
                case 2: cnt2++;
                    break;
               }
        }
        int i = 0;
        while(cnt0-->0){
            arr[i] = 0;
            i++;
        }
        
        while(cnt1-->0){
            arr[i] = 1;
            i++;
        }
        
        while(cnt2-->0){
            arr[i] = 2;
            i++;
        }
    }
}
