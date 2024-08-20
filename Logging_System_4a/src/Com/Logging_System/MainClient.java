package Com.Logging_System;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Logger logger = new Logger();

        logger.addCommand(new LogCommand(LogLevel.INFO, "System started"));
        logger.addCommand(new LogCommand(LogLevel.DEBUG, "Debugging system issue"));
        logger.addCommand(new LogCommand(LogLevel.ERROR, "An error occurred"));

        logger.processCommands(infoHandler);
    }

}
