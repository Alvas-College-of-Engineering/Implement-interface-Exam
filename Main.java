import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

interface Exam {

    void conductExam();

    void evaluateMarks();

    void publishResult();
}

class Student implements Exam {

    String name;

    int marks;

    String grade;

    DefaultTableModel model;

    Student(String name, int marks, DefaultTableModel model) {

        this.name = name;

        this.marks = marks;

        this.model = model;
    }

    public void conductExam() {

        System.out.println("Exam Conducted for " + name);
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

        model.addRow(new Object[] {
                name,
                marks,
                grade
        });
    }
}

public class Main extends JFrame implements ActionListener {

    JTextField nameField, marksField;

    JButton submitButton;

    JTable table;

    DefaultTableModel model;

    Main() {

        setTitle("Examination Management System");

        setSize(800, 500);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel heading = new JLabel(
                "Examination Management System",
                JLabel.CENTER
        );

        heading.setFont(new Font("Arial", Font.BOLD, 28));

        add(heading, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        JLabel nameLabel = new JLabel("Student Name");

        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));

        inputPanel.add(nameLabel);

        nameField = new JTextField(12);

        inputPanel.add(nameField);

        JLabel marksLabel = new JLabel("Marks");

        marksLabel.setFont(new Font("Arial", Font.BOLD, 15));

        inputPanel.add(marksLabel);

        marksField = new JTextField(8);

        inputPanel.add(marksField);

        submitButton = new JButton("Submit");

        submitButton.setFont(new Font("Arial", Font.BOLD, 14));

        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.CENTER);

        model = new DefaultTableModel();

        model.addColumn("Student Name");

        model.addColumn("Marks");

        model.addColumn("Grade");

        table = new JTable(model);

        table.setRowHeight(25);

        table.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane pane = new JScrollPane(table);

        pane.setPreferredSize(new Dimension(750, 300));

        JPanel tablePanel = new JPanel();

        tablePanel.add(pane);

        add(tablePanel, BorderLayout.SOUTH);

        submitButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();

        int marks = Integer.parseInt(marksField.getText());

        Student s = new Student(name, marks, model);

        s.conductExam();

        s.evaluateMarks();

        s.publishResult();

        nameField.setText("");

        marksField.setText("");
    }

    public static void main(String[] args) {

        new Main();
    }
}