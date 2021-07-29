package nLayerDemo.core;

import nLayerDemo.jLogger.JLogger;

public class JLoggerAdapter implements LoggerService {

	@Override
	public void log(String message) {
		JLogger loggers = new JLogger();
		loggers.log(message);
		
	}

}
