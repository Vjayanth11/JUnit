
# 🚀 Java OOP + TDD Projects

This repository contains two Java projects built with **Test-Driven Development (TDD)** and **JUnit**:

1. 🛒 **Shopping Cart System**
2. 🚕 **Cab Invoice Generator**

Both projects demonstrate OOP principles (**encapsulation, inheritance, polymorphism, abstraction**) and TDD methodology (**Red → Green → Refactor**).


## 🛒 Project 1: Shopping Cart System

### 📌 Objective

Develop a simple shopping cart system that allows users to:

* Add items
* Remove items
* View items
* Calculate the total price

### 📦 Requirements

* **Item Class**

  * Each item has `id`, `name`, `price`
  * Provide getters and `toString()`
* **ShoppingCart Class**

  * Add item
  * Remove item
  * View items
  * Calculate total price

### ✅ Test Cases

* Create item with valid details
* Get item details
* Add item to cart
* Remove item from cart
* View items in cart
* Calculate total price

### 🧪 Tech Stack

* Java
* JUnit 5
* TDD methodology

---

## 🚕 Project 2: Cab Invoice Generator

### 📌 Objective

Implement a **subscription-based cab service** invoice generator.
Customers take rides and pay at the end of the month.

### 📦 Requirements

1. **Single Ride Calculation**

   * Inputs: `distance (km)` + `time (min)`
   * Cost: `Rs. 10/km + Rs. 1/min`
   * Minimum Fare = `Rs. 5`
2. **Multiple Rides**

   * Handle list of rides
   * Aggregate total fare
3. **Enhanced Invoice**

   * Return:

     * Total rides
     * Total fare
     * Average fare per ride
4. **User-Based Rides**

   * Fetch rides for a given `userId` from repository
   * Generate invoice
5. **Premium Rides**

   * Normal Ride: `Rs. 10/km + Rs. 1/min`, min `Rs. 5`
   * Premium Ride: `Rs. 15/km + Rs. 2/min`, min `Rs. 20`

### ✅ Test Cases

* Calculate fare for single ride
* Enforce minimum fare
* Calculate total for multiple rides
* Generate invoice summary (total rides, total fare, avg fare)
* User-specific ride invoice
* Support both **Normal** and **Premium** rides

### 🧪 Tech Stack

* Java
* JUnit 5
* OOP + TDD principles



## 🔄 TDD Workflow Followed

1. Write failing test (Red)
2. Implement minimum code to pass (Green)
3. Refactor for clarity and maintainability (Refactor)



## ▶️ How to Run

1. Clone the repo:

   ```bash
   git clone https://github.com/your-username/your-repo.git
   ```
2. Compile the code:

   ```bash
   javac -d bin src/**/*.java
   ```
3. Run tests:

   ```bash
   mvn test
   ```

   or (if using Gradle)

   ```bash
   ./gradlew test
   ```

---

## 📂 Folder Structure

```
.
├── ShoppingCartSystem/
│   ├── src/
│   │   ├── Item.java
│   │   ├── ShoppingCart.java
│   └── test/
│       ├── ItemTest.java
│       └── ShoppingCartTest.java
│
├── CabInvoiceGenerator/
│   ├── src/
│   │   ├── Ride.java
│   │   ├── RideRepository.java
│   │   ├── InvoiceService.java
│   │   ├── InvoiceSummary.java
│   └── test/
│       ├── InvoiceServiceTest.java
│       └── RideTest.java
│
└── README.md
```

---

## 📖 References

* [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
* TDD Cycle: Kent Beck, *Test-Driven Development: By Example*

---
