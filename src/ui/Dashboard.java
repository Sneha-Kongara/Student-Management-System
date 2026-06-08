package ui;

import javax.swing.*;

public class Dashboard extends JFrame {

    JLabel lblTitle;

    JButton btnManageStudents;

    JButton btnExit;

    public Dashboard() {

        setTitle("Dashboard");

        setSize(500,350);

        setLayout(null);

        lblTitle =
                new JLabel(
                        "Student Management Dashboard");

        lblTitle.setBounds(
                140,
                30,
                250,
                30);

        add(lblTitle);

        btnManageStudents =
                new JButton(
                        "Manage Students");

        btnManageStudents.setBounds(
                140,
                100,
                200,
                40);

        add(btnManageStudents);

        btnExit =
                new JButton("Exit");

        btnExit.setBounds(
                140,
                170,
                200,
                40);

        add(btnExit);

        btnManageStudents.addActionListener(e -> {

            new StudentForm();

        });

        btnExit.addActionListener(e -> {

            System.exit(0);

        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
