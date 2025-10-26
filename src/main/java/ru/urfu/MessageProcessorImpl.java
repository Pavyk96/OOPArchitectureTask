package ru.urfu;

/**
 * MessageProcessorImpl
 *
 * @author Daniil Mezev
 */
public class MessageProcessorImpl implements MessageProcessor{
    @Override
    public String processorMessage(String messageFromUser) {
        return "Ваше сообщение: " + "'" + messageFromUser + "'";
    }
}
