package com.example.AOPDEmo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

import com.example.AOPDEmo.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class GeneralInterceptorAspect {

	// @Pointcut("execution(* com.example.AOPDEmo.controller.*.*(..))")
	// @Pointcut("within(com.example.AOPDEmo..)")
	// @Pointcut("this(com.example.AOPDEmo.service.DepartmentService)")
//	 @Pointcut("@annotation(com.example.AOPDEmo.annotation.CustomAnnotation)")

	
	 @Pointcut("@annotation(com.example.AOPDEmo.annotation.CustomAnnotation)") 
	  public void loggingPointCut() {
	  
	  }
	  
		/*
		 * @Before("loggingPointCut()") public void before(JoinPoint joinPoint) {
		 * log.info("Before method Invocked::" + joinPoint.getSignature()); }
		 * 
		 * @After("loggingPointCut()") public void after(JoinPoint joinPoint) {
		 * log.info("After method Invocked::" + joinPoint.getSignature()); }
		 */
	 
	
	
	  @AfterReturning(value =
	  "execution(* com.example.AOPDEmo.controller.*.*(..))", returning =
	  "employee") public void after(JoinPoint joinPoint, Employee employee) {
	  
	  log.info("After method Invocked::" + employee);
	  
	  }
	  
	  @AfterThrowing(value = "execution(* com.example.AOPDEmo.controller.*.*(..))",
	  throwing = "e") public void after(JoinPoint joinpoint, Exception e) {
	  log.info("After method Invoked with Exception::" + e.getMessage()); }
	 	 

	/*
	 * @Around("loggingPointCut()") public Object around(ProceedingJoinPoint
	 * joinpoint) throws Throwable { log.info("Before Method invoked::" +
	 * joinpoint.getArgs()[0]); Object object = joinpoint.proceed();
	 * 
	 * if (object instanceof Employee) { log.info("After Method Invoked..." +
	 * joinpoint.getArgs()[0]); } else { log.info("After Method invoked..." +
	 * joinpoint.getArgs()[0]); } return object; }
	 */

}

/*
 * Login, API
 * 
 * @Aspect (filter the request), which will execute peace of code before and
 * after execution(Method or Endpoints of API) It maintain
 * transaction(information exchange b/w multiple tables/databases, suppose you
 * have two tables, 1. Order table, 2.Payment), logging, Security, exceptions
 * PointCut-- its predicate which will match joinPoint. Advice- associate with
 * point cut
 * 
 * 
 */
