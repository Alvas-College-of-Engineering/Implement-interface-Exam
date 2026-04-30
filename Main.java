import java.util.*;

interface Exam {
    void conductExam(Scanner sc);
    void evaluateMarks();
    void publishResult();
}

class Student implements Exam {
    String name;
    int marks;
    String grade;

    // Use scanner from main
    public void conductExam(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks (out of 100): ");
        marks = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    public void evaluateMarks() {
        if (marks >= 90)
            grade = "A";
        else if (marks >= 75)
            grade = "B";
        else if (marks >= 50)
            grade = "C";
        else
            grade = "Fail";
    }

    public void publishResult() {
        evaluateMarks();
        System.out.println("------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            Student s = new Student();
            s.conductExam(sc); // pass scanner
            students.add(s);
        }

        System.out.println("\nALL STUDENT RESULTS");
        for (Student s : students) {
            s.publishResult();
        }

        sc.close(); // good practice
    }
}