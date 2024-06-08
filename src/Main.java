public class Main {

    public static void checkIfYearIsLeap(int year) {
        if (year < 1584) {
            System.out.println(year + " год — невисокосный год");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void determineMobileAppVersionToInstall(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неподдерживаемое значение clientOS");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неподдерживаемое значение clientOS");
            }
        }
    }

    public static void calculateDeliveryTimeInDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка невозможна");
        }
    }

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        checkIfYearIsLeap(1900);

        //Task 2
        System.out.println("\nTask 2");

        determineMobileAppVersionToInstall(0, 2014);

        //Task 3
        System.out.println("\nTask 3");

        calculateDeliveryTimeInDays(96);

        System.out.println();
    }
}