import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginPage extends JFrame {
    private static final long serialVersionUID = 1L;
    JPanel loginPanel;
    private JTextField edtEmail;
    private JButton btnLogin;
    private JButton resetButton;
    private JPasswordField pfPassword;
    private JButton btnBack;
    private JLabel Login;

    public LoginPage() {
        setTitle("Login Page");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(1000, 500));
        setUndecorated(true);
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        final String DB_URL = "jdbc:mysql://localhost:3306/swing_demo";
        final String USERNAME = "root";
        final String PASSWORD = "rootpassword";

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement statement = connection.createStatement();
                    System.out.println(edtEmail.getText());
                    System.out.println(pfPassword.getPassword());
                    ResultSet result = statement.executeQuery("SELECT * FROM acc WHERE email_id  = '" + edtEmail.getText() + "' AND password = '" + new String(pfPassword.getPassword()) + " '");

                    if (result.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        new ChooseType().setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(btnLogin,
                                "Incorrect email or password");
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RegistrationForm registrationForm = new RegistrationForm();
                registrationForm.setVisible(true);
            }
        });
//        setVisible(true);
//        add(btnBack);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                edtEmail.setText("");
                pfPassword.setText("");
            }
        });
    }
}
