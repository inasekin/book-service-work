package io.hexlet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ApplicationTest {
    @Test
    void testMain() {
        assertDoesNotThrow(() -> Application.main(new String[]{}));
    }
}
