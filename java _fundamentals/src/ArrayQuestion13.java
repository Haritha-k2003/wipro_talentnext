import java.util.Scanner;

public class ArrayQuestion13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the size of the matrix
        int rows = 2;
        int cols = 2;

        int[][] array = new int[rows][cols];

        System.out.println("Enter 4 integer numbers:");

        // Reading input into 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Printing the original array
        System.out.println("The given array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the reversed array
        System.out.println("The reverse of the array is:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
