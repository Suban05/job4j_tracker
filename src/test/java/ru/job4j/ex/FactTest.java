package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }

    @Test
    public void whenNotException() {
        int expected = 24;
        int result = new Fact().calc(4);
        assertThat(result).isEqualTo(expected);
    }
}