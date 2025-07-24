# 📦 Java Arrays Activity – *Name That Box!*

## 🧠 Learning Goal

Working with **arrays**.  
Learning outcomes:
- Declare, create, and use arrays in Java.
- Store and retrieve values using indices.
- Use loops to work with arrays interactively.

---

## 👨‍🏫 Getting Started

Use any of the following to run the code:

- 💻 **NetBeans**
- 🌐 [JDoodle Java Online Editor](https://www.jdoodle.com/)
- ☁️ Any online Java compiler

---

## 🎮 Interactive Challenge: *“Name That Box”*

### 💡 Scenario

You are managing a row of **storage boxes**.  
Each box must store a student’s name. Start by storing 5 names.

---
### ✅ Student Tasks

| Task         | Description                                                       |
|--------------|-------------------------------------------------------------------|
| 🏁 Task 1    | Run the code and enter 5 student names                            |
| 🔄 Task 2    | Change the array size to 3 and test the code                      |
| 🔠 Task 3    | Convert each name to UPPERCASE before storing                     |
| 🔍 Task 4    | Ask the user for a number (0–4) and display the name at that index|

---
## 🧪 Starter Code

```java
import java.util.Scanner;

public class NameThatBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create an array to store 5 names
        String[] studentNames = new String[5];

        // Step 2: Use a loop to get input from the user
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
        }

        // Step 3: Print all the names using a loop
        System.out.println("\n📋 List of Students:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Box " + i + " contains: " + studentNames[i]);
        }
    }
}
