# CS 1699 - Software Testing
Spring Semester 2015

DUE 3 MAR 2015

## Deliverable 3

For this assignment, your group will write systems tests (aka acceptance or integration tests) for a web site of your choice using the BDD model discussed in class.  That is, you will write user stories (features) and scenarios in Gherkin, and the JUnit tests in the language of your project.  You should substantially cover a subset of functionality for the project, and note in the "Testing Concerns" section what other aspects you would additionally add for full testing if this were a professional product.

Tests and code should be on GitHub or another publicly accessible repository.

You are allowed to choose your partner for this deliverable.  There should be TWO and ONLY TWO students per group.  The partner CANNOT be someone with whom you have partnered before.  If you cannot find a partner, please let me know and I will help you find one.

## Format
Every group should have a title page with:
* The name of the project under test
* The names of the people in the group
* The title "CS 1699 - DELIVERABLE 3: Web Testing with BDD"

First, include a short summary (a few paragraphs) of what you decided to test, and why.

Secondly, add a description of issues you faced when writing these tests and problems you would expect going forward based on your experiences.  If any tests you wrote fail, they should be included here.  Also note if there are any special steps to get the tests running.

At the end of this section, note where your code (test code and code of project under test, if available) is located.  

After this, there should be a printout or screen shot of the test execution results.

There is no need to print out the code.  It should be put on a publicly-available site such as GitHub BY THE BEGINNING OF CLASS.

There shall be AT LEAST 4 user stories per group, but there can be more.  Each user story should have multiple (at least two) scenarios.  There shall be at least an average ("arithmetic mean", if you would like to be specific) of 5 scenarios per user story.  

User stories should all follow the Connextra template.

Scenarios should all follow the Given/When/Then template (but note that some scenarios may not require a Given).

The feature files shall contain a feature and all scenarios for that feature.  The JUnit tests shall have the scenario that they are testing written in the comments above the particular test.  All tests shall correspond to a scenario and vice-versa.

Remember that scenarios are FEATURE-level tests; they should discuss things in a way that an intelligent but non-technical user of the software would understand.  Remember the differences between scenario tests and specification/unit tests!

Also remember to focus on a particular subset of functionality in order to get good testing coverage.

## Grading
* Summary - 5%
* Testing concerns - 10% 
* Screen shot or printout of test results - 5%
* User Stories and Scenarios, written in Gherkin - 30%
* JUnit Tests - 50%

Reminder that all code (project under test AND test code) should be publicly available, or at least available to me.

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have. 
 
