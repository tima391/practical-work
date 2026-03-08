package lab7;

public class User {
    protected String name;
    protected IMediator mediator;

    public User(String name, IMediator m) {
        this.name = name;
        this.mediator = m;
    }

    public void send(String msg, String channel) {
        mediator.sendMessage(msg, channel, this);
    }

    public void receive(String msg, String from, String channel) {
        System.out.println("[" + channel + "] " + name + " получил от " + from + ": " + msg);
    }
}
