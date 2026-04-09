# BankStation

A basic CLI banking application written in Java. Built as a personal project to practice OOP concepts including inheritance, abstraction, encapsulation, and polymorphism.

## Features

- User registration and login with text file-based persistence
- Session-based authentication
- View-based navigation system using polymorphism
- Account home screen with planned support for deposits, withdrawals, and transfers

## Project Structure

```
src/
├── main/
│   └── Main.java           # Entry point, runs the view loop
├── views/
│   ├── View.java           # Abstract base class for all screens
│   ├── WelcomeView.java    # Landing screen
│   ├── LoginView.java      # Login screen
│   ├── RegisterView.java   # Registration screen
│   └── HomeView.java       # Authenticated user home screen
├── users/
│   ├── User.java           # Abstract base class for user types
│   ├── Customer.java       # Standard user with bank accounts
│   └── Admin.java          # Admin user (planned)
└── util/
    ├── AuthService.java    # Login and registration logic
    ├── FileIO.java         # File read/write operations
    └── Utils.java          # Shared utilities (input validation, terminal control)
```

## How It Works

Navigation is handled by a simple loop in `Main.java`. Each screen is a subclass of the abstract `View` class and implements a `show()` method that returns the next `View` to display — or `null` to exit. This means adding a new screen is as simple as creating a new `View` subclass.

User data (for now) is written to plain text file (`customer_database.txt`) and read back on login.

## OOP Concepts Practiced

- **Abstraction** — `View` and `User` are abstract classes that define contracts for their subclasses
- **Inheritance** — `LoginView`, `RegisterView`, etc. extend `View`; `Customer` and `Admin` extend `User`
- **Polymorphism** — the main loop operates on `View` references without knowing the concrete type
- **Encapsulation** — user fields are private and accessed through getters

## Planned

- Account balances with deposit, withdraw, and transfer
- Password hashing
- Admin functionality (view all users, delete accounts)
- Proper account objects tied to customers