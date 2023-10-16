package com.adrain.adrainspringboottest.service;

import static org.junit.jupiter.api.Assertions.*;

// src/test/java/com/example/demo/service/CalculatorServiceTest.java

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void add_shouldReturnSum() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculatorService.add(a, b);

        // Assert
        assertEquals(8, result);
    }
}
