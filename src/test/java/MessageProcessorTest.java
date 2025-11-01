import org.junit.jupiter.api.Test;
import ru.urfu.MessageProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для обработчика сообщений
 */
class MessageProcessorTest {
    private final MessageProcessor p = new MessageProcessor();

    /**
     * Обработка сообщения
     */
    @Test
    void ok_normal() {
        assertEquals("Ваше сообщение: 'hello'", p.processMessage("hello"));
    }

    /**
     * Обработка пустой строки
     */
    @Test
    void ok_empty() {
        assertEquals("Ваше сообщение: ''", p.processMessage(""));
    }

    /**
     * Обработка null строки
     */
    @Test
    void ok_null_toString() {
        assertEquals("Ваше сообщение: 'null'", p.processMessage(null));
    }

}
