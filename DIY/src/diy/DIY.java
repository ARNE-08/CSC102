/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diy;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class DIY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Starting point
        int cases = sc.nextInt();
        int count = 0;
        while (count < cases){
            System.out.println(count);
            count++;
        }
        
        //User a scanner get input regarding your name, surname, age and study program.
        String fname = sc.next();
        String sname = sc.next();
        System.out.println("My name is " + fname + " " + sname + ".");
        int age = sc.nextInt();
        System.out.println("I'm " + age + " years old.");
        String study = sc.next();
        System.out.println("I'm studying " + study + ".");
        
        //Get input
        String z = sc.next();
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.length());
        System.out.println(z.charAt(2));
        System.out.println(z.substring(2));
        
        //Get two strings
        String a = sc.next();
        String b = sc.next();
        if (a.compareToIgnoreCase(b) == 0)
            System.out.println("equal");
        else
            System.out.println("not equal");
        
        //Day in a week (if-else)
        int day = sc.nextInt();
        if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else if (day == 7)
            System.out.println("Sunday");
        
        //Day in a week (switch)
        int days = sc.nextInt();
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    
}
