import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Task2_4_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tПользователь вводит строку, выведите каждый второй символ (подсказка: str.charAt(i) )\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку. Пример: 'I love java':");
        String str = scanner.nextLine();

        for (int i = 1; i < str.length(); i = i + 2) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("Done!");

    }
}