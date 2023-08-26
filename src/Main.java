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

    }

}