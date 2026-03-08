package lab7;

public class Main {
    public static void main(String[] args) {
        IMediator chat = new ChatMediator();
        User timur = new User("Timur", chat);
        User bot = new User("Bot", chat);

        chat.registerUser(timur, "General");
        chat.registerUser(bot, "General");

        timur.send("Всем привет!", "General");
    }
}
