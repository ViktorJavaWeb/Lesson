/**
 * Created by Er on 21.07.2016.
 */
public class Lessen1 {

   /*
    1. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран
    результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21,
    а в w хранится 8):         21 / 8 = 2 и 5 в остатке
    */


    public static void oneTask(){
        int q = 21, w = 8;
        System.out.print("Результат деления - " + q/w +"\n");
        System.out.println("Результат деления в остатке - " + q % w);
    }

     /*2. В переменной n хранится натуральное двузначное число.Создайте программу, вычисляющую и выводящую
        на экран сумму цифр числа n.*/

    public static void twoTask() {
        int n2 = 99, k2 = 0, k4 = 0;
        k2 = n2 % 10 + (n2 / 10);
        System.out.println("Сумма цифр числа (" + n2 + ") - " + k2);
    }

    /* 3. В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.*/

    public static void threeTask(){

        double b = 3.5545453;
        double z = b%(int)b + b;
        System.out.println("число (" + b + ") - " + (int)z);
    }



        /*4. В переменной n хранится натуральное трёхзначное число.Создайте программу, вычисляющую и
        выводящую на экран сумму цифр числа n.*/

    public static void fourTask() {
        int n3 =555, k3 = 0, k4 = 0, n4 = 0;
        k3 = n3/100;                  // выделяем сотни
        k4 = (n3-((n3/100)*100))/10; // выделяем десятки
        n4 = n3%10;                  // выделяем единицы
        System.out.println("число (" + n3 + ") - " + (k3 + k4 + n4));

        /*тоже рабочий код*/
        // n3 = n3%10 + ((n3-((n3/100)*100))/10) + n3/100;
        // System.out.println("summ 3 - " + n3);
    }




}