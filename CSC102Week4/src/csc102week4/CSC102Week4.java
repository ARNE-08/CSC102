/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc102week4;

/**
 *
 * @author Student
 */
public class CSC102Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int count = 1;
        while (count <= 10)
        {
            System.out.println(count);
            count++;
        }
        do{
            System.out.println(count);
            count++;
        }
        while (count <= 10);
        for (int count2 = 1; count2 <= 10; count2++){
            System.out.println(count2);
        }*/
        int i = 1;
        for (i = 1; i <= 10; i++){
            //if (i % 2 == 0) {break;}
            if (i % 2 == 0) {continue;} //skip
            System.out.println(i);
        }
    }
    }
    
}
