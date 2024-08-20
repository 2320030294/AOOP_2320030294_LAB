package Com.Logging_System;

public abstract class LogHandler {
	protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(LogCommand command) {
        if (canHandle(command.getLevel())) {
            execute(command.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void execute(String message);
}
