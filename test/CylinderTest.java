import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class CylinderTest {

//        private Cylinder cylinder;
//
//        @BeforeEach
//        void setUp(){
//            //Act
//            cylinder = new Cylinder();
//        }
//        @DisplayName("Radius : 1 , Height : 1")
//        @Test
//        void testCalculateVolumeWithRadius1Height1_Expected3Point14(){
//            //Arrange
//            double actualResult = cylinder.calculateVolume(1,1);
//            //Assert
//            assertEquals(3.4,actualResult);
//
//        }
//
//        @DisplayName("Radius: 2 , Height:2")
//        @Test
//        void testCalculateVolumeWithRadius2Height2_Expected25Point13(){
//            //Arrange
//            double actualResult = cylinder.calculateVolume(2,2);
//            //Assert
//            assertEquals(25.13, actualResult);
//
//         }
//        @DisplayName("Radius:3, Height:3")
//        @Test
//        void testCalculateVolumeWithRadius3Height3_Expected84Point82() {
//            //Arrange
//            double actualResult = cylinder.calculateVolume(3,3);
//            //Assert
//            assertEquals(84.82, actualResult);
//
//        }
//        @DisplayName("Radius:0, Height:1")
//        @Test
//        void testCalculateVolumeWithRadius0Height1_Expected0() {
//        //Arrange
//        double actualResult = cylinder.calculateVolume(0,1);
//        //Assert
//        assertEquals(0.0, actualResult);
//
//        }
//        @DisplayName("Radius:1, Height:0")
//        @Test
//        void testCalculateVolumeWithRadius1Height0_Expected0(){
//            //Arrange
//            Cylinder cylinder = new Cylinder();
//            double actualResult = cylinder.calculateVolume(1,0);
//            //Assert
//            assertEquals(0.0, actualResult);
//        }
//    private Cylinder cylinder;
//    @BeforeEach
//    void setUp(){
//        //Act
//        cylinder = new Cylinder();
//    }
//    /**
//     * We agree that being able to provide the tests we want to run as a list of strings is more
//     * convenient than creating an individual test method for each test case.
//     */
//
//    /**
//     *
//     * @param radius
//     * @param height
//     * @param expectedVolume
//     */
//
//    @ParameterizedTest
//    @CsvSource({
//            "1.0, 1.0, 3.14",
//            "2.0, 2.0, 25.13",
//            "3.0, 3.0, 84.82",
//            "0.0, 1.0, 0.0",
//            "1.0, 0.0, 0.0",
//            "0.0, 0.0, 0.0"
//    })
//    void testCalculateVolume(double radius, double height, double expectedVolume){
//
//        //Act
//        double actualVolume = cylinder.calculateVolume(radius, height);
//        //Assert
//        assertEquals(expectedVolume, actualVolume,
//                "Cylinder with radius of " + radius + "height of " + height +
//                "did not produce expected result of " +expectedVolume +
//                ", Instead produced: " + actualVolume);
//    }

    private Cylinder cylinder;
    @BeforeEach
    void setUp(){
        //Arrange
        cylinder = new Cylinder();
    }
     /**
      * Refactoring the last uncommented code above using CSV file to store and execute the test instead of having the test case in -line
     * Let's have a clear separation of the test method and the data we want to pass to it .
     * We will then use @ CsvFileSource to denote that our test data is going to come from a  dedicated CSV file
     */
    @DisplayName("Test calculate volume[radius, height, expectedVolume]")
    @ParameterizedTest
    @CsvFileSource(resources = "/calculateVolume.csv")
    void testCalculateVolume(double radius, double height, double expectedVolume) {
        //Act
        double actualVolume = cylinder.calculateVolume(radius, height);
        //Assert
        assertEquals(expectedVolume, actualVolume,
                "Cylinder with radius of " + radius + "height of " + height +
               "did not produce expected result of " +expectedVolume +
               ", Instead produced: " + actualVolume
                );
    }





}