import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerApp extends JFrame implements ActionListener {

    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PalindromeCheckerApp() {
        setTitle("Palindrome Checker App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Enter Text to Check Palindrome", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        inputField = new JTextField();
        checkButton = new JButton("Check");
        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1, 10, 10));
        centerPanel.add(inputField);
        centerPanel.add(checkButton);

        add(titleLabel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        checkButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();

        if (text.isEmpty()) {
            resultLabel.setText("Please enter some text!");
            return;
        }

        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            resultLabel.setText("✅ It is a Palindrome!");
        } else {
            resultLabel.setText("❌ Not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        // UC1: Display welcome message and app information
        System.out.println("===================================");
        System.out.println("   Welcome to PalindromeCheckerApp");
        System.out.println("   Version: 1.0");
        System.out.println("   Author: Deepika Ramireddy");
        System.out.println("===================================\n");

        System.out.println("Launching application...");

        // Launch the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PalindromeCheckerApp().setVisible(true);
            }
        });
    }
}