import javax.swing.*;
import java.awt.*;

public class Homepage extends JFrame{
    private JPanel panel1;

    public Homepage(){
        setTitle("Login Page");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1000, 500));
        setUndecorated(true);
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
