# Examination Management System

A Java-based Examination Management System developed using Swing GUI and Object-Oriented Programming concepts. This project demonstrates the implementation of interfaces, classes, GUI development, and result evaluation.

---

## Features

- Java Swing based graphical user interface
- Student result management system
- Interface implementation using `Exam`
- Automatic grade calculation
- Average marks calculation
- Tabular result display using JTable
- Simple and clean frontend design

---

## Technologies Used

- Java
- Swing GUI
- OOP Concepts
- JTable
- DefaultTableModel

---

## Concepts Demonstrated

### Interface

The `Exam` interface contains:

- `conductExam()`
- `evaluateMarks()`
- `publishResult()`

### Class Implementation

The `Student` class implements the `Exam` interface and performs:

- Exam processing
- Average calculation
- Grade evaluation
- Result publishing

---

## Grading System

| Average Marks | Grade |
|---------------|-------|
| 90 and above  | A     |
| 75 - 89       | B     |
| 50 - 74       | C     |
| Below 50      | Fail  |

---

## GUI Preview

The application provides:

- Input fields for student details
- Subject-wise marks entry
- Automatic result generation
- Table-based result display


---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Project Structure

```text
.
├── Exam.java
├── Student.java
├── Main.java
└── README.md
```

---

## Sample Output
 
| Student Name  | Subject 1  | Subject 2  | Subject 3  | Average | Grade |
|---------------|------------|------------|------------|---------|-------|
| Alice         | 85         | 90         | 80         | 85.0    | B     |

---

## Learning Outcomes

Through this project, the following concepts are understood:

- Java Interface Implementation
- GUI Development using Swing
- Event Handling
- JTable Integration
- Runtime Data Processing
- Object-Oriented Programming

---

## Author

Gourish

---

## License

This project is created for educational and academic purposes.