import java.util.Scanner;

public class PasswordApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        System.out.println("=== Passwort Checker ===");

        while (true) {
            System.out.print("Bitte Passwort eingeben: ");
            String password = scanner.nextLine();

            if (checker.isValid(password)) {
                System.out.println("Passwort ist gültig ✅");
                break;  // Beendet die Schleife
            } else {
                System.out.println("Fehler: " + checker.getErrorMessage(password));
            }
        }
        scanner.close();
    }
}
