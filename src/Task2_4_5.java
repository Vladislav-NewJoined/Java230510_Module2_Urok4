import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Task2_4_5 {
    public static void main(String[] args) {
        System.out.println("Задание: \n5.\tПользователь вводит строку. Выведите первые 3 слова\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из 3-х или более слов. Пример: 'Я учусь программированию на языке Java':");
        String originString = scanner.nextLine();
        try {
            String[] words = originString.split(" ");
            String word1 = words[0];
            String word2 = words[1];
            String word3 = words[2];

            System.out.println();
            System.out.println("Первые три слова из введённой строки:");
            System.out.println(word1 + " " + word2 + " " + word3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input incorrect.");

        }

        System.out.println();
        System.out.println("Done!");

    }
}