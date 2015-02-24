# CS 1699 Final Exam Study Guide
NOTE - Everything on the midterm study guide is also fair game for the final!

Fall 2014


## PROPERTY-BASED TESTING
* Be able to define
* Be able to develop property tests (not in any specific language) for a given pure function
* What is useful for testing?  What is not useful for testing?
* Understand terminology: invariants, shrinking, falsifying

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
* Chaos Monkey testing and other kinds of monkey testing
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
* Be able to describe/test for common attacks: injection, broken authentication, XSS, insecure storage, buffer overruns, smashing the stack, security misconfiguration, insecure object references, social engineering
