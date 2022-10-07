import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        int command;

        while (true){
            printMenu();
            command = scanner.nextInt();
            if (command == 1) {
                stepTracker.changeStep(scanner);
            } else if (command == 2) {

            } else if (command == 3) {
                stepTracker.changeStepGoal(scanner);
            } else if (command == 4) {
                System.out.println("Пока!");
                break;
            } else
                System.out.println("Нет допустимого раздела меню. Выберете рездел снова!");

        }

        System.out.println(stepTracker.stepsAvg(scanner));
        System.out.println(stepTracker.maxSteps(scanner,0));




        }
        public static void printMenu(){
            System.out.println("1.Ввести количество шагов за определённый день");
            System.out.println("2.Напечатать статистику за определённый месяц");
            System.out.println("3.Изменить цель по количеству шагов в день");
            System.out.println("4.Выйти из приложения");
        }

    }
