## Expense Tracker

[UML:ExpensesTracker-diagram.pdf](https://github.com/user-attachments/files/16315538/UML.ExpensesTracker-diagram.pdf)

## Overview
Expense Tracker is a Java-based application designed to help users manage their finances by tracking expenses, budgets, and categories. Built with Spring Boot and Maven, this project leverages the power of SQL databases to store and manage financial data efficiently.

## Features
- **User Management**: Register, update, and manage user profiles.
- **Expense Tracking**: Log, update, and categorize expenses.
- **Budget Management**: Set, update, and monitor budgets for different categories.
- **Category Management**: Create and manage categories for expenses.

## Prerequisites
- Java JDK 11 or later
- Maven 3.6 or later
- An SQL database (e.g., MySQL, PostgreSQL)

## Installation
1. Clone the repository: git clone https://github.com/axgracia/expense-tracker.git
2. Navigate to the project directory:  cd Expense-Tracker---Project-1
3. Configure the `src/main/resources/application.properties` file with your database connection details.
4. Build the project with Maven: mvn clean install

## Running the Application
Run the application using Maven: mvn spring-boot:run

The application will start and be accessible on `http://localhost:8080`.

## Testing
Execute the following command to run the tests: mvn test

## API Endpoints
- **User Management**: `/api/users`
- **Expense Tracking**: `/api/expenses`
- **Budget Management**: `/api/budgets`
- **Category Management**: `/api/categories`

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your proposed changes.


