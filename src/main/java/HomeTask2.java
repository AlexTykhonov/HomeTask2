import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class HomeTask2 {

    public static void main(String[] args) {

//        Home task 2.

//        1) Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5
        System.out.println("TASK #1");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("");

//        2) Необходимо вывести на экран числа от 1 до 80, вывести толко четные
        System.out.println("TASK #2");
        for (int i2 = 1; i2 <= 80; i2++) {
            if (i2 % 2 == 0) {
                System.out.println(i2);
            }
        }
        System.out.println("");

//        3) Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        System.out.println("TASK #3");
        int i3 = 5;
        while (i3 >= 1) {
            {
                System.out.println(i3);
                i3--;
            }
        }
        System.out.println("");

//        4) Необходимо вывести на экран таблицу умножения на 10
        System.out.println("TASK #4");
        int i4 = 1;
        while (i4 <= 10) {
            {
                System.out.println("Число " + i4 + " умноженное на 10 равно: " + i4 * 10);
                i4++;
            }
        }
        System.out.println("");
//
//        5) Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
        System.out.println("TASK #5");

        boolean checknumber1 = false;
        int num1 = 0;
        int sum5 = 0;

        while (checknumber1 == false) {

            try {
                System.out.print("Input a number : ");
                Scanner in = new Scanner(System.in);
                num1 = in.nextInt();
                checknumber1 = true;
                System.out.println("Мы успешно ввели " + num1);
            } catch (java.util.InputMismatchException exception) {
                checknumber1 = false;
                System.out.println("Пожалуйста, введите целое число!");
            }


        }

        for (int i5 = 1; i5 <= num1; i5++) {
            sum5 = sum5 + i5;
        }
        System.out.println("Результат суммирования чисел от 1 до " + num1 + " составляет:" + sum5);
        System.out.println("");

//        6) Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 70 до 201?

        System.out.println("TASK #6");
        int i = 70;
        while (i <= 201) {
            System.out.println(i);
            i++;
        }
        System.out.println("");

//        7) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

        System.out.println("TASK #7");
        int i7 = 1;
        while ((i7 + 1) / 2 <= 55) {
            {
                System.out.println((i7 + 1) / 2 + " Число последовательности " + i7);
                i7 = i7 + 2;
            }
        }
        System.out.println("");
//
//        8) Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
        System.out.println("TASK #8");
        boolean checknumber8 = false;
        int num8 = 0;
        int intNum8 = 1;
        int intlength = 1;
        int amount = 0;

        while (checknumber8 == false) {

            try {
                System.out.print("Input a number: ");
                Scanner in = new Scanner(System.in);
                num8 = in.nextInt();
                checknumber8 = true;
                System.out.println("Мы успешно ввели " + num8);
            } catch (java.util.InputMismatchException exception) {
                checknumber8 = false;
                System.out.println("Пожалуйста, введите целое число!");
            }
        }

        // пишем цикл определения длины числа   // this CODE DOES NOT WORK well
        boolean checkzero = false;
        do {
            if ((num8 / intNum8) > 1) {
                intlength++;
                intNum8 = intNum8 * 10;
            } else {
                checkzero = true;
                intlength = intlength++;
            }
        } while (checkzero != true);
        System.out.println("Длина числа " + intlength + " символов.");

//        достаем числа в текстовую таблицу.
         String [] myArray = new String[intlength];
         String string = String.valueOf(num8);
        for (int i82 = 1; i82 <=intlength; i82++) {
           myArray[i82-1]= string.substring(i82-1, i82);
        }
//        текстовую таблицу переводим в числовую и суммируем
        for (int i83=1;i83<=intlength;i83++) {
            amount=amount+Integer.parseInt(myArray[i83-1]);
        }

        System.out.println(amount);
        System.out.println("");

        // CODE DOES NOT WORK

//        9) Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
        System.out.println("TASK #9");
        int fibonacci = 0;
        int fibonaccipastone = 0;
        int fibonaccipasttwo = 1;
        for (int i9 = 1; i9 <= 11; i9++) {
            System.out.println(i9 + ". Fibonacci row: " + fibonacci);
            fibonacci = fibonaccipastone + fibonaccipasttwo;
            fibonaccipasttwo = fibonaccipastone;
            fibonaccipastone = fibonacci;
        }
        System.out.println("");


//        10) Используя цикл for написать фрагмент кода, который находит сумму для заданного n: 5 + 10 + 15 + … + 5·n


        System.out.println("TASK #10");

        boolean checknumber10 = false;
        int num10 = 0;
        int sum10 = 0;

        while (checknumber10 == false) {
            try {
                System.out.print("Input a number : ");
                Scanner in = new Scanner(System.in);
                num10 = in.nextInt();
                checknumber10 = true;
                System.out.println("Мы успешно ввели n = " + num10);
            } catch (java.util.InputMismatchException exception) {
                checknumber10 = false;
                System.out.println("Пожалуйста, введите целое число!");
            }
        }

        for (int i10 = 5; i10 <= 5 * num10; i10 = i10 + 5) {
            sum10 = sum10 + i10;
        }
        System.out.println("Сумма чисел 5+10+....5n =" + sum10);
        System.out.println("");


//        11) Сгенерировать число int n = ThreadLocalRandom.current().nextInt(); и если оно четное - вывести в консоль "Число четное", если нечетное - то фразу "Число нечетное"
        System.out.println("TASK #11");

        int n = ThreadLocalRandom.current().nextInt();
        if (n % 2 == 0) {
            System.out.println("Рандомное число " + n + "оказалось четным");
        } else System.out.println("Рандомное число " + n + " оказалось нечетным");
        System.out.println("");

    }
}
