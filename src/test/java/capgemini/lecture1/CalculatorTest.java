package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("When we add two positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(1, 2) > 0);
    }

    @Test
    @DisplayName("When we add two big positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoBigPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE) > 0);
    }

    @Test
    @DisplayName("When we minus two positive numbers we receive expected number")
        //Given-When-Then
    void minus_twoIntNumbers_expectedNumber() {
        assertTrue(calculator.minus(3, 7) == -4);
    }

    @Test
    @DisplayName("When we division two int numbers we receive expected number")
        //Given-When-Then
    void division_twoIntNumbers_expectedNumber() {
        assertTrue(calculator.division(10, 8) == 1.25);
    }

    @Test
    @DisplayName("When we multiplicate two int numbers we receive expected number")
        //Given-When-Then
    void multiplicate_twoIntNumbers_expectedNumber() {
        assertTrue(calculator.multip(3, 7) == 21);
    }
}