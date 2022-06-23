// !TLE!

import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        //Brute Force
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    //Setting row to -1
                    for(int k = 0; k < matrix[0].length; k++ ){
                        if(matrix[i][k] != 0){
                            matrix[i][k] = -1;
                        }
                    }
                    //Setting col to -1
                    for(int k = 0; k < matrix.length; k++ ){
                        if(matrix[k][j] != 0){
                            matrix[k][j] = -1;
                        }
                    }
                    
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
