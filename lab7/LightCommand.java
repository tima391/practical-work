package lab7;

public class LightCommand implements ICommand {
    private Light light;
    public LightCommand(Light light) { this.light = light; }
    public void execute() { light.on(); }
    public void undo() { light.off(); }
}