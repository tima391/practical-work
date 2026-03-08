package lab7;

import java.util.*;

public class ChatMediator implements IMediator {
    private Map<String, List<User>> channels = new HashMap<>();

    public void registerUser(User user, String channel) {
        channels.computeIfAbsent(channel, k -> new ArrayList<>()).add(user);
        System.out.println("Система: " + user.name + " зашел в #" + channel);
    }

    public void sendMessage(String msg, String channel, User sender) {
        if (!channels.containsKey(channel) || !channels.get(channel).contains(sender)) {
            System.out.println("Ошибка доступа к каналу " + channel);
            return;
        }
        for (User u : channels.get(channel)) {
            if (u != sender) u.receive(msg, sender.name, channel);
        }
    }

    public void sendPrivate(String msg, String toWhom, User sender) {
        for (List<User> users : channels.values()) {
            for (User u : users) {
                if (u.name.equalsIgnoreCase(toWhom)) {
                    u.receive(msg, sender.name, "Лично");
                    return;
                }
            }
        }
    }
}
