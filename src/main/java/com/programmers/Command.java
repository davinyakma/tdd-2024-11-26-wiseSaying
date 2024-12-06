package com.programmers;

public class Command {
    private final String actionName;

    public Command(String cmd) {
        String[] cmdBits = cmd.trim().split("\\?");
        this.actionName = cmdBits[0];
    }

    public String getActionName() {
        return actionName;
    }
}
