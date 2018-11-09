/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-11
 */
public class LoopPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number from 1 - 1000...");
        int b = s.nextInt();        
        int x = 0;
        do {
            System.out.println("");
            x++;
        }while(x != 20);
        int win = 0;
        
        while (win == 0) {
            System.out.println("What was the number?");
            int a = s.nextInt();
            
            if (a == b){
                win++;
                System.out.println("Correct");
            } else if (a < b){
                    System.out.println ("Your guess was too low, baka!");
                    if (b %2 == 0) {
                        System.out.println("It was an even number...");
                    } else {
                        System.out.println("It was an odd number...");
                    }
                         
            } else if (a > b){
                    System.out.println ("Ahhhh~,Your guess is too high.");
                    if (b %2 == 0) {
                        System.out.println("It was an even number...");
                    } else {
                        System.out.println("It was an odd number...");
                    }
       
            } else {
               System.out.println("Guess Again");
                
           
             
        }
      
    }
    }
}
