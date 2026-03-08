package lab7;

import java.util.List;

public class MacroCommand implements ICommand {
    private List<ICommand> commands;

    public MacroCommand(List<ICommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("--- Выполнение макрокоманды ---");
        commands.forEach(ICommand::execute);
    }

    @Override
    public void undo() {
        System.out.println("--- Отмена макрокоманды ---");
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}
