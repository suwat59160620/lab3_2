import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login
{
    private JTextField txtUserLogin;
    private JPasswordField pwdUser;
    private JButton submitButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public Login() {
        submitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, txtUserLogin.getText()
                        + " " + new String(pwdUser.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtUserLogin.setText("");
                pwdUser.setText("");
            }
        });
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

}
