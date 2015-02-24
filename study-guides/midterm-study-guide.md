# CS 1699 Midterm Exam Study Guide
Spring 2015

The midterm will cover everything we have covered up to the lecture of 24 FEB 2015.

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
* Stubs, test doubles, and verification
* Be able to explain code coverage and what it's good for/not good for

## TDD
* The red-green-refactor loop
* Principles of TDD:
  * YAGNI, KISS, "Fake it 'til you make it", Avoid interdependency, avoid slow tests
* Benefits and drawbacks of TDD
* Testing private methods (you won't need to use reflection, but remember why/why not one would test them)

## INTERACTING WITH STAKEHOLDERS
* Be able to name some stakeholders and what is important to them
* Be prepared for some "fake" interaction with various stakeholders

## BDD
* Be able to define it
* Understand and be able to use the Connextra template and Gherkin syntax
* Be prepared to write out Gherkin feature files in the appropriate format
* Be able to create user stories/scenarios
* How to use automated tests

## WEB TESTING
* Be able to explain how you would test a web page with Selenium
* You do NOT need to know Selenese (Selenium scripting language)
* Be able to talk about WHY a given script is good or bad, and possible problems
* Be able to discuss issues with testing web apps (page loading timing issues, javascript issues, etc)

## PAIRWISE/COMBINATORIAL TESTING
* Be able to define
* Be able to determine when/where to use, when it might be overkill or not enough
* Understand the Pareto (80/20) rule in regards to combinatorial testing
* Understand why developing a good combinatorial test is hard for non-trivial inputs
* Be able to make a very simple combinatorial test which matches all pairs (not doing triple or more)
* Understand how it could be used for different realms, e.g. system combinations (OS, Browser, etc.)
* Benefits and drawbacks

## PROPERTY-BASED TESTING
* Be able to define
* Be able to develop property tests (not in any specific language) for a given pure function
* What is useful for testing?  What is not useful for testing?
* Understand terminology: invariants, shrinking, falsifying

## FORMAL VERIFICATION
* Be able to define
* Predictable execution, partial correctness, full correctness
* When is this useful/not useful?  What programs might you use it for / not use it for?
 
