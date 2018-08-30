import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        Login loginPanel = new Login();
        f.setContentPane(loginPanel.getMainPanel());
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
