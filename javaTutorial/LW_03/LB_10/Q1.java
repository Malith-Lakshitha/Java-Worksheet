package LB_10;

import javax.swing.*;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        String[] columnNames = {"Name", "ID", "Marks"};
        Object[][] data = {
                {"Amal", "CS/2022/020", 85},
                {"Nimali", "ET/2022/014", 77},
                {"Kamal", "CT/2022/011", 92}
        };

        JTable table = new JTable(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
