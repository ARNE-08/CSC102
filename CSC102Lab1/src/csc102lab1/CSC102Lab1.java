/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc102lab1;

/**
 *
 * @author Student
 */
public class CSC102Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String          a = "Hello";
        String          b = "Hi";
        int             c = 5;
        int             d = 15;
        double          e = c;
        char            f = 'A';
        char            g = 'a';
        double          radius = 2.5;
        final double    PI = 3.14;
        double          pi = Math.PI;
        double          result = PI * (radius * radius);
        
        boolean         re = false;
        re = c == c;
        
        System.out.print("Hello World");
        System.out.println("How are you Mr. A?");
        System.out.println("How " + "are " + "you.");
        System.out.println(b);
        System.out.println(a + b);
        System.out.println(d + c);
        System.out.println(e);
        System.out.println((int)f);
        System.out.println((int)g);
        
        System.out.print("Area of the circle : ");
        System.out.println(PI * (radius * radius));
        System.out.print("Area of the circle : ");
        System.out.println(pi * (Math.pow(radius, 2)));
        System.out.println(result);
        
        System.out.print("boolean : ");
        System.out.println(re);
        System.out.println(f == g);
        System.out.println(a == b);
        
        if ( c > d )
            System.out.println("true");
        else
            System.out.println("false");
    }
}
