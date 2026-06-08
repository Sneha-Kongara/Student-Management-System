package ui;

import javax.swing.*;

public class StudentForm extends JFrame {

    JLabel lblId;
    JLabel lblName;
    JLabel lblCourse;
    JLabel lblEmail;
    JLabel lblPhone;

    JTextField txtId;
    JTextField txtName;
    JTextField txtCourse;
    JTextField txtEmail;
    JTextField txtPhone;

    JButton btnAdd;
    JButton btnUpdate;
    JButton btnDelete;
    JButton btnSearch;
    JButton btnRefresh;

    JTable table;

    JScrollPane scrollPane;

    public StudentForm() {

        setTitle("Student Management");

        setSize(900,500);

        setLayout(null);

        lblId = new JLabel("Student ID");
        lblId.setBounds(20,20,100,25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120,20,150,25);
        add(txtId);

        lblName = new JLabel("Name");
        lblName.setBounds(20,60,100,25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120,60,150,25);
        add(txtName);

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(20,100,100,25);
        add(lblCourse);

        txtCourse = new JTextField();
        txtCourse.setBounds(120,100,150,25);
        add(txtCourse);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(20,140,100,25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(120,140,150,25);
        add(txtEmail);

        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(20,180,100,25);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(120,180,150,25);
        add(txtPhone);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(20,240,100,30);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(130,240,100,30);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(20,290,100,30);
        add(btnDelete);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(130,290,100,30);
        add(btnSearch);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(75,340,100,30);
        add(btnRefresh);

        table = new JTable();

        scrollPane =
                new JScrollPane(table);

        scrollPane.setBounds(
                320,
                20,
                540,
                400);

        add(scrollPane);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
