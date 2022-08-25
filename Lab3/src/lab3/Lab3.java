/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exercise 1
        /*int x = sc.nextInt();
        System.out.println(x);
        boolean w = sc.nextBoolean();
        System.out.println(w);
        double y = sc.nextDouble();
        System.out.println(y);
        String z = sc.next();
        System.out.println(z);*/
        
        /*int x = sc.nextInt();
        System.out.println(x);
        int w = sc.nextInt();
        System.out.println(w);
        int y = sc.nextInt();
        System.out.println(y);
        int z = sc.nextInt();
        System.out.println(z);*/
        
       /*String x = sc.next();
        System.out.println(x);
        String w = sc.next();
        System.out.println(w);
        String y = sc.next();
        System.out.println(y);
        String z = sc.next();
        System.out.println(z);*/
       
       //Exercise 2
       /*String st1 = new String("Hello");
       String st2 = "Programming";
       System.out.println(st1);
       System.out.println(st2);
       
       System.out.println(st2.length());
       System.out.println(st2.charAt(3));
       System.out.println(st2.concat(st1));
       System.out.println(st2.indexOf("a"));
       System.out.println(st2.indexOf("m", 7));
       System.out.println(st2.substring(3));
       System.out.println(st2.substring(3, 6));*/
       
       //Exercise 3
       /*String st1 = new String("HELLO");
       String st2 = "Hello";
       System.out.println(st1 == st2);
       //st2 = st1;
       //System.out.println(st1 == st2);
       System.out.println(st1.compareTo(st2));
       System.out.println(st1.compareToIgnoreCase(st2));*/
       
       /*String st1 = new String("ape");
       String st2 = "zebra";
       System.out.println(st1.compareTo(st2));*/
       
      /* String st1 = new String("zebra");
       String st2 = "ape";
       System.out.println(st1.compareTo(st2));*/
      
      /*String st1 = new String("ape");
      String st2 = "ape";
      System.out.println(st1.compareTo(st2));*/
      
      /*String st1 = new String("ape");
      String st2 = "apple";
      System.out.println(st1.compareTo(st2));*/
      
      /*String st1 = new String("Ape");
      String st2 = "ape";
      System.out.println(st1.compareTo(st2));*/
      
      /*String st1 = new String(" ape");
      String st2 = "Ape";
      System.out.println(st1.compareTo(st2));*/
      
      /*String st1 = new String("cat");
      String st2 = "catfish";
      System.out.println(st1.compareTo(st2));*/
      
      //Exercise 4
      /*int x = 10;
      if (x == 10){
          System.out.println("x is equal to 10");
      }
      else if (x < 10){
          System.out.println("x is less than 10");
      }
      else if (x > 10 && x < 50){
          System.out.println("x is greater than 10");
      }
      else{
          System.out.println("x is " + x);
      }
      System.out.println(x == 10 ? "x is equal to 10" : "x is " + x);*/
      
      //Exercise 5
      /*int x = 1;
      boolean result1 = (x > 1) & (x++ < 10);
      System.out.println(result1);
      System.out.println(x);
      x = 1;
      boolean result2 = (x > 1) && (x++ < 10);
      System.out.println(result2);
      System.out.println(x);
      x = 1;
      boolean result3 = (1 > x) && (1 > x++);
      System.out.println(result3);
      System.out.println(x);
      x = 1;
      boolean result4 = (1 > x) & (1 > x++);
      System.out.println(result4);
      System.out.println(x);
      x = 1;
      boolean result5 = (1 > x) || (1 > x++);
      System.out.println(result5);
      System.out.println(x);
      x = 1;
      boolean result6 = (1 > x) | (1 > x++);
      System.out.println(result6);
      System.out.println(x);
      x = 1;
      boolean result7 = (1 == x) || (10 > x++);
      System.out.println(result7);
      System.out.println(x);
      x = 1;
      boolean result8 = (1 == x) | (10 > x++);
      System.out.println(result8);
      System.out.println(x);*/
      
      //Exercise 6
      int x = 2;
      switch(x){
          case 1:
              System.out.println("one");
          case 2:
              System.out.println("two");
          case 3:
              System.out.println("three");
          case 4:
              System.out.println("four");
          case 5:
              System.out.println("five");
      }
      switch(x){
          case 1:
              System.out.println("one");
              break;
          case 2:
              System.out.println("two");
              break;
          case 3:
              System.out.println("three");
              break;
          case 4:
              System.out.println("four");
              break;
          case 5:
              System.out.println("five");
              break;
      }
      x = 3;
      switch(x){
          case 1:
              System.out.println("one");
              break;
          case 2:
              System.out.println("two");
              break;
          case 3:
              System.out.println("three");
              break;
          case 4:
              System.out.println("four");
              break;
          case 5:
              System.out.println("five");
              break;
      }
      x = 7;
      switch(x){
          case 1:
              System.out.println("one");
              break;
          case 2:
              System.out.println("two");
              break;
          case 3:
              System.out.println("three");
              break;
          case 4:
              System.out.println("four");
              break;
          case 5:
              System.out.println("five");
              break;
          default:
              System.out.println("no matched");
              break;
      }
      String y = "four";
      switch(y){
          case "one":
              System.out.println(1);
              break;
          case "two":
              System.out.println(2);
              break;
          case "three":
              System.out.println(3);
              break;
          case "four":
              System.out.println(4);
              break;
          case "five":
              System.out.println(5);
              break;
      }
    }
    
}
