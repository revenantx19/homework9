public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
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

    public static void task1() {
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(i + " " + arr[i]);
            summa += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minimum = arr[0];
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(i + " " + arr[i]);
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double summa = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(i + " " + arr[i]);
            summa += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + summa / arr.length + " рублей");
    }

}