package ru.urfu;

/**
 * Обработчик сообщения
 *
 * @author Daniil Mezev
 */
public class MessageProcessor {

    /**
     * Обработать сообщение
     */
    public String processMessage(String messageFromUser) {
        return "Ваше сообщение: " + "'" + messageFromUser + "'";
    }

}
