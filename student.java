import javax.swing.table.DefaultTableModel;

public class Student implements Exam {

    String name;

    int sub1, sub2, sub3;

    double average;

    String grade;

    DefaultTableModel model;

    Student(
            String name,
            int sub1,
            int sub2,
            int sub3,
            DefaultTableModel model
    ) {

        this.name = name;

        this.sub1 = sub1;

        this.sub2 = sub2;

        this.sub3 = sub3;

        this.model = model;
    }

    public void conductExam() {

        System.out.println("Exam Conducted for " + name);
    }

    public void evaluateMarks() {

        average = (sub1 + sub2 + sub3) / 3.0;

        if (average >= 90)
            grade = "A";

        else if (average >= 75)
            grade = "B";

        else if (average >= 50)
            grade = "C";

        else
            grade = "Fail";
    }

    public void publishResult() {

        model.addRow(new Object[] {
                name,
                sub1,
                sub2,
                sub3,
                average,
                grade
        });
    }
}