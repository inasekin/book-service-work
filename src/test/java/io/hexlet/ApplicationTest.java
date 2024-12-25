package io.hexlet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ApplicationTest {
    @Test
    void testMain() {
        // Проверяем, что метод main не выбрасывает исключения
        assertDoesNotThrow(() -> Application.main(new String[]{}));
    }
}
