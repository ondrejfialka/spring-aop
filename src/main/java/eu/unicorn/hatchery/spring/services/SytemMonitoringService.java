package eu.unicorn.hatchery.spring.services;

import org.springframework.stereotype.Component;

public interface SytemMonitoringService {

	boolean isRunning(String systemId);
	
}
