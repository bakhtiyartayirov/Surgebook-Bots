import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBot = new TelegramBotsApi();
        Bot bot = new Bot();
        try{
            telegramBot.registerBot(bot);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
