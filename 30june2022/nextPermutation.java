import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation){
        //Variable declaration
        int length = permutation.size();
        int pointer = length - 2;
        
        //Null checks
        if(permutation.size() == 0 || permutation == null ) return permutation;
        
        //Finding Pointer -> 9 6 7 5 
        for(int start = length - 1; start > 0; start--){
            if(permutation.get(start) <= permutation.get(start - 1)) pointer--;
            else break;
        }
        //System.out.println(pointer);
        
        //if pointer == -1
        if(pointer == -1){
            reverse(permutation, 0, length - 1);
            return permutation;
        }
        
	    //else replace pointer with next grester element and then reverse list after pointer
        for(int start = length - 1; start > 0; start--){
            if(permutation.get(start) > permutation.get(pointer)){
                int exchanger = permutation.get(pointer);
                
                permutation.set(pointer,permutation.get(start));
                //permutation.remove(pointer + 1);
                permutation.set(start, exchanger);
                //permutation.remove(start + 1);
                
                break;
            }
        }
        
        reverse(permutation, pointer + 1, length - 1);
        return permutation;
        
	}
    
    private static void reverse(ArrayList<Integer> permutation, int startIndex, int endIndex){
        
        while(startIndex < endIndex){
            int exchanger = permutation.get(startIndex);
            permutation.set(startIndex,permutation.get(endIndex));
            permutation.set(endIndex, exchanger);
            //permutation.remove(startIndex + 1);
            //permutation.remove(endIndex + 1);
            startIndex++;
            endIndex--;
            
            
        }
    }
    
    
    
}
