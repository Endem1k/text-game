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
        for (int i = 1; i <= 5; ++i) {
            onNewDay(i);
        }
        onFinish();
        onStartP();
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
    void onNewDay(int dayNumber) {
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
        }if(action.equals("код")) {
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
       */

    }

    void onStartP() {


}
    /*
     * Метод вызывается по завершению игры.l
     */
    void onFinish() {

    }

}

