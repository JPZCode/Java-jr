import javax.swing.*;
import java.awt.event.*;

public class java29 extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1;
    private JButton button1;

    public java29() { // ---- Diseño de componentes
        setLayout(null);

        label1 = new JLabel("Usuario: ");
        label1.setBounds(10,10,100,30);
        add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(120,17,150,20);
        add(textfield1);

        button1 =  new JButton("Aceptar");
        button1.setBounds(10,80,100,30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) { // ----- Eventos
        if (e.getSource() == button1){
            String texto = textfield1.getText();
            setTitle(texto);
        }
    }

    public static void main(String[] args) { // ------ Main
        java29  formulario1 = new java29();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}