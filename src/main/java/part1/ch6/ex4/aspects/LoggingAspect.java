package part1.ch6.ex4.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " will parameters " + Arrays.asList(arguments) +
                " will execute");

        Object returnedMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedMethod);

        return returnedMethod;
    }
}
