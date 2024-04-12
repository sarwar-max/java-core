package com.OnlineShoppingApp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before("execution(* com.mphasis.ShoppingCart.getItems())")
	public void logBeforeGetItems() {
		System.out.println("Before executing getItems method...");
	}

	@Around("execution(* com.mphasis.ShoppingCart.addItem(..)) || execution(* com.mphasis.ShoppingCart.removeItem(..))")
	public Object logAroundAddRemove(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before executing addItem or removeItem method...");
		Object result = joinPoint.proceed();
		System.out.println("After executing addItem or removeItem method...");
		return result;
	}

	@After("execution(* com.mphasis.ShoppingCart.updateItem(..))")
	public void logAfterUpdateItem() {
		System.out.println("After executing updateItem method...");
	}

	@AfterReturning("execution(* com.mphasis.ShoppingCart.getItems())")
	public void logAfterReturningGetItems() {
		System.out.println("After returning from getItems method...");
	}

	@AfterThrowing(pointcut = "execution(* com.mphasis.ShoppingCart.updateItem(..))", throwing = "exception")
	public void logAfterThrowingUpdateItem(Exception exception) {
		System.out.println("Exception occurred during updateItem method: " + exception.getMessage());
	}
}
