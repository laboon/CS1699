# CS 1699 - Software Testing
Spring Semester 2014

## Deliverable 2

For this assignment, your group will write unit tests for the Coffee Maker Quest game or another project or piece of code with a similar amount of functionality.  You will also write about your discoveries, problems that you've had, and problems you would anticipate going forward.

All code and tests should be on GitHub or a similar repository accessible to me.

## Format
Every group should have a title page with:
* The name of the project under test
* The names of the people in the group
* The title "CS 1699 - DELIVERABLE 2: Unit Testing and Code Coverage"

If you worked on a project other than Coffee Maker Quest, please start with a description of the project and why you chose to work on it.

Add a description of issues you faced when writing these tests and problems you would expect going forward based on your experiences.  If any tests you wrote fail, they should be included here, along with why you think that they are failing.

At the end of this section, note where your code is located (a link to the repository).

After this, ON A SEPARATE PAGE, include a screen shot of the executed unit tests.  Note that not all tests have to pass!  However, if a test doesn't pass, it should be included in the concerns section above.

ON A SEPARATE PAGE, include either a screenshot or output from a code coverage tool of your tests and the object they cover.

There is no need to print out the code.  It should be on GitHub (or a similar publicly-accessible version control system such as BitKeeper) BY THE BEGINNING OF CLASS.

At least three (3) unit tests should use test doubles.

At least three (3) unit tests should use stubbing of methods.

I expect unit tests for AT LEAST each method that returns a value (excluding the main method), using a variety of assertions and looking at different failure modes.  Keep in mind some of the things we learned when doing manual testing; you should be cognizant of equivalence classes, boundary values, etc. and focus on them.

Before each test, add some comments explaining what it is testing.  For example...

	//  Two LLs with different sizes should never be equal.
	//  Create two linked lists, both of which have the same value in the initial node,
	// but one has several more nodes. 
	// They should not be equal to each other.
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

## Grading
I remind you that grammar and good code count as well as functionality.  By good code, I mean -

1. No commented-out code (unless there's an EXPLICIT reason, e.g.
```java
// I couldn't get this assertion to work, but instead used a different assertion, below
// assertEquals(foo, 3);
assertTrue(foo == 3);
```

2. Properly indented code, e.g.
```java
public void doSomething() {
    doStuff();
}
```
NOT
```java
public
  void
        doSomething()
{ doStuff();
}
```

3. Don't misspell words or use bad grammar, in comments or summaries.

## Grading Breakdown
* Summary and Testing Concerns- 10%
* Screenshot of executed unit tests - 10%
* Unit test coverage report - 20%
* Unit test code - 60%

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have. 
 
