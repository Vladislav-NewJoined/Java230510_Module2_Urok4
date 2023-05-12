import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Task2_4_4 {
    public static void main(String[] args) {
        System.out.println("Задание: \n4.\tПользователь вводит строку. Выводите все слова на разных строках " +
                "(подсказка : if (str.charAt(i)==‘ ‘) System.out.println(); )\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из 2-х или более слов. Пример: 'Я учусь программированию на языке Java':");
        String originString = scanner.nextLine();
        String[] words = originString.split(" ");

        System.out.println();
        System.out.println("Все слова на разных строках:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println("Done!");
    }
}