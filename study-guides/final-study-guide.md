# CS 1699 Final Exam Study Guide
NOTE - Material on the Midterm Study Guide is fair game as well!
Fall 2014

## WEB TESTING
* Be able to explain how you would test a web page with Selenium
* You do NOT need to know Selenese (Selenium scripting language)
* Be able to talk about WHY a given script is good or bad, and possible problems
* Be able to discuss issues with testing web apps (page loading timing issues, javascript issues, etc)
* Integrating Cucumber/Gherkin with Selenium for web testing (be able to discuss)

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
* When is this useful/not useful?

## EXPLORATORY TESTING
* Be able to define
* When is it useful?  When is it not?
* Benefits/drawbacks

## SMOKE TESTS
* Be able to define
* Given a system, be able to determine a smoke test for it
* Scripted vs unscripted
* Sanity testing

## STOCHASTIC ("FUZZ") TESTING
* Be able to define, list benefits/drawbacks
* Think of good inputs to push (e.g., JSON, executable code, JavaScript, SQL, etc.)
* Understand dumb, smart, evil, chaos monkey testing
* Other ways to test similar to chaos monkey: reduce bandwidth, modified permissions, etc.

## DISTRIBUTED SYSTEMS TESTING
* Understand how to test - why is it difficult?  What tools are available?
* Graceful degradation - define and explain as part of a test

## RED ROUTE TESTING
* Define red routes
* Given a system description, be able to determine red routes and justify

## PERFORMANCE TESTING
* Understand concepts on how to test performance
* Be able to write test plans for different performance indicators and systems
* Terminology: Service-Oriented vs Efficiency-Oriented Indicators
* Availability, Response Time, Throughput, Utilization
* Performance targets, performance thresholds, KPIs - understand and be able to generate!
* Measuring response time - methodologies
* Understand different concepts of time: user, system, total, real
* Measuring availability, concurrency, scalability, throughput
* Understand n 9's (e.g., 5 9s vs 6 9s)
* Load testing - baseline, soak/stability, stress tests
* Know different performance monitoring tools - perfmon, Activity Monitor/Instruments, top/iostat
* Key resources to watch, and why
* When to use a packet analyzer or profiler and their (very basic) usage

## WRITING TESTABLE CODE
* Basic strategy for testable code
* The DRY Principle
* The SOLID Principles
* The Law of Demeter

## USABILITY TESTING
* Personas
* Be able to develop a low-fi prototype
* Effectiveness, efficiency, satisfaction
* Discount usability testing
* Think-aloud walkthrough
* Heuristic evaluation

## SECURITY TESTING
* The CIA/InfoSec Triad
* Terminology: passive vs active,  public-key cryptography, vulnerability, exploit
* Terminology: interruption, interception, modification, fabrication
* Be able to define different kinds of malware (virus, worm, etc.)
* Be able to describe/test for common attacks: injection, broken authentication, XSS,
  insecure storage, buffer overruns, smashing the stack, security misconfiguration,
  insecure object references, social engineering
