/*ACTIVITY 5
 *Create a program that uses an array to store this values:
 * {3 , 9, 15, 20, 65, 23, 18, 4, 2, 14, 21}
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity5;

import java.util.Arrays;

/**
 *
 * @author cc2_1d-11
 */
public class Activity5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Elements of Array:");
        System.out.println("3, 9, 15, 20, 65, 23, 18, 4, 2, 14");
        
        int[] x = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14};
     
        
        Arrays.sort(x);

        System.out.println("Even \t Odd");
       for (int i = 0; i<x.length; i++){
           
           if(x[i] %2 == 0 ){
              System.out.println(x[i]);
               
           } else {
          System.out.println("\t" + x[i]);
 
           }
      
       }
               
                 
                }
           }
          
    

              
        
    
    

