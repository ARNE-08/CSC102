import java.util.Scanner;
public class Crossword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String[][] arr = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.next();
            }
        }

        int num = sc.nextInt();
        String[] word = new String[num];
        for (int i = 0; i < num; i++)
            word[i] = sc.next();

        se(word[1], arr);
        for (int i = 0; i < word.length; i++) {
            int j = right(word[i], arr);
            if (j == 0)
                left(word[i], arr);
            else if (j == 0)
                up(word[i], arr);
            else if (j == 0)
                down(word[i], arr);
            // else if (j == 0)
            //     se(word[i], arr);
            if (j == 1)
                System.out.println(word[i] + " found");
            if (j == 0)
                System.out.println(word[i] + " not found");
        }
    }

    private static int right(String word, String[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            String n = "";
            for (int k = 0; k < arr[j].length; k++) {
                n += arr[j][k];
                if (n.contains(word))
                    return (1);
            }
        }
        return (0);
    }

    private static int left(String word, String[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            String n = "";
            for (int k = arr[j].length - 1; k >= 0; k--) {
                n += arr[j][k];
                if (n.contains(word))
                    return (1);
            }
        }
        return (0);
    }

    private static int up(String word, String[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            String n = "";
            for (int k = arr.length - 1; k >= 0; k--) {
                n += arr[k][j];
                if (n.contains(word))
                    return (1);
            }
        }
        return (0);
    }

    private static int down(String word, String[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            String n = "";
            for (int k = 0; k < arr.length; k++) {
                n += arr[k][j];
                if (n.contains(word))
                    return (1);
            }
        }
        return (0);
    }

    private static void se(String word, String[][] arr) {
        //int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            int w = 0;
            for (int j = 0; j < arr[i].length; j++) {
                String n = "";
                while (k < 12 && w < 12) {
                    n += arr[k][w];
                    System.out.println(n);
                    k++;
                    w++;
                    //if (n.contains(word))
                        //return (1);
                }
            }
        }
        //return (0);
        //boolean check = false;
        // for (int j = 0; j < arr.length; j++) {
        //     String n = "";
        //     for (int k = j; k < arr.length; k++) {
        //         if (j + k < 12)
        //             n += arr[j + k][k];
        //         System.out.println(n);
        //         if (n.contains(word))
        //             return ;
        //             //return (1);
        //     }
        // }
        //return (0);
    }
}
