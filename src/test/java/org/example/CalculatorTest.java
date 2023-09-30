package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    void setUp() {
        System.out.println("Начало теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Конец теста");
    }

    Calculator calculator = new Calculator();

    @DisplayName("Проверка сложения")
    @Test
    void add() {
        final var expected = 12;
        final var actual = calculator.add(5, 7);
        assertEquals(expected, actual);
    }

    @DisplayName("Проверка вычитания")
    @Test
    void subtract() {
        final var expected = 2;
        final var actual = calculator.subtract(7, 5);
        assertEquals(expected, actual);

    }

    @DisplayName("Проверка умножения")
    @Test
    void multiply() {
        final var expected = 35;
        final var actual = calculator.multiply(7, 5);
        assertEquals(expected, actual);
    }

    @DisplayName("Проверка деления")
    @Test
    void divide() {
        final var expected = 7;
        final var actual = calculator.divide(35, 5);
        assertEquals(expected, actual);
    }

    @DisplayName("Проверка деления на ноль")
    @Test
    void divideZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(35, 0);
        });
    }
}