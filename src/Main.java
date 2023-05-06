import java.util.*;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, -5.6, 7.8, 5.9, -10.1, 34.6, 23.5, -56.0, 9.8, -10.3, 15.5,};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (num > 0 && isNegative) {
                sum += num;
                amount++;
                System.out.println(num);
            }
        }
        System.out.println("среднее арифметическое: " + sum / amount);
        System.out.println("__________________________________________");
        int[] number = {8, -2, -4, 2, 3, 6, -7};

        sort(number);
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array));

    }
}
