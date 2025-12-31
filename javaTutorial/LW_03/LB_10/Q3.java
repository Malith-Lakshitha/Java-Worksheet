package LB_10;

import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        panel.add(saveButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
