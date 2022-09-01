/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;
public class Lab4 {
    public static void main(String[] args) {
        //Exercise 1
        /*int x = 1;
        int sum = 0;
        while(x<=50)
        {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
        //while (x++<=50); 
        while (++x<=50);
        System.out.println(sum);
        System.out.println(x);*/
        
        //Exercise 2
        /*int x = 0;
        int sum = 0;
        do{
            x++;
            System.out.println(x);
        }while(x<=50);*/
        
        //Exercise 3
        /*int i;
        for (i = 0; i < 100; i++) {
            System.out.println("Number " + i); 
            System.out.println("Let's go to the next loop");
        }

        for (int i = 0; i < 100; i++) {
            //int   i;
            System.out.println("Number " + i);
        }
        //System.out.println(i);
        
        //conclusion
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println("Number " + i);
        }
        System.out.println(i);
        
        //Error
        for (int i = 0; i < 100; i++); {
            System.out.println("Number " + i);
    }*/
        
        //Exercise 4
        int count1 = 1;
        /*while (count1 <= 10){
            int count2 = 1;
            while (count2 <= 20){
                System.out.println("Hello");
                count2++;
            }
            count1++;
        }*/
        while (count1 <= 10){
            for (int count2 = 1; count2 <= 20; count2++){      
                System.out.println("Hello");
            }
            count1++;
        }
    }
}
