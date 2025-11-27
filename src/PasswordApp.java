import java.util.Scanner;

public class PasswordApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        System.out.println("=== Passwort Checker ===");

        boolean valid = false;

        while (!valid) {
            System.out.print("Bitte Passwort eingeben: ");
            String password = scanner.nextLine();

            if (checker.isValid(password)) {
                System.out.println("Passwort ist gültig ✅");
                valid = true;
            } else {
                System.out.println("Fehler: " + checker.getErrorMessage(password));
                System.out.println("Bitte erneut versuchen.\n");
            }
        }

        scanner.close();
    }
}
