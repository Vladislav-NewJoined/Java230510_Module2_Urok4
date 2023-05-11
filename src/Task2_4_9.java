import java.util.InputMismatchException;
import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Task2_4_9 {
    public static void main(String[] args) {
        System.out.println("Задание: \n9.\tПользователь вводит цифру. Если она от 0 до 6 - пусть вводит еще. " +
                "Если 9 - конец. Если 7,8 - пусть вводит строки до тех пор, пока не введет «стоп» (на этом все).\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x, from 0 to 9: ");


        try {


            int x = scanner.nextInt();

            while (x >= 0 && x <= 9) {
                while (x >= 0 && x <= 6) {
                    System.out.print("Enter next number x, from 0 to 9: ");
                    x = scanner.nextInt();

                }
                break;

            }

            while (x == 9) {
                break;
            }

            while (x >= 7 && x <= 8) {
                System.out.print("Enter text in string, until entering 'стоп': ");
                Scanner scanner2 = new Scanner(System.in);
                String str_If_7_Or_8 = scanner2.nextLine();
                while (!str_If_7_Or_8.equals("стоп")) {
                    System.out.print("Enter next text in string, until entering 'стоп': ");
                    Scanner scanner3 = new Scanner(System.in);
                    str_If_7_Or_8 = scanner3.nextLine();
                }
                break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Input incorrect.");

        }
        System.out.println("The program is over.");
    }
}


