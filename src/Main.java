public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2009;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        int year = 1902;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным");
        } else {
            System.out.println(year + " Не является високосным");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;}
        if (deliveryDistance > 60) {
            deliveryDays++;}
        System.out.println("Потребуется дней " + deliveryDays);}
    public static void task5() {
        int mounthNumber = 12;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неккоректный месяц " + mounthNumber);

        }
    }
}