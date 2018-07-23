package com.lw.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {

	public void beforeMethodAdvice(JoinPoint jp) {
		System.out.println("before");
	}

	public void afterMethodAdvice(JoinPoint jp) {
		System.out.println("after");
	}

	public void aroundMethodAdvice(ProceedingJoinPoint pjp) {
		try {
			System.out.println("around-before");
			pjp.proceed();
			System.out.println(pjp.getSignature().getName());
			System.out.println("around-after");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void afterReturnMethodAdvice(JoinPoint jp,Object result) {
		System.out.println("after-return" + ",result=" + result);
	}

	public void afterThrowMehtodAdvice(JoinPoint jp,Exception e) {
		System.out.println("after-throw" + ",exception=" + e);
	}


}
