import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

// видеоурок с примером решения здесь: Модуль 1 Урок 2, мин 25.28
public class Task2_4_6 {
    public static void main(String[] args) {
        System.out.println("Задание: \nПользователь вводит строку, выведите ее задом-наперёд.\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String originString = scanner.nextLine();
        System.out.println();
        System.out.println("Строка, перевернутая задом-наперед:");
        String reversedString = reverse(originString);
        System.out.println(reversedString);

        System.out.println();
        System.out.println("Done!");

    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}