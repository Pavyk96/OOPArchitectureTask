package ru.urfu;

/**
 * Обработчик сообщений для чатбота
 *
 * @author Daniil Mezev
 */
public interface MessageProcessor {
    /**
     * Метод обработки сообщения пользователя
     */
    String processorMessage(String messageFromUser);
}
