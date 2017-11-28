package eu.unicorn.hatchery.spring.services;

import org.springframework.stereotype.Component;

@Component
public class SystemMonitoringServiceImpl implements SytemMonitoringService {

	@Override
	public boolean isRunning(String systemId) {
		return true;
	}

}
