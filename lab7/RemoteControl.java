package lab7;

import java.util.Stack;

public class RemoteControl {
    private ICommand[] slots = new ICommand[5]; // 5 кнопок
    private Stack<ICommand> undoStack = new Stack<>();
    private Stack<ICommand> redoStack = new Stack<>();

    public void setCommand(int slot, ICommand command) {
        slots[slot] = command;
    }

    public void pressButton(int slot) {
        if (slot < 0 || slot >= slots.length || slots[slot] == null) {
            System.out.println("Кнопка " + slot + " не настроена.");
            return;
        }
        slots[slot].execute();
        undoStack.push(slots[slot]);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            ICommand cmd = undoStack.pop();
            cmd.undo();
            redoStack.push(cmd);
        } else System.out.println("Нечего отменять.");
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            ICommand cmd = redoStack.pop();
            cmd.execute();
            undoStack.push(cmd);
        } else System.out.println("Нечего повторять.");
    }
}