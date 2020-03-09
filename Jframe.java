import javax.swing.*;

public class Jframe extends JFrame {
    public Jframe() {
        setLayout(null);
    }
    public static void main(String[] args) {
        Jframe jframe1 = new Jframe();
        jframe1.setBounds(0, 0, 400, 550);
        jframe1.setVisible(true);
    }
}