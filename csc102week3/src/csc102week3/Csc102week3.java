/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc102week3;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Csc102week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int x = scan.nextInt();
        //System.out.println(x);
        
        System.out.print("Please input your sentence: ");
        scan.next();
        String s = scan.next();
        System.out.println("Your token is: " + s);
        //input "This is book" will print "is" because scan.next(); already scan the "this"
        
        String a = "Hello";
        String b = "World";
        String c = "Hello";
        if (a == b)
            System.out.println("stra = strb");
        else if (c == a)
            System.out.println("stra = strc");
        //same referance even if it's not the same address
        // == only compare the reference (var) if it contain same characters
        else
            b = a;
        if (a == b)
            System.out.println("stra = b after else");
        //same address
        
        double x = 0.1;
        double y = 1/10;
        if (x == y)
            System.out.println("x = y");
        else
            System.out.println("x != y");
        // x!=y
        // to compare -> |x - y| = 0.000001 if small difference = okay
        
        String t = "book";
        String u = "bookcase";
        System.out.println(t.compareTo(u));
        //compase ascii lie strcmp
    }
    
}
