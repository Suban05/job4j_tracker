package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    public void whenAddItemThenNotEqual() {
        String[] answers = {"Test"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("test");
        assertThat(created.getName()).isNotEqualTo(expected.getName());
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        String[] answers = {"test"};
        Input input = new StubInput(answers);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        int id = created.getId();
        String[] deleteAnswers = {String.valueOf(id)};
        StartUI.deleteItem(new StubInput(deleteAnswers), tracker);
        assertThat(tracker.findById(id)).isEqualTo(null);
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }
}