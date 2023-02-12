import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RegistrationForm extends JFrame {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerPanel;
    private JButton btnLogin;

    public RegistrationForm() {
        setTitle("Registration Page");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(1000, 500));
        setUndecorated(true);
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                dispose();
            }
        });
        setVisible(true);
        add(btnLogin);
    }

    private void registerUser() {
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        char[] chars1 = name.toCharArray();
        for (char c : chars1) {
            if (Character.isDigit(c)) {
                JOptionPane.showMessageDialog(this,
                        "Name cannot have number(s)",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid email",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }


        char[] chars2 = phone.toCharArray();
        for (char c : chars2) {
            if (!Character.isDigit(c) || phone.length() != 10) {
                JOptionPane.showMessageDialog(this,
                        "Please enter valid phone number",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }


        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this,
                    "Confirm Password does not match",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        user = addUserToDatabase(name, email, phone, password);
        if (user != null) {
            dispose();
        }
    }

    public User user;

    private User addUserToDatabase(String name, String email, String phone, String password) {
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/swing_demo";
        final String USERNAME = "root";
        final String PASSWORD = "rootpassword";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO acc VALUES(' " + name + "' , '" + email + "' , '" + phone + "' , '" + password + " ')";
            Statement stmt = conn.createStatement();


            //Insert row into the table
            int addedRows = stmt.executeUpdate(sql);
            if (addedRows > 0) {
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.password = password;
                JOptionPane.showMessageDialog(btnRegister,
                        "Welcome, " + name + " your account is successfully created");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        RegistrationForm myForm = new RegistrationForm();
        User user = myForm.user;
    }
}