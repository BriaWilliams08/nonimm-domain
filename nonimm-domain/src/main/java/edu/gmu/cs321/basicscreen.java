package edu.gmu.cs321;

import javax.swing.*;
import java.awt.*;

public class basicscreen extends JFrame {
    private JLabel formIdLabel;
    private JLabel dateLabel;
    private JLabel stepLabel;

    public basicscreen(EntryForm entryForm) {
        // title
        setTitle("EntryForm Screen");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // labels for data
        formIdLabel = new JLabel("Form ID: " + entryForm.getformid());
        dateLabel = new JLabel("Date: " + entryForm.getdate());
        stepLabel = new JLabel(entryForm.getStep());

        // frame labels
        add(new JLabel("Form ID:"));
        add(formIdLabel);
        add(new JLabel("Date:"));
        add(dateLabel);
        add(new JLabel("Step:"));
        add(stepLabel);
        //buttons
        JButton approveButton = new JButton("Approve");
        JButton denyButton = new JButton("Deny");
        add(approveButton);
        add(denyButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        // test
        EntryForm entryForm = new EntryForm(123, 20231111, "Entry");
        new basicscreen(entryForm);
    }
}
