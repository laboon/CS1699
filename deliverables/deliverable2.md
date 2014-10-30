# CS 1699 - Software Quality Assurance
Fall Semester 2014

## Deliverable 2

For this assignment, your group will write unit tests for an object or other unit of code.  You will also write about your discoveries, problems that you've had, and problems you would anticipate going forward.

All code and tests should be on GitHub or a similar repository accessible to me.

## Format
Every group should have a title page with:
* The name of the project under test
* The names of the people in the group
* The title "CS 1699 - DELIVERABLE 2: Unit Testing and Code Coverage"

The summary should explain why you chose this particular object to test and what it does. This should be relatively short, a few paragraphs at the most.

Secondly, add a description of issues you faced when writing these tests and problems you would expect going forward based on your experiences.  If any tests you wrote fail, they should be included here.

At the end of this section, note where your code is located.

After this, ON A SEPARATE PAGE, include a screen shot of the executed unit tests.  Note that not all tests have to pass!  However, if a test doesn't pass, it should be included in the concerns section above.

ON A SEPARATE PAGE, include either a screenshot or output from a code coverage tool of your tests and the object they cover.

There is no need to print out the code.  It should be emailed to me or put on a publicly-available site such as GitHub BY THE BEGINNING OF CLASS.

At least three (3) unit tests should use mocks/doubles.

At least three (3) unit tests should use stubbing of methods or functions.

I expect 15 * (number of students in group) unit tests, using a variety of assertions and looking at different failure modes.  Keep in mind some of the things we learned when doing manual testing; you should be cognizant of equivalence classes, boundary values, etc.

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
* Summary - 10%
* Testing concerns - 10% 
* Screenshot of executed unit tests - 10%
* Unit test coverage report - 20%
* Unit test code - 50%

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have. 
 
