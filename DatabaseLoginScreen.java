import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatabaseLoginScreen extends JFrame {
    
    public DatabaseLoginScreen() {
        // Set up frame
        setTitle("Database Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Set up layout
        setLayout(new BorderLayout());

        // Create a panel for form inputs
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2, 10, 10));  // 3 rows, 2 columns, 10px gaps

        // Add username and password labels and text fields
        formPanel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        formPanel.add(usernameField);

        formPanel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField);

        // Add the form panel to the center of the frame
        add(formPanel, BorderLayout.CENTER);

        // Create a login button and add an action listener
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Here you could add code to handle login logic
                JOptionPane.showMessageDialog(DatabaseLoginScreen.this, "Attempting login...");
            }
        });

        // Add the login button to the bottom of the frame
        add(loginButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            DatabaseLoginScreen loginScreen = new DatabaseLoginScreen();
            loginScreen.setVisible(true);
        });
    }
}
