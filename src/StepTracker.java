import java.util.Scanner;

public class StepTracker {

    MonthData[] monthToData;
    int stepGoal;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
        stepGoal = 10000;
    }

    public void changeStep(Scanner scanner) {

        System.out.println("Выберете месяц 0-11");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Выберете день 0-29");
        int numberOfDays = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int step = scanner.nextInt();
        monthToData[numberOfMonth].stepsOnCurrentDay[numberOfDays] = step;
    }

    public void showStats() {

    }

    public void changeStepGoal(Scanner scanner) {
        System.out.println("Введите новое целевое значение");
        stepGoal = scanner.nextInt();
    }

    public int stepsSum(Scanner scanner, int numberOfMonth){
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + monthToData[numberOfMonth].stepsOnCurrentDay[i];
        }
        return sum;
    }
    public int stepsAvg(Scanner scanner) {
        int avg = 0;
        int sum = 0;
        System.out.println("Выберете месяц 0-11");
        int numberOfMonth = scanner.nextInt();
        for (int i = 0; i < 30; i++) {
            sum = sum + monthToData[numberOfMonth].stepsOnCurrentDay[i];
        }
       return avg = sum / 30;
    }
    public int maxSteps(Scanner scanner, int numberOfMonth){
        int max = monthToData[numberOfMonth].stepsOnCurrentDay[0];
        for (int i = 0; i < 30; i++) {
            max = Math.max(max,monthToData[numberOfMonth].stepsOnCurrentDay[i]);
        }
        return max;
    }

    class MonthData {
        int[] stepsOnCurrentDay;

        public MonthData() {
            stepsOnCurrentDay = new int[30];
        }
    }
}
