package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		//dış servislerin JLogger ını kullanmış oluruz
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}

}


//dış servisleri adapter ile adaptasyon yaparız