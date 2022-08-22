package ru.skypro;

public class Main {
    public static void main(String[] args) {
        //task1
        boolean clientOS = true;
        if(clientOS){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //task2
        int clientDeviceYear = 2014;
        if(clientOS && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }else if(clientOS && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

        if(!clientOS && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }else if(!clientOS && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //task3
        int year = 2004;
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("...год является високосным");
        }else {
            System.out.println("...год не является високосным");
        }

        //task4
        int deliveryDistance = 100;
        int day;
        if(deliveryDistance<=20){
            day=1;
            System.out.println("Потребуется дней: " + day);
        }else if(deliveryDistance>20&&deliveryDistance<=60){
            day=2;
            System.out.println("Потребуется дней: " + day);
        }else if(deliveryDistance>60&&deliveryDistance<=100){
            day=3;
            System.out.println("Потребуется дней: " + day);
        }

        //task5
        int monthNumber = 0;
        String[] seasons = new String[]{"winter","spring","summer","autumn"};
        String season = switch (monthNumber) {
            case 12,1,2 -> seasons[0];
            case 3,4,5 -> seasons[1];
            case 6,7,8 -> seasons[2];
            case 9,10,11 -> seasons[3];
            default -> "Введите число от 1 до 12";
        };
        System.out.println(season);
    }
}
