# Student-Management-System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

> A console-based application to manage student records efficiently using Java's Object-Oriented principles and Collection Framework.

## 📖 About the Project
This project is a CRUD (Create, Read, Update, Delete) application built to demonstrate core Java concepts. It allows educational administrators to perform essential operations on student data through a menu-driven interface.

It was built to practice:
* **Encapsulation:** Using private fields with getters and setters.
* **Collections:** Using `ArrayList` for dynamic data storage.
* **Algorithms:** Implementing custom search logic and sorting using `Comparator`.

## ✨ Features
* ✅ **Add Student:** Input details like Roll No, Name, Age, and Grade.
* ✅ **View All:** Display a list of all enrolled students.
* ✅ **Search:** Find a specific student by their unique Roll Number.
* ✅ **Update:** Modify details of an existing student.
* ✅ **Delete:** Remove a student record from the system.
* ✅ **Sort:** Organize the student list alphabetically by name.

## 🛠️ Technical Implementation
The project is structured into three main classes to separate concerns:

1.  **`Student.java` ( The Model)**
    * Represents the structure of a Student object.
    * Uses private variables for Encapsulation.
    * Includes a `toString()` method for easy printing.

2.  **`StudentManager.java` (The Logic)**
    * Manages the `ArrayList<Student>` database.
    * Contains business logic (e.g., preventing duplicate IDs, handling deletion).
    * Uses `Comparator.comparing(Student::getName)` for sorting.

3.  **`Main.java` (The Interface)**
    * Contains the `main` method.
    * Handles user input using `Scanner`.
    * Implements a `switch-case` menu loop for navigation.

## 🚀 Getting Started

### Prerequisites
* **Java Development Kit (JDK) 8** or higher.
* **Eclipse IDE** (or any Java IDE like IntelliJ/NetBeans).

### Installation & Execution (Eclipse)
1.  **Clone the repository** (or download the ZIP):
    ```bash
    git clone [https://github.com/](https://github.com/)[your-username]/StudentManagementSystem.git
    ```
2.  **Open Eclipse**:
    * Go to `File` > `Open Projects from File System`.
    * Select the downloaded folder.
3.  **Run the App**:
    * Open `Main.java`.
    * Right-click > `Run As` > `Java Application`.

## 💻 Usage Example

```text
Student Management System
1. Add Student
2. View Students
3. Search Student
...
Choose an option: 1

Enter Roll Number: 101
Enter Name: John Doe
Enter Age: 20
Enter Grade: 88.5
Student Added Successfully;
