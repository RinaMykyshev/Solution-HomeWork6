package smarthome;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slotName, Command command) {
        slots.put(slotName, command);
    }

    public void pressButton(String slotName) {
        Command command = slots.get(slotName);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("Слот '" + slotName + "' не назначен");
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            System.out.println("Отмена последней команды");
            command.undo();
        } else {
            System.out.println("Нет команды для отмены");
        }
    }
}
