/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class TypeCasting {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a whole number");
        int input1=keyboard.nextInt();
        double input11 = (double)input1;
        System.out.println(input11);
        
        System.out.println("Enter a decimal number");
        double input2=keyboard.nextDouble();
        int input22 = (int)input2;
        System.out.println(input22);
        
        System.out.println("Enter a single character");
        char input3= keyboard.next().charAt(0);
        String input33 = String.valueOf(input3);
        System.out.println(input33);
        
        System.out.println("Enter a name");
        String input4 =keyboard.next();
        char input44 = input4.charAt(0);
        System.out.println(input44);
        
        System.out.println("Enter a whole number");
        int input5a=keyboard.nextInt();
        String input5= String.valueOf(input5a);
        int input55 = Integer.parseInt(input5);
        System.out.println(input55);
        
        
        System.out.println("Enter a decimal number");
        double input6a=keyboard.nextDouble();
        String input6= String.valueOf(input6a);
        double input66 = Double.parseDouble(input6);
        System.out.println(input66);
        // TODO code application logic here
    }
    
}
