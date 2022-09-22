public class Lab4 {
    public static void main(String[] args) {
        //Exercise 1
        /*int[] myNumbers;
        double[] myDoubles;
        char myChars[];

        myNumbers = new int[5];
        myDoubles = new double[10];
        myChars = new char[5];
        boolean myBoolean[] = new boolean[5];
        
        //Exercise 2
        System.out.println(myNumbers[0]);
        myNumbers[0] = 128;
        //myNumbers[0] = 128.15;
        System.out.println(myNumbers[0]);
        //System.out.println(myNumbers[1]);
        //Out of bound
        System.out.println(myDoubles[1]);
        System.out.println(myChars[2]);
        System.out.println(myBoolean[3]);*/
        int[] myNumbers = {10, 15, 18, 132, 0};
        /*System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);
        System.out.println(myNumbers[3]);
        System.out.println(myNumbers[4]);

        //Exercise 3
        System.out.println(myNumbers.length);*/

        //Exercise 4
        System.out.println(myNumbers[3]);
        System.out.println((myNumbers[3] + 2) / 4);
        if (myNumbers[3] > 100)
            System.out.println("The value is greater than 100");
        
        //Exercise 5
        /*String[] fruits = new String[3];
        fruits[0] = new String("Apple");
        fruits[1] = "Banana";
        fruits[2] = new String("Mango");

        System.out.println(fruit[0] + " " + fruits[1] + " " + fruits[2]);*/
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Mango")};

        //Exercise 6
        int i = 0;
        while (i < fruits.length) {
            System.out.println(fruits[i]);
            i++;
        }

        for (String f : fruits)
            System.out.println(f);

        //Exercise 7
        /*int[][] numTable = new int[2][3];
        numTable[0][0] = 1;
        numTable[0][1] = 2;
        numTable[0][2] = 3;
        numTable[1][0] = 4;
        numTable[1][1] = 5;
        numTable[1][2] = 6;*/
        //int[][] numTable = {{1, 2, 3}, {4, 5, 6}};
        int[][] numTable = {{1, 2, 3}, {4, 5}}; //Exercise 8
        System.out.println(numTable.length);
        System.out.println(numTable[0].length);
        System.out.println(numTable[1].length);
        System.out.println(numTable[1][0]);
        //System.out.println(numTable[1][2]);
    }
}
