# ExpenseTracker

A console-based expense management application built using **Java and Spring Core**.

I built this project to put my Spring Core learning into practice. Instead of just studying individual concepts, I wanted to understand how they work together in a small application.

## Features

- Add new expenses
- Find expenses by ID
- Delete expenses
- Calculate total expenses
- Validate expense data
- Handle errors using custom exceptions

## Project Structure

```text
ExpenseTracker/
├── pom.xml
├── .gitignore
└── src/
    ├── main/
    │   ├── java/
    │   │   └── org/example/
    │   │       ├── AppConfig.java
    │   │       ├── Expense.java
    │   │       ├── ExpenseNotFoundException.java
    │   │       ├── ExpenseRepository.java
    │   │       ├── ExpenseService.java
    │   │       ├── InvalidExpenseException.java
    │   │       └── Main.java
    │   └── resources/
    └── test/
        └── java/
```

## Architecture

The application follows a simple layered architecture:

- **Expense:** Represents expense information.
- **ExpenseRepository:** Handles storing, retrieving, and deleting expenses.
- **ExpenseService:** Handles business logic and validation.
- **AppConfig:** Configures Spring and component scanning.
- **Main:** Initializes the Spring container and starts the application.

## Spring Concepts Practised

- Inversion of Control (IoC)
- Dependency Injection (Constructor Injection)
- Spring IoC Container
- Component Scanning
- Java-based Configuration
- `@Component`, `@Service`, and `@Repository`
- Maven Dependency Management

## Custom Exceptions

Created two custom runtime exceptions:

- `ExpenseNotFoundException`
- `InvalidExpenseException`

These handle missing expenses and invalid expense data.

## Technologies

- Java
- Spring Core
- Maven

## Current Limitations

This is a beginner learning project. Expenses are stored in an in-memory `ArrayList`, so data is not preserved after the application stops.

There is currently no database integration or user interface.

## Learning Outcome

This project helped me understand how Spring manages objects, injects dependencies, and separates responsibilities across different layers.

I'm continuing to learn and improve my backend development skills. Feedback and suggestions are always welcome!