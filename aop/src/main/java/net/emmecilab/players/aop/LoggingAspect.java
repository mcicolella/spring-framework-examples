package net.emmecilab.players.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Aspect
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("execution(public java.util.List<net.emmecilab.players.model.Player> net.emmecilab.players.service.PlayerServiceDB.getAllPlayers())")
	public void p1() {
	}

	@After("p1()")
	public void logGetAllPlayers() {
		logger.info("Called getAllPlayers()");
	}

	@Before("p1()")
	public void logJoinPointName(JoinPoint jp) {
		logger.info("Called joinpoint " + jp.getSignature());
	}
}
