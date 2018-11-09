/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg3;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-11
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Which college department are you in?");
        String x = s.next();
        
        if (x.equals("COA")){
            System.out.println("Which program are you in?");
            String coa = s.next();
            if (coa.equals("BSA")){
                System.out.println(" Bachelor of Science in Accountancy");
            } else if (coa.equals("BSAcT")){
                System.out.println("Bachelor of Science in Accounting Technology");
            } else if (coa.equals("BSMA")){
                System.out.println("Bachelor of Science in Management Accounting");
            } else if (coa.equals("BSFA")){
                System.out.println("Bachelor of Science in Forensic Accounting");
            } else {
                System.out.println("INVALID");
            }
        }else if (x.equals("CEA")) {
            System.out.println("Which program are you in?");
            String pizza = s.next();
            if (pizza.equals("BSA")){
                System.out.println("Bachelor of Science in Architecture");
            } else if (pizza.equals("BSCE")){
                System.out.println("1. Civil Engineering 2. Computer Engineering");
                String donut = s.next();
                if (donut.equals(1)) {
                    System.out.println("Bachelor of Science in Civil Engineering");
                } else if (donut.equals(2)) {
                    System.out.println("Bachelor of Science in Computer Engineering");
            }
            } else if (pizza.equals("BSEE")){
                System.out.println("");
            } else if (pizza.equals("BSESE")){
                System.out.println("");
            }
        } else if (x.equals("CITCS")){
            System.out.println("Which program are you in?");
            String burger = s.next();
            if (burger.equals("BSCS")){
                System.out.println("Bachelor of Science in Computer Science");
            } else if (burger.equals("BSIT")){
                System.out.println("Bachelor of Science in Information Technology");
            } else if (burger.equals("BSDA")){
                System.out.println("Bachelor of Science in Data Analytics");      
            }
        } else if (x.equals("CTE")){
            System.out.println("Which program are you in?");
            String ramen = s.next();
            if (ramen.equals("BSEE-G")){
                System.out.println("Bachelor of Science in Elementary Education - General");               
            } else if (ramen.equals("BSEE")){
                System.out.println("Bachelor of Science in Elementary Education");
            } else if (ramen.equals("BSSE")){
                System.out.println("Bachelor of Science in Secondary Education");
            }
        } else if (x.equals("CAS")){
            System.out.println("Which program are you in?");
            String lechon = s.next();
            if (lechon.equals("BAE")){
                System.out.println("Bachelor of Arts in English");
            } else if (lechon.equals("BAPS")){
                System.out.println("Bachelor of Arts in Political Science");               
            } else if (lechon.equals("BAC")){
                System.out.println("Bachelor of Arts in Communication");
            } else if (lechon.equals("BSP")){
                System.out.println("Bachelor of Arts in Psychology");                
            } 
        } else if (x.equals("CBA")){
            System.out.println("Which program are you in?");
            String palabok = s.next();
            if (palabok.equals("BSBA")){
                System.out.println("Bachelor of Science in Business Administration");                
            } else if (palabok.equals("BSE")){
                System.out.println("Bachelor of Science in Entrepeneurship");
            } else if (palabok.equals("BSOA")){
                System.out.println("Bachelor of Science in Office Administration");
            }
        } else {
            System.out.println("INVALID");
        }
    
}
}
