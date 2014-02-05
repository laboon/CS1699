package com.laboon;

import java.lang.reflect.Method;

public class ReflectionFun {

	public void printQuack() {
		System.out.println("Quack!");
	}
	
	public void printQuock() {
		System.out.println("Quock!");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Reflection fun!");
		Method[] methods = ReflectionFun.class.getMethods();

		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
		
		ReflectionFun rf = new ReflectionFun();
		try {
			Method method = ReflectionFun.class.getMethod("printQuack");
			Object returnValue = method.invoke(rf);
		} catch (NoSuchMethodException nsmex) {
			System.err.println("No such method!");
		} catch (Exception ex) {
			System.err.println("some other exception");
		}

		

	}

}
