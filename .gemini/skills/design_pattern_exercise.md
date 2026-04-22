# Design Pattern Exercise Skill

**Name:** Design Pattern Refactoring Exercise Generator
**Description:** Generates a coding exercise for the user to practice a specific design pattern by refactoring problematic code.

## Trigger
When the user asks to practice a design pattern (e.g., "Create an exercise for the Strategy pattern" or "I want to practice the Observer pattern").

## Instructions for the AI

1. **Acknowledge the Request:** Confirm the design pattern the user wants to practice.
2. **Determine the Package Name:** Convert the design pattern name to lowercase to be used as a package name (e.g., `strategy`, `observer`, `factory`).
3. **Create the Directory Structure:**
   Within the project's source directory (e.g., `design-patterns/src/main/java/...`), create a new package for the pattern. Inside it, create two subpackages:
   - `problem`
   - `refactor`
4. **Generate the `problem` Code:**
   - In the `problem` package, create a complete, working, but poorly designed code example that suffers from code smells (e.g., long methods, complex switch statements, duplicate code, tight coupling).
   - The code smells should be ones that the requested design pattern is specifically intended to solve.
   - Do NOT use the requested design pattern in this package.
5. **Generate the `refactor` Skeleton:**
   - In the `refactor` package, provide a basic skeleton or the identical starting code from the `problem` package.
   - Set up the environment so the user can complete the refactor.
   - Do NOT provide the final solution in the `refactor` package. Leave the implementation of the pattern to the user.
6. **Provide Instructions to the User:**
   - Explain the scenario simulated in the `problem` package.
   - Point out the specific code smells or design flaws in the `problem` code.
   - Instruct the user to implement the target design pattern in the `refactor` package to resolve the identified issues.
   - Ask the user to let you know when they are finished so you can review their solution.
7. **Finally explain the pattern and its benefits in a separate file called pattern_name.md**
   - Explain the pattern's structure using UML diagrams or other visual aids.
   - Describe the pros and cons of using the pattern.
   - Provide real-world examples of where the pattern is used.
