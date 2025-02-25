package _02._2;

/*
Чётные и нечётные циферки
Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1


Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
3. Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
4. Программа должна выводить текст на экран.
5. Выведенный текст должен соответствовать заданию.*/

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int even = 0;
        int odd = 0;

        if (number > 0) {
            while (number != 0) {
                int num = number % 10;
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                number = number / 10;
            }
        }else {
            System.out.println("Число должно быть больше нуля!!!!!!");
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}

