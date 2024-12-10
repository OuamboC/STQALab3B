import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
    /**
     * I should focus my testing on assessPasswordStrength method which accepts a String as a Password
     * Note: assessPasswordStrength method is static - so I don't need to create an object of the
     * PasswordChecker class in order to call this method.
     */
//    private PasswordChecker passwordChecker;
//    @BeforeEach
//    void setup(){
//        passwordChecker = new PasswordChecker();
//    }
//    @DisplayName("Weak")
//    @ParameterizedTest
//    @CsvSource({
//        "abc, Weak",//Password should have a minimum length of less than 8 characters.
//        "awsedrfctg, Weak",//Password does not contain at least one uppercase letter.
//        "12453@, Weak",//Password does not contain at least one lowercase letter
//        "ggyufgyfyddxrtrt56575, Weak",//Password does not contain at least one special character.
//        "Abcdefgh, Weak", //Password does not contain at least one special character.
//        "12345678, Weak" //Password does not contain at least one uppercase letter.
//    })
//    void testAssessPasswordStrength_WithWeakPassword_ShouldReturnWeak(String password, String expectedRule){
//        String actualRule =PasswordChecker.assessPasswordStrength(password);
//        assertEquals(expectedRule, actualRule,
//                "\nPassword: " + password +
//                "\nRule 1: Should have a length less than 8 characters\n" +
//                "Rule 2: Password should contain at least one uppercase letter.\n" +
//                "Rule 3: Password should contain at least one lowercase letter.\n"
//        );
//    }
//    @DisplayName("Average")
//    @ParameterizedTest
//    @CsvSource({
//            "powstr, Average",//Password has a minimum length of 8 characters or more.
//            "Canisiscoding, Average",//Password contains at least one uppercase letter.
//            "SOFTWARETESTINg, Average",//Password contains at least one lowercase letter.
//            "ghcgydFGUIIJYHG, Average",//Password does not contain at least one special character.
//
//            "Hello123, Average"//Password has a minimum length of 8 characters or more.
//    })
//    void testAssessPasswordStrength_WithAveragePassWord_ShouldReturnAverage(String password, String expectedRule){
//        String actualRule =PasswordChecker.assessPasswordStrength(password);
//        assertEquals(expectedRule, actualRule,
//                "\nPassword: " + password +
//                "\nRule 4: Password should contain at least one special character.\n"
//        );
//    }
//    @DisplayName("Strong")
//    @ParameterizedTest
//    @CsvSource({
//            "Strong@123, Strong",//Password contains at least one special character.
//            "P@ssw0rd, Strong",//Password contains at least one special character.
//            "@ParametirzedTest@CsvSource, Strong",//Password has a minimum length of 8 characters or more.
//            "Christmas, Strong",//Password contains at least one uppercase letter.
//            "200000lowerCase, Strong", //Password contains at least one lowercase letter.
//
//    })
//    void testAssessPasswordStrength_WithStrongPassWord_ShouldReturnStrong(String password, String expectedRule){
//        String actualRule =PasswordChecker.assessPasswordStrength(password);
//        assertEquals(expectedRule, actualRule,
//                "\nPassword: " +password +
//                        "\nRule 1: Should have a length less than 8 characters\n" +
//                        "Rule 2: Password should contain at least one uppercase letter.\n" +
//                        "Rule 3: Password should contain at least one lowercase letter.\n"
//        );
//    }

    /**
     * Let's have a clear separation of the test method and the data we want to pass to it .
     * We will then use @ CsvFileSource to denote that our test data is going to come from a  dedicated CSV file
     */
    @DisplayName("Weak")
    @ParameterizedTest
    @CsvFileSource( resources = "/assessPasswordStrengthWithWeakPassword.csv")
    void testAssessPasswordStrength_WithWeakPassword_ShouldReturnWeak(String password, String expectedRule) {
        String actualRule = PasswordChecker.assessPasswordStrength(password);
        assertEquals(expectedRule, actualRule,
                "\nPassword: " + password +
                        "\nRule 1: Should have a length less than 8 characters\n" +
                        "Rule 2: Password should contain at least one uppercase letter.\n" +
                        "Rule 3: Password should contain at least one lowercase letter.\n"
        );

    }

    @DisplayName("Average")
    @ParameterizedTest
    @CsvFileSource(resources = "/assessPasswordStrengthWithAveragePassword.csv")
    void testAssessPasswordStrength_WithAveragePassWord_ShouldReturnAverage(String password, String expectedRule){
        String actualRule =PasswordChecker.assessPasswordStrength(password);
        assertEquals(expectedRule, actualRule,
                "\nPassword: " + password +
                        "\nRule 4: Password should contain at least one special character.\n"
        );
    }

    @DisplayName("Strong")
    @ParameterizedTest
    @CsvFileSource(resources = "/assessPasswordStrengthWithStrongPassword.csv")
    void testAssessPasswordStrength_WithStrongPassWord_ShouldReturnStrong(String password, String expectedRule){
        String actualRule =PasswordChecker.assessPasswordStrength(password);
        assertEquals(expectedRule, actualRule,
                "\nPassword: " +password +
                        "\nRule 1: Should have a length less than 8 characters\n" +
                        "Rule 2: Password should contain at least one uppercase letter.\n" +
                        "Rule 3: Password should contain at least one lowercase letter.\n"
        );
    }




}