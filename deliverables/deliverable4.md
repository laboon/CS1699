# CS 1699 - Software Quality Assurance
Fall Semester 2014

## Deliverable 4 - FINAL DELIVERABLE

For this assignment, your group will write up two test suites, of two different kinds; for example,
a performance test suite and a security test suite.  These can be from the following list of topics gone
over in class, or you can research and use your own.  If you are using your own, please
check with me before working on it.

1. Web Testing
2. Performance Testing
3. Security Testing
4. Usability Testing
5. Combinatorial Testing
6. Property-Based Testing
7. Formal Analysis

The number of tests is going to vary based on the kinds of testing you do.  As a rough estimate,
there should be about as many tests per test suite as expected for one of the previous
deliverables.  Some rules of thumb:

1. Web Testing - approx 5 tests * (number of members of the group)
2. Performance Testing - approx 5 tests * (number of members of group)
3. Security Testing  - A good analysis of one aspect of security per group member
4. Usability Testing - Depends on the kind of usability testing done
5. Combinatorial Testing - approx 5 tests * (number of members per group)
6. Property-Based Testing - approx 5 tests * (number of members of group)
7. Formal Analysis - A decent analysis of several functions per group member

You may use a project you have already worked on, or a totally new one if you prefer.

I prefer you to do BOTH kinds of tests on the same project.  If you feel you CANNOT, please
come speak to me and we can discuss working on multiple projects.  However, this will
mean writing two sets of summaries, testing concerns, and assessments of quality.

I also expect a well-thought-out and well-explained rationale on why those particular
kinds of tests were chosen.  For example, if you are testing a web server, then performance
and security would be important aspects.  If you are testing a web application, usability
and web testing would be more relevant than performance.  If you are testing a mathematical
application, combinatorial and property-based testing might be more appropriate.

Finally, there should be a section which explains the following:

1. What problems did you encounter in testing?
2. What other kinds of tests or tests themselves would be useful in assessing the quality
    of the project?
3. What is your assessment of the quality of the product, based on your testing?

Tests and code should be on GitHub or another publicly accessible repository.
Code sent in via email will receive a 10% penalty.

The quality of your write-up can and will impact your grade.  For a perfect grade, I expect
professional quality on ALL aspects of your testing, including:

1. Proper grammar, punctuation, etc.
2. No commented-out code, UNLESS there is a specified reason for it, e.g.:
   * `// This doesn't work, but this is what I would do if I could...`
   * `// Uncomment the following line to run additional long-running tests)`

3. No inconsistent spacing/tabs/brace settings.  I don't care which you use, but make
    it consistent.
4. Good variable names, good coding style in general.

* **Perfect Score** - Absolutely no problems, working on a challenging system with excellent
   test coverage.  Tests and kinds of tests make perfect sense and are described well.
   Summary, testing concerns, and quality assessment are easy to read with no grammatical
   errors.
* **A** - Minor problems, working on a reasonable system with good test coverage.  Tests and
   kinds of tests are appropriate and described well.  Summary, testing concerns, and
   quality assessment have only minor issues.
* **B** - A few issues, but overall decent test coverage.  Tests and kinds of tests could have
     been better.  Summary, testing concerns, and quality assessment have a few issues.
* **C** - Test coverage is not good; many tests are repetitive or unnecessary.  Tests and kinds
      of tests are only vaguely appropriate.  Summary, testing concerns, and quality
      assessment have major issues.
* **D** - Test coverage is horrible; tests do not do what they say, there aren't enough of them,
     and are not described at all.  Summary, testing concerns, and quality assessment are
     filled with errors, grammatical and factual.
* **F** - Test coverage is basically nonexistent; tests are testing the wrong thing entirely
     (e.g. a "usability test" which only checks a math function repeatedly) or missing.
     Summary, testing concerns, and quality assessment are unreadable or missing
    entirely.

## Format
Every group should have a title page with:
* The name of the project under test
* The names of the people in the group
* The title "CS 1699 - FINAL DELIVERABLE"

First, include a short summary (a few paragraphs) of what you decided to test, what kinds of
testing you are doing, and why.

Then, add a description of issues you faced when writing these tests and problems you would
expect going forward based on your experiences.  Include here any additional tests or kinds of
tests you would like to run to get a better assessment of the quality of the system.  This should
also be a few paragraphs.

I also expect an assessment of quality of the project under test.  This will include:

1. A list of any failed tests or problem areas
2. A red/yellow/green-template of the different areas of the system
   (e.g., Database - Red, Front End - Green, etc.) with justifications
3. An overall assessment of quality
4. Your recommendation on whether or not the product is ready to be released

You should write this in the style of convincing a manager whether or not a system
is ready to be released.

At the end of this section, note where your code (test code and code of project under test) is located.

After this, there should be printouts or screen shots of the test execution results.

There is no need to print out the code.  It should be put on a publicly-available site such as
GitHub BY THE BEGINNING OF CLASS.

## Grading
* Summary - 5%
* Testing concerns / Concerns going forward- 5%
* Assessment of Quality - 10%
* Test Suite 1 - 40%
  * Including screen shot or printout of test results
* Test Suite 2 - 40%
  * Including screen shot or printout of test results

Reminder that all code (project under test AND test code) should be publicly available, or at least available to me.

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have.

I urge you to talk to me as soon as possible if you experience any problems.

