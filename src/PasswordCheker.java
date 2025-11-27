public class PasswordChecker {

    // Häufig verwendete, unsichere Passwörter
    private static final String[] BLACKLIST = {
            "123456",
            "123456789",
            "passwort",
            "password",
            "qwertz",
            "qwerty",
            "111111",
            "abc123",
            "password1",
            "12345678",
            "iloveyou",
            "admin"
    };

    // Prüft die PW Länge
    public boolean isLongEnough(String password) {
        return password.length() >= 8;
    }

    // Prüft ob eine Zahl inkludiert ist
    public boolean containsNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Prüft, ob das Passwort in der Blacklist steht
    public boolean isBlacklisted(String password) {
        for (String bad : BLACKLIST) {
            if (bad.equalsIgnoreCase(password)) {
                return true;
            }
        }
        return false;
    }

    // Prüft ob alle Kriterien zutreffen
    public boolean isValid(String password) {
        return isLongEnough(password)
                && containsNumber(password)
                && !isBlacklisted(password);
    }

    // Je nach Szenario, erscheint die entsprechende Meldung
    public String getErrorMessage(String password) {
        if (isBlacklisted(password)) {
            return "Passwort ist zu unsicher!";
        }
        if (!isLongEnough(password)) {
            return "Passwort ist zu kurz (mind. 8 Zeichen)!";
        }
        if (!containsNumber(password)) {
            return "Passwort muss mindestens eine Zahl enthalten!";
        }
        return "";
    }
}
