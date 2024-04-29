package dk.kea.unittestdemo.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    //Arrange
    @Autowired
    private Calculator calculator;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addPositiveNumbers() {
        //Act
        int result = calculator.addPositiveNumbers(2, 4);
        //Assert
        assertEquals( 6, result, "Test af positive tal");
    }

    @Test
    void addNegativeNumber(){

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.addPositiveNumbers(-2,4));
    }

    @Test
    void addPostiviteAccuracy(){
        //Act
        int result = calculator.addPositiveNumbers(2000, 200);
        //Assert
        assertEquals(2201, result, 10, "Fejl på decimalerne");
    }
}