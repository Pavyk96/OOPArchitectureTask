package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {

        MessageProcessor processorMessageTg = new MessageProcessorImpl();
        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        new TelegramBot(telegramBotName, telegramToken, processorMessageTg)
                .start();

        MessageProcessor processorMessageDiscord = new MessageProcessorImpl();
        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken, processorMessageDiscord)
                .start();
    }

}
