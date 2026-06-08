package ui;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame {

    JLabel lblTitle;
    JLabel lblUsername;
    JLabel lblPassword;

    JTextField txtUsername;
    JPasswordField txtPassword;

    JButton btnLogin;

    public LoginForm() {

        setTitle("Student Management System");

        setSize(400,300);

        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblTitle = new JLabel("ADMIN LOGIN");

        lblTitle.setBounds(140,20,150,30);

        add(lblTitle);

        lblUsername = new JLabel("Username");

        lblUsername.setBounds(50,80,100,25);

        add(lblUsername);

        txtUsername = new JTextField();

        txtUsername.setBounds(150,80,150,25);

        add(txtUsername);

        lblPassword = new JLabel("Password");

        lblPassword.setBounds(50,130,100,25);

        add(lblPassword);

        txtPassword = new JPasswordField();

        txtPassword.setBounds(150,130,150,25);

        add(txtPassword);

        btnLogin = new JButton("Login");

        btnLogin.setBounds(140,190,100,30);

        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String username =
                        txtUsername.getText();

                String password =
                        String.valueOf(
                                txtPassword.getPassword());

                if(username.equals("admin")
                        && password.equals("admin123")) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Login Successful");

                    dispose();

                    new Dashboard();

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid Username or Password");
                }
            }
        });

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
