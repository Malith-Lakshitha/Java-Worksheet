package LW_09;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Q1 extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;
    JButton signInButton;

    public Q1() {
        setTitle("Sign-Up");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 100, 30);
        emailField = new JTextField();
        emailField.setBounds(150, 50, 180, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 30);

        signInButton = new JButton("Sign In");
        signInButton.setBounds(150, 160, 100, 30);

        add(emailLabel); add(emailField);
        add(passwordLabel); add(passwordField);
        add(signInButton);

        signInButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/your_db", "your_user", "your_password"
                );
                String query = "SELECT * FROM users WHERE email=? AND password=?";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, email);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    showHomeGUI();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid credentials");
                }

                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }

    private void showHomeGUI() {
        JFrame homeFrame = new JFrame("Home");
        homeFrame.setSize(500, 400);
        homeFrame.setLayout(null);
        homeFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Home");
        titleLabel.setBounds(220, 20, 100, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.BLUE);

        JLabel headerLabel = new JLabel("Name and Address");
        headerLabel.setBounds(180, 60, 200, 30);
        headerLabel.setForeground(Color.GREEN);

        JButton backButton = new JButton("← Back");
        backButton.setBounds(10, 10, 80, 30);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(50, 100, 400, 250);
        imageLabel.setIcon(new ImageIcon("house.jpg")); // Replace with your image path

        homeFrame.add(titleLabel);
        homeFrame.add(headerLabel);
        homeFrame.add(backButton);
        homeFrame.add(imageLabel);

        backButton.addActionListener(e -> {
            new Q1();
            homeFrame.dispose();
        });

        homeFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}
