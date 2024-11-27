import java.lang.management.GarbageCollectorMXBean;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int clientOS = 1;
        String getAnser = clientOS == 1 ? "Установите версию приложения для Android по ссылке" : "Установите версию приложения для iOS по ссылке";
        System.out.println(getAnser);

        int clientDeviceYear = 2015;
        String getAnserYear = clientOS == 1 ?
                clientDeviceYear >= 2015 ? "Установите обычную версию приложения для Android по ссылке" : "Установите облегченную версию приложения для Android по ссылке"
                : clientDeviceYear >= 2015 ? "Установите обычную версию приложения для IOS по ссылке" : "Установите облегченную версию приложения для IOS по ссылке";
        System.out.println(getAnserYear);

        int Year = 2021;
        boolean TR = (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);
        if (TR) {
            System.out.println(Year + " Высокосный");
        } else {
            System.out.println(Year + " Невысокосный");
        }
        int deliveryDistance = 115;
        int countDay = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + countDay);
        }else {
            countDay += 1;
            if (deliveryDistance <= 60) {

                System.out.println("Потребуется дней: " + countDay);
            }else{
                    countDay +=1;
                    if (deliveryDistance <= 100){

                        System.out.println("Потребуется дней: " + countDay);
                    }else System.out.println("доставки нет");
                }

        }

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