import java.util.Scanner;

public class ArraySumByRowsLab4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = read.nextInt();

        int[][] array = new int[rows][cols];

        fillArray(array);
        printArray(array);
        getSumByRows(array);
    }
    
    public static void fillArray(int[][] array) {
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter value[%d][%d]: ",i,j);
                array[i][j] = read.nextInt();
            }
        }
    }

    static void getSumByRows (int[][] array){
        for (int i = 0; i < array.length; i++) {

            int sum = 0;
            for (int j = 0; j < array[i].length; j++)
                sum += array[i][j];

            System.out.printf("Row at index %d:\n" , i);
            System.out.println("Sum: " + sum);
        }
    }

    static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
