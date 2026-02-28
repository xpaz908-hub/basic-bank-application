# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/)

## 2026-26-02
Created the repository and started on creating (my attempt at) an organized file structure.\
*please note that this changelog probably wont look the best, im still learning (⌐▨_▨)*

### Added
- /src
    - /main
    - /users
    - /views
    - /account

- boilerplate for "user" parent class and "admin" + "customer" child class

## 2026-28-02
Done with the welcome view and created a util package for future utilities made for convieniece.\
I am also using basic FileI/O to store and retrieve user data through cli before trying web and then using a DB.\
Will be storing passwords using hashing, however I am first experimenting and comparing insecure vs secure practices.

### Added
- /util and clearTerminal method for reusability
**/src/views**
- LoginView.java
- RegisterView.java
**/src/util**
- FileIO.java
- IdGenerator.java
- Console.java

- RegisterView PoC finished
- created FileIO util methods

### Notes
- renamed "main" to "core"
- going to make exceptions package for custom exceptions
- 

