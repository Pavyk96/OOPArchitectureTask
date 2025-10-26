import org.junit.jupiter.api.Test;
import ru.urfu.MessageProcessor;
import ru.urfu.MessageProcessorImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для класса обработчика
 */
class ChatBotMain {
    private final MessageProcessor p = new MessageProcessorImpl();

    @Test void ok_normal() {
        assertEquals("Ваше сообщение: 'hello'", p.processorMessage("hello"));
    }

    @Test void ok_empty() {
        assertEquals("Ваше сообщение: ''", p.processorMessage(""));
    }

    @Test void ok_null_toString() {
        assertEquals("Ваше сообщение: 'null'", p.processorMessage(null));
    }

}
