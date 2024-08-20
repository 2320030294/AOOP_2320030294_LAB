package Com.Logging_System;

public class ErrorHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.ERROR;
	}

	@Override
	protected void execute(String message) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + message);
	}

}
