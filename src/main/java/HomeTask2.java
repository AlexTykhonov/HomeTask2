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
        int i3=5;
        while(i3 >= 1) {
            {
                System.out.println(i3);
                i3--;
            }
        }
        System.out.println("");

//        4) Необходимо вывести на экран таблицу умножения на 10
        System.out.println("TASK #3");
        int i4=1;
        while(i4 <= 10) {
            {
                System.out.println("Число "+i4+" умноженное на 10 равно: "+i4*10);
                i4++;
            }
        }
        System.out.println("");
//       
//        5) Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

//        6) Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 70 до 201?

//        7) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

//        8) Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).

//        9) Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

//        10) Используя цикл for написать фрагмент кода, который находит сумму для заданного n: 5 + 10 + 15 + … + 5·n

//        11) Сгенерировать число int n = ThreadLocalRandom.current().nextInt(); и если оно четное - вывести в консоль "Число четное", если нечетное - то фразу "Число нечетное"

    }
}
