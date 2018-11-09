/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewmethods;

/**
 *
 * @author cc2_1d-11
 */
import java.util.Scanner;
public class ReviewMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        display();        
              
   }
    
    public static void display() {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = function(a);
        System.out.println(b);
 
    } 
    
    static int function(int a) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int[][] fib = new int[a][a];
        
        for(int i = 0; i < a; i++) {
            for(int n = 0; i < a; i++) {
            fib[i][n] = n1;
            System.out.println(fib[i][n]);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            }
        }  
        return a;
        
    }
}
