package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppGreeting() {
        assertEquals("Hello, World!", App.getGreeting());
    }
}