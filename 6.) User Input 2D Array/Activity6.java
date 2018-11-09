//Activity 6//
package activity6;
import java.util.Scanner;

public class Activity6 {

    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);
        
        //Size input
        System.out.println("How many rows do you want?");
        int row = s.nextInt();
        System.out.println("How many collumns do you want?");
        int col = s.nextInt(); 
        String[][] arr = new String[row][col];

                
        //Elements input   
        for(int r = 0; r < row; r++){
            System.out.println("Input elements for row" + r);
            for(int c = 0; c < col; c++){
                    arr[r][c] = s.next();  
            }       
        }
        
        
        //Print matrix
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                    System.out.print(arr[r][c] + "\t");
            } 
          System.out.println();  
        }            
    }  
}
