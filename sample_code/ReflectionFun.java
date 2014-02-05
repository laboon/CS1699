package com.laboon;

import java.lang.reflect.Method;

public class ReflectionFun {

	public void printQuack() {
		System.out.println("Quack!");
	}
	
	private void printQuock() {
		System.out.println("Quock!");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Reflection fun!");
		Method[] methods = ReflectionFun.class.getMethods();

		// Get all methods from class and any from superclasses callable 
		// on this class.
		System.out.println("All methods:");
		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
		
		// Declared methods are all methods declared directly in the class.
		// Includes private methods; does not include superclass methods
		System.out.println("Declared methods:");
		methods = ReflectionFun.class.getDeclaredMethods();
		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
		
		ReflectionFun rf = new ReflectionFun();
		
		try {
			System.out.println("Call public method (printQuack):");
			Method method = ReflectionFun.class.getMethod("printQuack");
			Object returnValue = method.invoke(rf);
			
			System.out.println("Call private method (printQuack):");
			// Note that we have to do two things to call a private method-
			// 1. Get list of DECLARED methods, not ALL methods.  Private methods are
			// not returned via the getMethod(s) calls.
			// 2. Set it to accessible before calling it. 
			Method method2 = ReflectionFun.class.getDeclaredMethod("printQuock");
			method2.setAccessible(true);
			returnValue = method2.invoke(rf);
			
		} catch (NoSuchMethodException nsmex) {
			System.err.println("No such method!");
		} catch (Exception ex) {
			System.err.println("some other exception");
		}

		

	}

}
