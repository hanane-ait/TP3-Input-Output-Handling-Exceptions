# TP – Java Practice: I/O, Serialization, and Exceptions

## Introduction

This repository contains the solutions for the **Java practice exercises** covering:

- Input/Output handling (`ls` simulation)
- Objects serialization (`products.dat`)
- Exception handling (Calculator, Vehicle speed check)

Each exercise includes:
- Problem description
- Proposed solution
- Screenshots of program execution

---

## Exercise 1: Simulate the `ls` Command

### Problem Description

We want to develop a Java program that simulates the **`ls` command**, which lists files and directories in a given path.  
The program must:
- Ask the user for the full path of a directory.
- Display the contents of the directory.
- Show `<DIR>` for directories and `<FILE>` for files.
- Show access permissions: `r` for readable, `w` for writable, and `h` if it is a hidden/cache file.


---

### Proposed Solution

1. Ask the user for the directory path.
2. Use `File` class to get the list of files and directories.
3. For each file/directory:
   - Determine if it is a file or directory.
   - Check permissions using `canRead()`, `canWrite()`.
   - Check if it is hidden using `isHidden()`.
4. Display the information in the required format.

**Java classes used:**
- `java.io.File`
- `Scanner` for input

---

### Program Execution

<img width="1224" height="259" alt="image" src="https://github.com/user-attachments/assets/80497aa9-14d7-45f2-ba3a-26339ad226a3" />
---

## Exercise 2: Objects Serialization in `products.dat`

### Problem Description

We want to manage a list of **Product objects** and save/load them from a file (`products.dat`) using serialization.  

The `Product` class contains:
- `id`, `name`, `brand`, `price`, `description`, `numberInStock`

We must create:
- `IProduitMetier` interface with methods: `add()`, `getAll()`, `findById()`, `delete(long id)`, `saveAll()`.
- `MetierProduitImpl` class implementing the interface.
- `Application` class with a menu to:
  1. Display all products
  2. Search product by ID
  3. Add a product
  4. Delete a product by ID
  5. Save products to `products.dat`
  6. Exit

---

### Proposed Solution

1. **Product class:** implements `Serializable`.
2. **MetierProduitImpl class:** manages `List<Product>` and file operations using `ObjectOutputStream` and `ObjectInputStream`.
3. **Application class:** interactive menu using a `while` loop and `Scanner`.

**Java concepts used:**
- Serialization (`Serializable`, `ObjectOutputStream`, `ObjectInputStream`)
- Interfaces
- Collections (`ArrayList`)

---

### Program Execution

**Screenshots:**
<img width="1268" height="502" alt="image" src="https://github.com/user-attachments/assets/41f04471-f88e-45bf-b983-a8d2de8f7714" />
<img width="1288" height="635" alt="image" src="https://github.com/user-attachments/assets/ef23c5f1-7423-4a35-994e-696606a710dc" />
<img width="537" height="406" alt="image" src="https://github.com/user-attachments/assets/b89f3586-78f6-4e60-8b3d-7eeb83b7ac35" />



---

## Exercise 3: Calculator with Exception Handling

### Problem Description

Create a `Calculator` class with methods to handle errors:

1. `divide(a, b)`: returns `a / b`, displays error if `b` is zero.
2. `convertToNumber(text)`: converts string to number, displays error if invalid.
3. `calculate(operation, a, b)`: supports `+`, `-`, `*`, `/`; displays error for unsupported operations.

---

### Proposed Solution

- Use `try/catch` blocks for handling `ArithmeticException` and `NumberFormatException`.
- Use `switch` statement for operations and handle default case for unsupported operations.

**Java concepts used:**
- Exception handling (`try-catch`)
- Basic arithmetic
- Input validation

---

### Program Execution
<img width="965" height="391" alt="image" src="https://github.com/user-attachments/assets/d2b1f1fe-2a71-4257-9729-9e92951082c1" />

<img width="646" height="417" alt="image" src="https://github.com/user-attachments/assets/4e640ebb-6e46-4efb-9b8f-405cfc8cd186" />

---

## Exercise 4: Vehicle and `TooFastException`

### Problem Description

1. Create `TooFastException` extending `Exception`:
   - Constructor takes an `int` speed and passes message to `super()`.
2. Create `Vehicle` class:
   - `testSpeed(int speed)` method throws `TooFastException` if `speed > 90`.
3. Test with `main` method and display call stack when exception occurs.

---

### Proposed Solution

1. Define custom exception `TooFastException`.
2. Implement `Vehicle` class with `testSpeed()` method.
3. Use `try-catch` in `main` to catch exception and display stack trace.

**Java concepts used:**
- Custom exception classes
- Exception propagation
- `try-catch` block

---

### Program Execution
<img width="1294" height="230" alt="image" src="https://github.com/user-attachments/assets/4cf93268-26ba-4ead-a535-529bda62d858" />
