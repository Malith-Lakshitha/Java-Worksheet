package LB_10;

import javax.swing.*;
import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

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

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        panel.add(saveButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
