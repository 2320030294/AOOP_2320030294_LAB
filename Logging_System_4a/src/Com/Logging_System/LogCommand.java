package Com.Logging_System;

public class LogCommand implements Command{
	private LogLevel level;
    private String message;
    
    public LogCommand(LogLevel level, String message) {
        this.level = level;
        this.message = message;
    }
	@Override
	public void execute(String message) {
		// TODO Auto-generated method stub
		System.out.println("[" + level + "] " + message);
	}
	public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}
