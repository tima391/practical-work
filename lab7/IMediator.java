package lab7;

public interface IMediator {
    void sendMessage(String msg, String channel, User sender);
    void registerUser(User user, String channel);
    void sendPrivate(String msg, String toWhom, User sender);
}
