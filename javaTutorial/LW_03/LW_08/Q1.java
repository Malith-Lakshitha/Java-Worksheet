package LB_08;

import javax.swing.*;
import java.awt.*;

public class Q1 extends JFrame {

    JTextField nameField, emailField, signInEmailField;
    JPasswordField passwordField, signInPasswordField;
    JRadioButton maleButton, femaleButton;
    JComboBox<String> dayBox, monthBox, yearBox;
    JCheckBox robotCheck;
    JButton signUpButton, signInButton;

    public Q1() {

        setTitle("Registration Form");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // ---------- SIGN UP PANEL ----------
        JPanel signUpPanel = new JPanel(new GridLayout(10, 1));
        signUpPanel.setBorder(BorderFactory.createTitledBorder("Sign Up"));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        dayBox = new JComboBox<>(days);

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        monthBox = new JComboBox<>(months);

        String[] years = new String[100];
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(1990 + i);
        }
        yearBox = new JComboBox<>(years);

        robotCheck = new JCheckBox("I am not a robot");
        signUpButton = new JButton("Sign Up");

        signUpPanel.add(new JLabel("Name"));
        signUpPanel.add(nameField);
        signUpPanel.add(new JLabel("Email"));
        signUpPanel.add(emailField);
        signUpPanel.add(new JLabel("Gender"));

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        signUpPanel.add(genderPanel);

        signUpPanel.add(new JLabel("Birthday"));
        JPanel birthdayPanel = new JPanel();
        birthdayPanel.add(dayBox);
        birthdayPanel.add(monthBox);
        birthdayPanel.add(yearBox);
        signUpPanel.add(birthdayPanel);

        signUpPanel.add(new JLabel("Password"));
        signUpPanel.add(passwordField);
        signUpPanel.add(robotCheck);
        signUpPanel.add(signUpButton);

        // ---------- SIGN IN PANEL ----------
        JPanel signInPanel = new JPanel(new GridLayout(5, 1));
        signInPanel.setBorder(BorderFactory.createTitledBorder("Sign In"));

        signInEmailField = new JTextField();
        signInPasswordField = new JPasswordField();
        signInButton = new JButton("Sign In");

        signInPanel.add(new JLabel("Email"));
        signInPanel.add(signInEmailField);
        signInPanel.add(new JLabel("Password"));
        signInPanel.add(signInPasswordField);
        signInPanel.add(signInButton);

        // ---------- ADD PANELS ----------
        add(signUpPanel);
        add(signInPanel);

        // ---------- BUTTON ACTIONS ----------
        signUpButton.addActionListener(e -> {
            if (robotCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "Sign-Up Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Please verify you're not a robot.");
            }
        });

        signInButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Sign-In Attempted!");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}
