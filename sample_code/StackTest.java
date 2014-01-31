package com.laboon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testBasicStack() {
		Stack<Integer> stack = new Stack<Integer>();
		// Nothing on stack yet, a should be null
		Integer a = stack.peek();
		assertEquals(a, null);
		// Trying to pop an empty stack, should just give us null
		a = stack.pop();
		assertEquals(a, null);
		stack.push(new Integer(1));
		// Just pushed "1" onto stack, check if first element equals "1"
		assertEquals(stack.peek(), new Integer(1));
		// Throw some more elements on.  Stack should be 3 - 2 - 1
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		assertEquals(stack.peek(), new Integer(3));
		// Pop elements off and see if they're correct, should go 3, 2, 1, null
		assertEquals(stack.pop(), new Integer(3));
		assertEquals(stack.pop(), new Integer(2));
		assertEquals(stack.pop(), new Integer(1));
		assertEquals(stack.pop(), null);
		
		
	}
	
}
