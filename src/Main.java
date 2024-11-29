import java.lang.management.GarbageCollectorMXBean;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }


        System.out.println(2);

        int clientDeviceYear = 2015;
        String yearManufacture = clientOS == 1 ? clientDeviceYear >= 2015 ? "Установите обычную версию приложения для Android по ссылке" : "Установите облегченную версию приложения для Android по ссылке" : clientDeviceYear >= 2015 ? "Установите обычную версию приложения для IOS по ссылке" : "Установите облегченную версию приложения для IOS по ссылке";
        System.out.println(yearManufacture);

        System.out.println(3);
        int Year = 2021;

        boolean leapYear = (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);
        if (leapYear) {

            System.out.println(Year + " Высокосный");
        } else {
            System.out.println(Year + " Невысокосный");
        }

        System.out.println(4);

        int deliveryDistance = 115;
        int countDay = 1;


        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + countDay);
        }
        countDay += 1;
        if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + countDay);
        }
        countDay += 1;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + countDay);
        } else System.out.println("доставки нет");


        System.out.println(5);
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Некорректный номер месяца");
                break;
        }


    }


}