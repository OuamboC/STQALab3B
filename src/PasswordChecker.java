public class PasswordChecker {
    public static String assessPasswordStrength(String password) {
        // Rule 1: Password should have a length less than 8 characters
        if (password.length() < 8) {
            return "Weak";
        }

        // Rule 2: Password should contain at least one uppercase letter.
        if (!containsUppercaseLetter(password)) {
            return "Weak";
        }

        // Rule 3: Password should contain at least one lowercase letter.
        if (!containsLowerCase(password)) {
            return "Weak";
        }

        // Rule 4: Password should contain at least one special character.
        if (!containsSpecialCharacter(password)) {
            return "Average";
        }

        // If all rules are satisfied, the password is considered Strong.
        return "Strong";
    }

    private static boolean containsLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsUppercaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
