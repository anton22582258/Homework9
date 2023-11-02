import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;
        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println(" Сумма трат за месяц составила " + salarySum + " рублей. ");

        System.out.println(" Задача 2 ");
        int[] salaryArray1 = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray1));
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int salary : salaryArray1) {
            if (salary < minSum) ;
            {
                minSum = salary;
            }
            if (salary > maxSum) {
                maxSum = salary;
            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + minSum +
                " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей. ");

        System.out.println(" Задача 3 ");
        int[] salaryArray2 = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray2));
        int salarySum1 = 0;
        for (int salary : salaryArray2) {
            salarySum1 += salary;
        }
        double salaryAverage = (double) salarySum1 / salaryArray2.length;
        System.out.println(" Средняя сумма трат за месяц составила " + salaryAverage +
                " рублей. ");

        System.out.println(" Задача 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}