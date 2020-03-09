import javax.swing.*;
import java.awt.event.*;

public class java27 extends JFrame implements ActionListener {

    JButton button1;
    
    public java27(){
        setLayout(null);
        button1 = new JButton("Cerrar");
        button1.setBounds(300,250,100,30);
        add(button1); // Añadir al objeto button1

        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            System.exit(0);           
        }
    }

    public static void main(String[] args) {
        java27 formulario = new java27();

        formulario.setBounds(0,0,450,350);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}