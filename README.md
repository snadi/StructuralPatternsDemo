# StructuralPatternsDemo

## Factory Demo

This repo illustrates the use of the structural design pattern, Decorator, from the Gang of Four patterns: Abstract Factory and Singleton. 
The example is based on [https://refactoring.guru/design-patterns/decorator](https://refactoring.guru/design-patterns/decorator).

## What's in this demo

- The [main branch](https://github.com/snadi/StructuralPatternsDemo) has the base code without applying any design pattern
- The [snadi/decorator-soln](https://github.com/snadi/StructuralPatternsDemo/tree/snadi/decorator-soln) has an example of changing this code to use the decorator design pattern.


Before looking at the other branches, we advise you to first look at the base code and try to think of how you can solve the problem of allowing combinations of multiple notifiers and allowing the easy additions of more notifiers in the future. Note that the current code asks the user for the different notifiers they want to sign up for but currently does nothing with this info (still sends an email notification).

You can switch between the branches by using `git checkout <name of the branch>`

## How to run the code

### Requirements

- Java 17 or higher
- Maven 3.9.6 or higher
- Git (if you will be using git on the command line; the alternative is download each version of the code but it's time to make sure you know how to use Git!)

### Compile and run

1. `cd structuralpatterns`
2. `mvn clean package`
3. `java -jar target/factorydemo-1.0-SNAPSHOT.jar`
