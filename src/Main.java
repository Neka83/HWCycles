//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    System.out.println(" // Task 1");
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }
        System.out.println("// Task 2");
    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }
        System.out.println("// Task 3");
    for (int i = 0; i <= 17; i+=2) {
        System.out.println(i);
    }
        System.out.println("// Task 4");
    for (int i = 10; i >= -10; i--){
        System.out.println(i);
    }
        System.out.println("// Task 5");
    for (int i = 1904; i <= 2096; i = i + 4) {
        System.out.println(i+ " год является високосным");
    }
        System.out.println("// Task 6");
    for (int i = 7; i <= 98; i += 7) {
        System.out.println(i + "");
    }
        System.out.println("// Task 7");
    for (int i = 1; i <= 512; i *= 2) {
        System.out.println(i + "");
    }
        System.out.println("// Task 8");
    int monthlyDeposit = 29000;
    int totalSavings = 0;
    for (int i = 1; i <= 12; i++) {
        totalSavings += monthlyDeposit;
        System.out.println("Месяц " +i+ " , сумма накоплений равна " +totalSavings+ " рублей");
    }
        System.out.println("// Task 9");
    int monthDeposit = 29000;
    double savingsTotal = 0;
    for (int i = 1; i <= 12; i++) {
        savingsTotal += savingsTotal * 0.01;
        savingsTotal += monthDeposit;
        System.out.println("Месяц " +i+ ", сумма накаплений равна " + (int) savingsTotal + " рублей");
    }
        System.out.println("// Task 10");
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("2 * " +i+ "=" + (2 * i));


        }
    }

}
