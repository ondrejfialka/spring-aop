package eu.unicorn.hatchery.spring.interceptors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DebugInterceptor  {

	//@Around("within(eu.unicorn.hatchery.spring.services..*)")
	@Around("execution(* eu.unicorn.hatchery.spring.services.*.*(..))")	
	//@Around("execution(public * eu.unicorn.hatchery.spring.services.*.*(String))")
	//@Around("execution(public * *..*Running(String))")
    public Object auditMethod(ProceedingJoinPoint jp) throws Throwable {
        String methodName = jp.getSignature().getName();
        System.out.println("Call to " + methodName);
        Object obj = jp.proceed();
        System.out.println("Method called successfully: " + methodName);
        return obj;
    }
}