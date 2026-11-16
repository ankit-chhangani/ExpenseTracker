# ExpenseTracker

A console-based expense management application built using **Java and Spring Core**.

I initially built this project to practise Spring Core concepts and understand how different components work together. I've continued improving it by adding user interaction, input validation, exception handling, and logging.

## Features

- Add new expenses through a menu-driven CLI
- Find expenses by ID
- Delete expenses by ID
- Calculate total expenses
- Accept user input using Java Scanner
- Validate expense data
- Handle invalid inputs and application errors
- Custom exception handling
- Console-based application logging using SLF4J and Logback

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
- **Main:** Initializes the Spring container and manages CLI interaction.

## Spring Concepts Practised

- Inversion of Control (IoC)
- Dependency Injection
- Constructor, Setter, and Field Injection
- Spring IoC Container
- Component Scanning
- Java-based Configuration
- `@Component`, `@Service`, and `@Repository`
- Maven Dependency Management

## Exception Handling

Created two custom runtime exceptions:

- `ExpenseNotFoundException`
- `InvalidExpenseException`

Also practised handling invalid user inputs and unexpected application errors.

## Logging

Implemented console-based logging using:

- **SLF4J:** Logging API
- **Logback:** Logging implementation

Practised meaningful INFO and ERROR log messages, dynamic log values, and exception stack traces.

## Technologies

- Java
- Spring Core
- Maven
- SLF4J
- Logback

## Current Limitations

This is a learning project focused on understanding Java and Spring Core fundamentals.

- Expenses are stored in an in-memory `ArrayList`.
- Data is not preserved after the application stops.
- No database integration yet.
- No graphical user interface or REST API.

## Learning Outcome

This project helped me understand how Spring manages objects, injects dependencies, and separates responsibilities across different layers.

It also gave me practical experience with CLI development, exception handling, and application logging.

I'm continuing to improve this project as I learn more about backend development. Feedback and suggestions are always welcome!