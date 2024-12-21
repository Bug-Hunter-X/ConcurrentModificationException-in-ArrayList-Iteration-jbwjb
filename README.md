# ConcurrentModificationException in ArrayList Iteration

This example demonstrates a common error in Java: the ConcurrentModificationException.  This exception is thrown when you try to modify a collection (like an ArrayList) while iterating over it using a for-each loop or an iterator that doesn't support modification.  The solution shows how to safely remove elements during iteration.

## Bug

The `ConcurrentModificationExceptionExample.java` file shows the code that throws the exception.

## Solution

The `ConcurrentModificationExceptionExampleSolution.java` file demonstrates three ways to solve the problem: using an iterator, using a reverse iterator, and using an iterator with remove().