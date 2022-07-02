import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int count = 0;
        int rows = n;
        int cols = m;
        int total = n * m;
        int currElement = 0;
        
        int startingRow = 0;
        int startingCol = 0;
        
        while(count < total){
            if(startingRow + 1 == rows || startingCol + 1 == cols) break;
            
            int elementToReplace = mat.get(startingRow + 1).get(startingCol);
            
            
            //Setting 1st Row in O/P
            for(int idx = startingCol; idx < cols; idx++){
                count++;
                currElement = mat.get(startingRow).get(idx);
                mat.get(startingRow).set(idx,elementToReplace);
                elementToReplace = currElement;
            }
            startingRow++;
            
            //Setting Last Column in O/P
            for(int idx = startingRow; idx < rows; idx++){
                count++;
                currElement = mat.get(idx).get(cols - 1);
                mat.get(idx).set(cols - 1,elementToReplace);
                elementToReplace = currElement;
            }
            cols--;
            
            //Setting Last row in O/P
            if(startingRow < rows){
                for(int idx = cols - 1; idx >= startingCol; idx--){
                    count++;
                    currElement = mat.get(rows - 1).get(idx);
                    mat.get(rows - 1).set(idx,elementToReplace);
                    elementToReplace = currElement;
                }
            }
            
            rows--;
            
            //Setting 1st column in O/P
            if(startingCol < cols){
                for(int idx = rows - 1; idx >= startingRow; idx--){
                    count++;
                    currElement = mat.get(idx).get(startingCol);
                    mat.get(idx).set(startingCol,elementToReplace);
                    elementToReplace = currElement;
                }
            }
            startingCol++;
        }
    }
}
