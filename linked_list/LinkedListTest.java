package com.laboon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	@Before
	public void setUp() throws Exception {
		// any necessary setup
	}

	@After
	public void tearDown() throws Exception {
		// any necessary teardown
	}	
	
	//  0. A LL should always equal itself	
	@Test 
	public void testEqualsSelf() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		assertEquals(ll, ll);
	}
	
	//	1. Two 0-element LL's should be equal
	@Test
	public void testEquals0Elems() {
		LinkedList<Integer> ll01 = new LinkedList<Integer>();
		LinkedList<Integer> ll02 = new LinkedList<Integer>();
		assertTrue(ll01.equals(ll02));
	}
	
	//	2. No instantiated LL should equal null
	@Test
	public void testNotEqualsNull() {
		LinkedList<Integer> ll01 = new LinkedList<Integer>();
		assertFalse(ll01.equals(lln));
	}
	
	//  3. No LL should equal a non-LinkedList, e.g. Object
	@Test
	public void testNotEqualsRegularObject() {
		LinkedList<Integer> ll01 = new LinkedList<Integer>();
		Object obj = new Object();
		assertFalse(ll01.equals(obj));
	}
	
	//  4. Two LLs with the same Node value with a single node should be equal	
	@Test
	public void testEqualsOneNodeSameVals() {
		LinkedList<Integer> ll11 = new LinkedList<Integer>();
		LinkedList<Integer> ll12 = new LinkedList<Integer>();
		ll11.addToFront(new Node<Integer>(new Integer(1)));
		ll12.addToFront(new Node<Integer>(new Integer(1)));
		assertTrue(ll11.equals(ll12));
	}
	
	//  5. Two LL with different Node values with a single node should NOT be equal	
	@Test
	public void testEqualsOneNodeDiffVals() {
		LinkedList<Integer> ll11 = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll11.addToFront(new Node<Integer>(new Integer(1)));
		ll2.addToFront(new Node<Integer>(new Integer(2)));
		assertFalse(ll11.equals(ll2));
	}
	
	//  6. Two LLs with different sizes should never be equal
	@Test
	public void testNotEqualsDiffSizes() {
		LinkedList<Integer> ll11 = new LinkedList<Integer>();
		LinkedList<Integer> ll_3elems = new LinkedList<Integer>();
		
		ll11.addToFront(new Node<Integer>(new Integer(1)));
		ll_3elems.addToFront(new Node<Integer>(new Integer(3)));
		ll_3elems.addToFront(new Node<Integer>(new Integer(2)));
		ll_3elems.addToFront(new Node<Integer>(new Integer(1)));
		
		assertFalse(ll_3elems.equals(ll11));
	}
	
	//  7. An LL which is just a reference to another instance of itself should equal itself
	@Test
	public void testEqualsRef() {
		LinkedList<Integer> ll11 = new LinkedList<Integer>();
		ll11.addToFront(new Node<Integer>(new Integer(1)));
		LinkedList<Integer> ll11_new = ll11;
		fail();
	}
	
	//  8. LLs with different data should not equal each other	
	@Test
	public void testNotEqualsDiffData() {
		LinkedList<Integer> ll_3elems = new LinkedList<Integer>();
		LinkedList<Integer> ll_321 = new LinkedList<Integer>();
		ll_3elems.addToFront(new Node<Integer>(new Integer(3)));
		ll_3elems.addToFront(new Node<Integer>(new Integer(2)));
		ll_3elems.addToFront(new Node<Integer>(new Integer(1)));
		
		ll_321.addToFront(new Node<Integer>(new Integer(1)));
		ll_321.addToFront(new Node<Integer>(new Integer(2)));
		ll_321.addToFront(new Node<Integer>(new Integer(3)));
		fail();
		// ???
	}
	
	//  9. LLs with the same data should equal each other
	@Test
	public void testEqualsSameData() {
		LinkedList<Integer> ll_321 = new LinkedList<Integer>();
		LinkedList<Integer> ll_321_2 = new LinkedList<Integer>();
		
		ll_321.addToFront(new Node<Integer>(new Integer(1)));
		ll_321.addToFront(new Node<Integer>(new Integer(2)));
		ll_321.addToFront(new Node<Integer>(new Integer(3)));
		
		ll_321_2.addToFront(new Node<Integer>(new Integer(1)));
		ll_321_2.addToFront(new Node<Integer>(new Integer(2)));
		ll_321_2.addToFront(new Node<Integer>(new Integer(3)));
		fail();
		// ???
	}

}
