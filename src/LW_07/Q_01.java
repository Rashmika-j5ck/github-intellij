package LW_07;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;







    public class Q_01 extends JFrame implements ActionListener {

        // Input Components
        private JTextField nameField, mobileField;
        private JRadioButton maleButton, femaleButton;
        private ButtonGroup genderGroup;
        private JComboBox<String> dayBox, monthBox, yearBox;
        private JTextArea addressArea;
        private JCheckBox termsCheckbox;

        // Action Components
        private JButton submitButton, resetButton;
        private JTextArea outputArea; // Displays the registration data
        private JLabel statusLabel; // Displays "Registration Successfully.."

        public Q_01() {
            setTitle("Registration Form");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 500);
            setLayout(new BorderLayout(10, 10));

            // --- 1. Top Title Panel ---
            JLabel titleLabel = new JLabel("Registration Form", SwingConstants.CENTER);
            titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
            add(titleLabel, BorderLayout.NORTH);

            // --- 2. Input Panel (Left Side) ---
            // Uses GridLayout for simple label/field alignment
            JPanel inputPanel = new JPanel(new GridLayout(8, 2, 10, 10));
            inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // Name
            nameField = new JTextField(20);
            inputPanel.add(new JLabel("Name:"));
            inputPanel.add(nameField);

            // Mobile
            mobileField = new JTextField(20);
            inputPanel.add(new JLabel("Mobile:"));
            inputPanel.add(mobileField);

            // Gender (Radio Buttons in a ButtonGroup)
            maleButton = new JRadioButton("Male");
            femaleButton = new JRadioButton("Female");
            maleButton.setSelected(true);
            genderGroup = new ButtonGroup();
            genderGroup.add(maleButton);
            genderGroup.add(femaleButton);
            JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            genderPanel.add(maleButton);
            genderPanel.add(femaleButton);
            inputPanel.add(new JLabel("Gender:"));
            inputPanel.add(genderPanel);

            // DOB (Combo Boxes)
            String[] days = {"1", "30", "31"};
            String[] months = {"Jan", "May", "Dec"};
            String[] years = {"1995", "1996", "2000"};
            dayBox = new JComboBox<>(days);
            monthBox = new JComboBox<>(months);
            yearBox = new JComboBox<>(years);
            JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            dobPanel.add(dayBox);
            dobPanel.add(monthBox);
            dobPanel.add(yearBox);
            monthBox.setSelectedItem("May");
            inputPanel.add(new JLabel("DOB:"));
            inputPanel.add(dobPanel);

            // Address (TextArea with ScrollPane)
            addressArea = new JTextArea(3, 20);
            JScrollPane addressScrollPane = new JScrollPane(addressArea);
            inputPanel.add(new JLabel("Address:"));
            inputPanel.add(addressScrollPane);

            // Spacers for alignment
            inputPanel.add(new JLabel(""));

            // Terms and Conditions Checkbox
            termsCheckbox = new JCheckBox("Accept Terms And Conditions");
            inputPanel.add(termsCheckbox);

            // Action Buttons Panel
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            submitButton = new JButton("Submit");
            resetButton = new JButton("Reset");
            submitButton.addActionListener(this); // Register ActionListener
            resetButton.addActionListener(this);   // Register ActionListener
            buttonPanel.add(submitButton);
            buttonPanel.add(resetButton);

            inputPanel.add(buttonPanel);
            inputPanel.add(new JLabel(""));

            add(inputPanel, BorderLayout.WEST);

            // --- 3. Output Panel (Right Side) ---
            outputArea = new JTextArea();
            outputArea.setEditable(false);
            outputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
            JScrollPane outputScrollPane = new JScrollPane(outputArea);

            // Panel to hold the output area and the status label (for success message)
            JPanel rightPanel = new JPanel(new BorderLayout());
            rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));

            statusLabel = new JLabel("", SwingConstants.LEFT);
            statusLabel.setFont(new Font("Serif", Font.BOLD, 16));
            statusLabel.setForeground(Color.GREEN.darker());

            rightPanel.add(outputScrollPane, BorderLayout.CENTER);
            rightPanel.add(statusLabel, BorderLayout.SOUTH);

            add(rightPanel, BorderLayout.CENTER);

            setVisible(true);
        }

        // --- ActionListener Implementation ---
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                handleSubmit();
            } else if (e.getSource() == resetButton) {
                handleReset();
            }
        }

        private void handleSubmit() {
            // 1. Validation Check
            if (!termsCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(this,
                        "You must accept the Terms And Conditions to register.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                statusLabel.setText("");
                return;
            }

            // 2. Data Gathering
            String name = nameField.getText();
            String mobile = mobileField.getText();
            String gender = maleButton.isSelected() ? "Male" : "Female";

            String day = (String) dayBox.getSelectedItem();
            String month = (String) monthBox.getSelectedItem();
            String year = (String) yearBox.getSelectedItem();
            String dob = day + "/" + month + "/" + year;

            String address = addressArea.getText();

            // 3. Format and Display Data
            String output = "Name: " + name + "\n"
                    + "Mobile: " + mobile + "\n"
                    + "Gender: " + gender + "\n"
                    + "DOB:" + dob + "\n"
                    + "Address " + address; // Note: using 'Address ' as in demo image format

            outputArea.setText(output);

            // 4. Display Success Message
            statusLabel.setText("Registration Successfully..");
        }

        private void handleReset() {
            // Clear all fields and reset to defaults
            nameField.setText("");
            mobileField.setText("");
            addressArea.setText("");

            genderGroup.clearSelection();
            maleButton.setSelected(true);

            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);

            termsCheckbox.setSelected(false);

            outputArea.setText("");
            statusLabel.setText("");
        }

        public static void main(String[] args) {
            // Launch the GUI on the Event Dispatch Thread (EDT)
            SwingUtilities.invokeLater(() -> new Q_01());
        }
    }

