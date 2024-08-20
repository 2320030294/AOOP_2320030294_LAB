package Com.Logging_System;

public class InfoHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.INFO;
	}

	@Override
	protected void execute(String message) {
		// TODO Auto-generated method stub
		System.out.println("INFO: " + message);
	}
}
