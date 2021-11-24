package com.company;

public class Main {

    public static void main(String[] args) {
        // taskOne();
        // taskTwo();
        // taskThree();


    }

    public static void taskOne(){

        // Задание 1

        int count = 0;
        while (count <10){
            count++;
            System.out.print(count + " ");



        }
        System.out.println(" ");

        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    public static void taskTwo(){
        // Задание 2

        int dayOfFriday = 5;

        for (int i = 1; i <= 31; i++){
            if ((i-dayOfFriday) % 7 == 0){
                System.out.println("Сегодня пятница, " + i + "-е число");
            }
        }

    }

    public static void taskThree(){
        // Задание 3

        int currentYear = 2021;
        int previousPeriod = 200;
        int nextPeriod = 100;


        for (int i = currentYear - previousPeriod; i <= currentYear + nextPeriod; i++){

            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        }



}
