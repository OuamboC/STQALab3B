public class Main {
    public static void main(String[] args) {
        // Example usage of the Cylinder class
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume(100, 40));

        // Example usage of the PasswordChecker class
        String password = "Hello!";
        String strength = PasswordChecker.assessPasswordStrength(password);
        System.out.println("Password Strength: " + strength);

        String password1 = "JavaDevs";
        String strength1 = PasswordChecker.assessPasswordStrength(password1);
        System.out.println("Password 1 Strength: " + strength1);

        String password2 = "CanisBrealOuamboIsReadytohelpInTeamsAsSoftwareEngineer!";
        String strength2 = PasswordChecker.assessPasswordStrength(password2);
        System.out.println("Password 2 Strength: " + strength2);

        String password3 = "I am a Third Year Student BSc (Hons) Software Engineering at Manchester Metropolitan University.";
        String strength3 = PasswordChecker.assessPasswordStrength(password3);
        System.out.println("Password 3 Strength: " + strength3);

        String password4 = "I'm eager to contribute to innovative projects and collaborate with dynamic teams!";
        String strength4 = PasswordChecker.assessPasswordStrength(password4);
        System.out.println("Password 4 Strength: " + strength4);

        String password5 = "IfYouInterestedcONTACTOnl;my@email";
        String strength5 = PasswordChecker.assessPasswordStrength(password5);
        System.out.println("Password 5 Strength: " + strength5);
    }
}
