package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.ex.Fact;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenManyValidInput() {
        Output out = new StubOutput();
        String[] answers = {"1", "3", "4", "5"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        for (String answer : answers) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(Integer.parseInt(answer));
        }
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"-1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }

    @Test
    public void whenInvalidStringInput() {
        Output out = new StubOutput();
        ArrayIndexOutOfBoundsException exception = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> {
                    Input in = new StubInput(new String[] {"start"});
                    ValidateInput input = new ValidateInput(out, in);
                    int selected = input.askInt("Enter menu:");
                    assertThat(selected).isEqualTo(1);
                });
        assertThat(exception.getMessage()).isEqualTo("Index 1 out of bounds for length 1");
    }
}