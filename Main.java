// Main.java

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JTextField nameField;

    JTextField sub1Field, sub2Field, sub3Field;

    JButton submitButton;

    JTable table;

    DefaultTableModel model;

    Main() {

        setTitle("Examination Management System");

        setSize(1000, 550);

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

        inputPanel.add(nameLabel);

        nameField = new JTextField(10);

        inputPanel.add(nameField);

        JLabel sub1Label = new JLabel("Subject 1");

        inputPanel.add(sub1Label);

        sub1Field = new JTextField(5);

        inputPanel.add(sub1Field);

        JLabel sub2Label = new JLabel("Subject 2");

        inputPanel.add(sub2Label);

        sub2Field = new JTextField(5);

        inputPanel.add(sub2Field);

        JLabel sub3Label = new JLabel("Subject 3");

        inputPanel.add(sub3Label);

        sub3Field = new JTextField(5);

        inputPanel.add(sub3Field);

        submitButton = new JButton("Submit");

        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.CENTER);

        model = new DefaultTableModel();

        model.addColumn("Student Name");

        model.addColumn("Subject 1");

        model.addColumn("Subject 2");

        model.addColumn("Subject 3");

        model.addColumn("Average");

        model.addColumn("Grade");

        table = new JTable(model);

        table.setRowHeight(25);

        JScrollPane pane = new JScrollPane(table);

        pane.setPreferredSize(new Dimension(950, 350));

        JPanel tablePanel = new JPanel();

        tablePanel.add(pane);

        add(tablePanel, BorderLayout.SOUTH);

        submitButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();

        int sub1 = Integer.parseInt(sub1Field.getText());

        int sub2 = Integer.parseInt(sub2Field.getText());

        int sub3 = Integer.parseInt(sub3Field.getText());

        Student s = new Student(
                name,
                sub1,
                sub2,
                sub3,
                model
        );

        s.conductExam();

        s.evaluateMarks();

        s.publishResult();

        nameField.setText("");

        sub1Field.setText("");

        sub2Field.setText("");

        sub3Field.setText("");
    }

    public static void main(String[] args) {

        new Main();
    }
}