// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Task2_4_1 {
    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tС помощью цикла do..while, выведите римские цифры (код начинается с 8544). Начало: char c = 8544; ...\n\nРешение: ");

        char numRoman = 8544;
        char numRomanEnd = 8559;

        do {
            System.out.print(numRoman + ", ");
            numRoman++;
        } while (numRoman <= 8558);

        do {
            System.out.print(numRomanEnd + " ");
            numRoman++;
        } while (numRoman == 8559);

        System.out.println("\n");
        System.out.println("Done!");
    }
}