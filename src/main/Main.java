
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner ( System.in); 
        
        double TT = 3.14159;
        double area , raio ;
        
       raio = input.nextDouble();
       area = (raio*raio)* TT;
        
        System.out.println("A="+ area );
    }
    
}
