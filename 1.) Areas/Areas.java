/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author cc2_1d-11
 */
import java.util.Scanner;
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("What shape would you like to solve? 1. Circle 2. Rectangle 3. Triangle");
        String a = s.nextLine();
        
        if(a.equals(1)){
            System.out.println("Give the radius...");
            double r = s.nextDouble();
            double areaC = Math.PI * Math.pow(r,2);
            System.out.println("The area of the circle with a radius of " + r + " is " + areaC );
        } else if(a.equals(2)){
             System.out.println("Give the length...");
             double l = s.nextDouble();
             System.out.println("Give the width...");
             double w = s.nextDouble();
             double areaR = l * w;
             System.out.println("The area of the rectangle with a length of " + l + " and a width of " 
                     + w + " is " + areaR );
        } else if(a.equals(3)){
            System.out.println("Give the base...");
             double b = s.nextDouble();
             System.out.println("Give the height...");
             double h = s.nextDouble();
             double areaT = (b * h) / 2;
             System.out.println("The area of the triangle with a base of " + b + " and a height of " 
                     + h + " is " + areaT );
        } else {
            System.out.println("INVALID ANSWER");
        }
    
        
    }
    
}
