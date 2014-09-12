# CS1699 - Software Quality Assurance
Fall Semester 2014

## Deliverable 1

For this assignment, your group will determine the requirements and a test plan for your chosen piece of software (or a subset of it, as discussed).  Additionally, a traceability matrix showing the mapping of test cases to requirements is required.

I expect at least (5 * (number of people in group)) requirements.  In other words, if you have:

	2 people : >= 10 requirements
	3 people : >= 15 requirements

The requirements should completely cover the subset(s) of functionality chosen to test.  This may or may not be the entire application.  If you are going to do a subset of the functionality, please note what the subset is as part of your introduction.

There should be at least as many test cases as requirements, although I would normally expect several test cases per requirement.  As a general rule, I'd estimate 2x to 3x the number of requirements.
Each requirement should have AT LEAST one test case associated with it, and each test should have EXACTLY ONE requirement associated with it.  This can easily be checked via a traceability matrix (which you should also deliver).

There should be at least three non-functional requirements (quality attributes).  Remember our discussion on proper testing of non-functional requirements!

Test cases should mention all necessary preconditions, input values, execution steps, output values, and postconditions.  Remember when they are necessary and when they are not...

It is NOT necessary to make multiple test plans inside a test suite; it is enough for there to be one test plan.

It is NOT necessary to actually execute the test cases, although this may be useful for determining ambiguities or gaps in testing coverage. 

## Format
Please hand in the paper to me with a cover page with -
The name of the project under test
The names of the people in the group
The title CS1699 - DELIVERABLE 1: Requirements, Test Plan, and Traceability Matrix

There should be a short (approximately one paragraph) introduction stating what the project under test is, and which subset(s) of functionality you will be testing.

There should be a description of why you chose the non-functional requirements that you did.  This should not be longer than a paragraph per non-functional requirement.

Optionally, you may note that any concerns or difficulties you may have had or anticipate with the testing process.

This should be followed ON A NEW PAGE by the listing of requirements.  You may name or number them any way you wish, but be consistent.

This should be followed ON A NEW PAGE by the list of test cases.  You may name or number them any way you wish, but be consistent.  You may wish to write them out in this format -

	IDENTIFIER:
	TEST CASE: 
	PRECONDITIONS:
	INPUT VALUES:
	EXECUTION STEPS:
	OUTPUT VALUES:
	POSTCONDITIONS:

Finally, on a separate page, a traceability matrix should be provided mapping the test cases with their associated requirements.  Remember that all requirements should map to AT LEAST ONE test case, and all test cases should map to EXACTLY ONE requirement.  

## Grading
* Introduction / Justifications: 10% of grade
* Requirements: 30% of grade
* Test Plan: 40% of grade
* Traceability Matrix: 20% of grade

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have. 
 
