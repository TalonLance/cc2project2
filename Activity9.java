
package activity9;

import java.util.Scanner;
public class Activity9 {
    
    public static void display() {
        Scanner s = new Scanner(System.in);
        boolean y = true;
        String oprtn;
        String yorn;
        
        while(y == true ){
            System.out.print("Which operation would you like to use? Fibonacci or Factorial?");
            oprtn = s.next();
            y = false;
            
            if(oprtn.equalsIgnoreCase("Fibonacci")) {
                fib();
                break;
            } else if(oprtn.equalsIgnoreCase("Factorial")) {
                fact();
                break;
            } else
                System.out.println("I N V A L I D " + " " + " I N P U T" + "\n" + "Please input either fibonacci or factorial only...");
            y = true;
        }
    }
    
    public static int input() {
        Scanner s2 = new Scanner(System.in);
        System.out.println("How many elements do you want?...");
        int x = s2.nextInt();
        return x;
    }
    
    public static int factorial(int n) {
        if(n == 0)
            return 1;
        else
            return(n * factorial(n - 1));
    }
    
    static void fact() {
        Scanner s3 = new Scanner(System.in);
        int h = input();
        int[] arr = new int[h];
        int r;
        System.out.println("Please enter the elements...");
        
        for(int x = 0; x < h; x++) {
            arr[x] = s3.nextInt();
        }
        for(int y = 0; y < arr.length; y++) {
            System.out.print("f(" + arr[y] + ")\t");
        }
        System.out.println("");
        for(int z = 0; z < arr.length; z++) {
            r = factorial(arr[z]);
            System.out.print(r + "\t");
        }
        
    }
    
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return(fibonacci(n-1) + fibonacci(n - 2));
    }
    
    static void fib() {
        Scanner s4 = new Scanner(System.in);
        int h = input();
        int[] arr = new int[h];
        int r;
        System.out.println("Please enter the elements...");
        
        for(int x = 0; x < h; x++) {
            arr[x] = s4.nextInt();
        }
        for(int y = 0; y < arr.length; y++) {
            System.out.print("f(" + arr[y] + ")\t");
        }
        System.out.println("");
        for(int z = 0; z < arr.length; z++) {
            r = fibonacci(arr[z]);
            System.out.print(r + "\t");
        }
    }
    

    public static void main(String[] args) {
        display();
    }
}
            
            
            
        
            
        
    
    
   
        
    