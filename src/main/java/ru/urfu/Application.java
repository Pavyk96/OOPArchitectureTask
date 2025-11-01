package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {

        MessageProcessor processorMessage = new MessageProcessor();

        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        new TelegramBot(telegramBotName, telegramToken, processorMessage)
                .start();

        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken, processorMessage)
                .start();
    }

}
