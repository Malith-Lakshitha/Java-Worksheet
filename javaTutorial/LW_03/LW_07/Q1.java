package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame implements ActionListener {
    JTextField nameField, mobileField;
    JRadioButton maleButton, femaleButton;
    JComboBox<String> dayBox, monthBox, yearBox;
    JTextArea addressArea, outputArea;
    JCheckBox termsCheck;
    JButton submitButton, resetButton;
    JLabel resultLabel;
    ButtonGroup genderGroup;

    public Q1() {
        setTitle("Registration Form");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 30);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 80, 100, 30);
        mobileField = new JTextField();
        mobileField.setBounds(150, 80, 200, 30);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 30);
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        maleButton.setBounds(150, 130, 70, 30);
        femaleButton.setBounds(230, 130, 80, 30);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(50, 180, 100, 30);
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) days[i] = String.valueOf(i + 1);
        dayBox = new JComboBox<>(days);
        dayBox.setBounds(150, 180, 50, 30);

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        monthBox = new JComboBox<>(months);
        monthBox.setBounds(210, 180, 70, 30);

        String[] years = new String[100];
        for (int i = 0; i < 100; i++) years[i] = String.valueOf(1990 + i);
        yearBox = new JComboBox<>(years);
        yearBox.setBounds(290, 180, 70, 30);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 230, 100, 30);
        addressArea = new JTextArea();
        addressArea.setBounds(150, 230, 200, 60);
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);

        termsCheck = new JCheckBox("Accept Terms And Conditions");
        termsCheck.setBounds(150, 310, 250, 30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 360, 100, 30);
        resetButton = new JButton("Reset");
        resetButton.setBounds(260, 360, 100, 30);

        resultLabel = new JLabel("");
        resultLabel.setBounds(150, 410, 300, 30);
        resultLabel.setForeground(Color.BLUE);

        outputArea = new JTextArea();
        outputArea.setBounds(380, 30, 180, 300);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setBorder(BorderFactory.createTitledBorder("Output"));

        add(nameLabel); add(nameField);
        add(mobileLabel); add(mobileField);
        add(genderLabel); add(maleButton); add(femaleButton);
        add(dobLabel); add(dayBox); add(monthBox); add(yearBox);
        add(addressLabel); add(addressArea);
        add(termsCheck); add(submitButton); add(resetButton);
        add(resultLabel); add(outputArea);

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (termsCheck.isSelected()) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String dob = dayBox.getSelectedItem() + ":" +
                        monthBox.getSelectedItem() + ":" +
                        yearBox.getSelectedItem();
                String address = addressArea.getText();

                resultLabel.setText("Registration Successfully..");
                outputArea.setText("Name : " + name + "\n" +
                        "Mobile : " + mobile + "\n" +
                        "Gender : " + gender + "\n" +
                        "DOB : " + dob + "\n" +
                        "Address : " + address);
            } else {
                resultLabel.setText("Please accept Terms and Conditions.");
                outputArea.setText("");
            }
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            addressArea.setText("");
            termsCheck.setSelected(false);
            resultLabel.setText("");
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new Q1();
    }
}