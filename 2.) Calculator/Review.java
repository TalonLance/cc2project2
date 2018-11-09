/*
 *ACTIVITY 2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;
import java.util.Scanner;
/**
 *
 * @author CC2_1D-11
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Input two numbers...");
        double x = s.nextDouble();
        double y = s.nextDouble();
        System.out.println("ADD(+), SUB(-), MULTI(*), DIV(/), MOD(%)");
        String a = s.next();
        switch(a){
            case "+":
            case "add":
                System.out.println(x + y);
            
            break;
            
            case "-":
            case "sub":
                System.out.println(x - y);
            
            break;
            
            case "*":
            case "multi":
                System.out.println(x * y);
            
            break;
            
            case "/":
            case "div":
                System.out.println(x / y);
            
            break;
            
            case "%":
            case "mod":
                System.out.println((int)(x % y));
                
            break;
            
            default:
                System.out.println("Invalid Operation");
        }
    }
    
}
