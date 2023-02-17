package by.teachmeskills.homework.hw_10022023.hw_17022023;
import java.util.Arrays;
public class SeventhTask {
    public static void main(String[] args) {
        int size = 10;
        int size2 = 0;
        int[][] mass = new int[size][];
        for (int i = 0; i < size; i++) {
            size2 = (int) (100*Math.random());
            mass[i] = new int[size2];
            for (int j = 0; j < size2; j++) {
                mass[i][j] = (int) (10 * Math.random());
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
