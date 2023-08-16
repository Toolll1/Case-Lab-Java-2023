package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фразу/слово для проверки на принадлежность к палиндромам");

        String palindrome = scanner.nextLine();

        if (check(palindrome)) {
            System.out.println(palindrome + " - является палиндромом");
        } else {
            System.out.println(palindrome + " - не является палиндромом");
        }
    }

    private static boolean check(String palindrome) {

        String string = palindrome.toLowerCase().trim().replaceAll(" ", "");
        String revers = new StringBuffer(string).reverse().toString();

        return string.equals(revers);
    }
}
