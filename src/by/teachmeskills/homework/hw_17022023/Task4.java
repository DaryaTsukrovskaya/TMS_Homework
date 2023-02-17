package by.teachmeskills.homework.hw_17022023;
public class Task4 {
    public static void main(String[] args) {
        double[] vec = {-1.12, 20, -50, -7.34, -9, 100, 2};
        double min = vec[0];
        double max = vec[0];
        double sum = 0;
        double product = 1;
        int Imin = 0;
        int Imax = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] < 0) {
                sum += vec[i];
            }
        }
        System.out.println("The sum of negative elements : " + sum);

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] > max) {
                max = vec[i];
                Imax = i;
            }
            if (vec[i] < min) {
                min = vec[i];
                Imin = i;
            }
        }
        if (Imax > Imin) {
            for (int i = Imin + 1; i < Imax; i++) {
                product *= vec[i];
            }
            System.out.println("The product of numbers : " + product);
        } else {
            for (int i = Imin - 1; i > Imax; i--) {
                product *= vec[i];
            }
            System.out.println("The product of numbers : " + product);
        }

    }
}
