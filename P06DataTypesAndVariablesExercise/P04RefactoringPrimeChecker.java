package P06DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isValidNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isValidNumber = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isValidNumber);
        }


    }
}