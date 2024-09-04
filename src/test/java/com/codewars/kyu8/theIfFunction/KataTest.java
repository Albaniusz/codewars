package com.codewars.kyu8.theIfFunction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @DisplayName("Test true")
    @Order(1)
    @Test
    void testTrue() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        Kata._if(true, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("true function", actual.get());
    }

    @DisplayName("Test false")
    @Order(2)
    @Test
    void testFalse() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        Kata._if(false, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("false function", actual.get());
    }

    @DisplayName("Test falsy value (null)")
    @Order(3)
    @Test
    void testFalsy() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        Kata._if(null, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("false function", actual.get());
    }
}
