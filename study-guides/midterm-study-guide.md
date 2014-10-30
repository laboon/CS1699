# CS 1699 Midterm Exam Study Guide
Fall 2014

The midterm will cover everything we have covered up to the lecture of 9 OCT 2014.

However, here are the key topics to study in preparation for the test.

## TESTING THEORY AND TERMINOLOGY
* Equivalence class partitioning
* Boundary and "interior" values
* Base, Edge, and Corner cases
* Static vs Dynamic testing
  * Know the differences and examples of each
* Black/White/Grey box testing
  * Know the differences and examples of each

## REQUIREMENTS ANALYSIS
* What makes a good or bad requirement?
* Testability - requirements must be:
  * Complete, consistent, unambiguous, quantitative, feasible
* Functional Requirements vs Non-Functional (Quality Attributes)
  * Be able to define and write your own
* Traceability Matrices
  * Be able to define and write your own

## TEST PLANS
* Terminology: test cases, test plans, test suites, test runs
* The Seven Testing Principles
  * You don't need to remember their names, but use them in developing test plans
* Verification vs validation
* Test case statuses: PASSED, FAILED, PAUSED, RUNNING, BLOCKED, ERROR
* Be prepared to write your own test plan for a simple program

## DEFECT REPORTING
* Be prepared to report a defect based on a test case
* Remember the defect template:
  * SUMMARY, DESCRIPTION, REPRODUCTION STEPS, EXPECTED BEHAVIOR, OBSERVED BEHAVIOR
  * Optionally: SEVERITY/IMPACT, NOTES
  * Levels of severity: BLOCKER, CRITICAL, MAJOR, NORMAL, MINOR, TRIVIAL
* Enhancements vs defects
  * Be prepared to argue if something is a defect or enhancement
* Coding mistakes vs defects

## AUTOMATED TESTING
* Pros and cons of automated testing
* Unit tests vs system/acceptance/integration tests
* Writing automated tests:
  * PRECONDITIONS, POSTCONDITIONS, EXECUTION STEPS, INPUT/OUTPUT VALUES

## UNIT TESTING
* Be prepared to write some unit tests in JUnit
* Pay special attention to assertions
* Stubs, mocks, and verification
* Be able to explain code coverage and what it's good for/not good for

## TDD
* The red-green-refactor loop
* Principles of TDD:
  * YAGNI, KISS, "Fake it 'til you make it", Avoid interdependency, avoid slow tests
* Benefits and drawbacks of TDD
* Testing private methods (you won't need to use reflection, but remember why/why not
  one would test them)

## INTERACTING WITH STAKEHOLDERS
* Be able to name some stakeholders and what is important to them
* Be prepared for some "fake" interaction with various stakeholders

## BDD
* Be able to define it
* Understand and be able to use the Connextra template and Gherkin syntax
* Be prepared to write out Gherkin feature files in the appropriate format
* Be able to create user stories/scenarios
* How to use automated tests
