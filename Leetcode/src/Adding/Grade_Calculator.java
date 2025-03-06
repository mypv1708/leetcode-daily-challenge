package Adding;

import java.util.Scanner;

public class Grade_Calculator {
    private static boolean IsValidInput(double input) {
        // TODO: Validate input
        return true;
    }

    private static String CalculateGrade(double input) {
        // TODO: Let's rock 'n roll here
        return "F";
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= cases; ++i) {
            double input = Double.parseDouble(scanner.nextLine());

            if (IsValidInput(input)) {
                String grade = CalculateGrade(input);
                System.out.println(
                        String.format("Case %d: %s", i, grade));
            } else {
                System.out.println(
                        String.format("Case %d: Invalid input", i));
            }
        }

        // TODO: Count Grades and Print out summary
    }
}
