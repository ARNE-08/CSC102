public class Week4 {
    public static void main(String[] args) {
        /*int ar[] = new int[10];
        for (int i = 1; i<= 10; i++) {
            ar[i - 1] = i;
        }
        for (int i : ar)
            System.out.print(i + " ");

        System.out.println("");
        int array[] = {23, 45, 67, 13, 2};
        System.out.println(array[3]);
        array[3] = 45;
        System.out.println(array[3]);*/
        
        int myar[][] = new int[4][5];
        int count = 1;
        for (int i = 0; i < myar.length; i++) {
            for (int j = 0; j < myar[i].length; j++) {
                myar[i][j] = count;
                count++;
            }
        }
        //input 1-20 in the array

        //check element in each row
        for (int i : myar[0])
            System.out.println(i);
        for (int i : myar[1])
            System.out.println(i);
        for (int i : myar[2])
            System.out.println(i);
        for (int i : myar[3])
            System.out.println(i);
    }
}
