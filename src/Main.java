import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //метод main
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача №1");
        int totalPay = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPay = totalPay + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalPay + " рублей");
        System.out.println("___________________");
        System.out.println("Задача №2");
        int maxPay = 99999;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxPay) {
                maxPay = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPay + " рублей");
        int minPay = 200001;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current < minPay) {
                minPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей");
        System.out.println("___________________");
        System.out.println("Задача №3");
        double everPay = totalPay / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + everPay + " рублей");
    }

}