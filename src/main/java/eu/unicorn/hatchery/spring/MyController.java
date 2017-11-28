package eu.unicorn.hatchery.spring;

import org.springframework.web.bind.annotation.RestController;

import eu.unicorn.hatchery.spring.services.SytemMonitoringService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

	@Autowired
	SytemMonitoringService monitoringService;
	
    @RequestMapping("/")
    public String index() {
    	if (monitoringService.isRunning("123")) {
    		return "Greetings from Spring Boot!";
    	} else {
    		return "System error!";
    	}
    }

}