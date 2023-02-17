package by.teachmeskills.homework.hw_17022023;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Please enter number(1-7) to get result or 0 to finish");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case (0):
                    return;
                case (1):
                    System.out.println("Monday");
                    break;
                case (2):
                    System.out.println("Tuesday");
                    break;
                case (3):
                    System.out.println("Wednesday");
                    break;
                case (4):
                    System.out.println("Thursday");
                    break;
                case (5):
                    System.out.println("Friday");
                    break;
                case (6):
                    System.out.println("Saturday");
                    break;
                case (7):
                    System.out.println("Sunday");
                    break;
                default:
                    throw new IllegalArgumentException("Incorrect input");
            }
        }

    }
}
