import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2023);

        selectApplication(0,2021);

        int deliveryDays = giveDaysDelivery(141);
        System.out.println("Потребуется дней: " + deliveryDays);

    }
    public static void checkLeapYear(int year){
        if((year%4==0 && year%100 != 0) || year%400==0){
            System.out.println(year + " - високосный год.");
        }
        else{
            System.out.println(year + " - не високосный год.");
        }
    }
    public static void selectApplication(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        }
        else if(clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке:");
        }
        else if(clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке:");
        }
        else if(clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для Android по ссылке:");
        }
        else{
            System.out.println("Неверные параметры");
        }
    }
    public static int giveDaysDelivery(int deliveryDistance){
        int day = 1;
        if (deliveryDistance>20){
            for(int i = 20 ; i < deliveryDistance; i =i+40 ){
                day++;
            }
        }
        return day;}
}