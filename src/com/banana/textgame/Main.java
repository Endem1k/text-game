package com.banana.textgame;

import java.util.Scanner;

public class Main {

    /*
     * Главный метод.
     * АБДЯЯЯЯЯЯЯдяяяяяlhhhjl
     */

    public static void main(String[] args) {
        // вызывает метод start()
        new Main().start();
    }

    /*
     * Метод с логикой игры.
     */
    private void start() {

        onStart();
        for (int e = 1; e <= 31; e = e + 2) {

            onFinish(e);

        }


    }

    /*
     * Метод вызывается один раз при старте игры.
     */
    void onStart() {
        Scanner па = new Scanner(System.in);
        System.out.println("Ты кто такой?");
        String ответ = па.nextLine();
        System.out.println("ПОШЕЛ ВОН!ВИДЕТЬ ТЕБЯ НЕ ХОЧУ!ЗАКРОЙ ЭТО ОКНО,БЫСТРО!" + ответ);

    }

    int индус = 0;

    /*
     * Метод вызывается каждый игровый день.ЖЗШ
     * Единственный параметр: dayNumber - номер текущеvго игрового дня.
     */
   /* void onNewDay(int dayNumber) {
        System.out.println("День номер" + dayNumber + "");
        Scanner па = new Scanner(System.in);
        System.out.println("Ваше действие");
        String action = па.nextLine();

        if (action.equals("кофе")) {
            if (Math.random() > 0.5) {
                индус -= 2;
                System.out.println("Минус деньги, которые я мог потратить на еду");


            } else {
                System.out.println("Еще раз, я купил это дешевое кофе");
            }
        } else if (action.equals("код")) {
            System.out.println("Ваш код на сегодня");
            String код = па.nextLine();
            индус = индус + код.length();
            System.out.println("Бабло Индуса:" + dayNumber + "$.");
        } else {
            System.out.println("Че это такое?");
        }
  /*
        boolean startsWithSpaces = код.startsWith(" ");
        boolean endsWithSpaces = код.endsWith(" ");
        boolean result = startsWithSpaces && endsWithSpaces;
        System.out.println("Халявщик: " + result);


    }

  /*  void onStartP(int dayNumber2) {
        System.out.println("День номер" + dayNumber2 + "");
        Scanner па = new Scanner(System.in);
        System.out.println("Ваше действие");
        String action = па.nextLine();
        switch (action) {
            case "код":
                System.out.println("Ваш код на сегодня");
                String код = па.nextLine();
                индус = индус + код.length();
                System.out.println("Бабло Индуса:" + dayNumber2 + "$.");
            break;
            case "кофе":
                индус -= 2;
                System.out.println("Минус деньги, которые я мог потратить на еду");
            break;
            default:
                System.out.println("Че это такое?");
        }
    }
 */

    /*
     * Метод вызывается по завершению игры.
     */



    void onFinish(int dayNumber2) {
        System.out.println("День номер" + dayNumber2 + "");

        String dollarString = "";
        for (int i = 0; i < индус ; i += 1) {
            dollarString = dollarString + "$";
        }
        System.out.println("Вашм бабосики: " + dollarString + ".");

        Scanner па = new Scanner(System.in);
        System.out.println("Ваше действие");
        String action = па.nextLine();
        switch (action) {
            case "код":

                System.out.println("Ваш код на сегодня");
                String код = па.nextLine();
                индус = индус + код.length();
                System.out.println("Бабло Индуса:" + индус + "$.");
                break;
            case "кофе":
                if (Math.random() > 0.5) {
                    индус -= 2;
                    System.out.println("Минус деньги, которые я мог потратить на еду");


                } else {
                    System.out.println("Еще раз, я купил это дешевое кофе");
                }
                break;
            default:
                System.out.println("Че это такое?");
        }
    }

}

