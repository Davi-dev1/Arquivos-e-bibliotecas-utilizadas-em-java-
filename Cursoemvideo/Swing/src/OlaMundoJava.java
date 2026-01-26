import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava extends javax.swing.JFrame {
    private JPanel painelPrincipal;
    private JButton cliqueEmMimButton;
    private JLabel text;

    public OlaMundoJava() {
        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //actionPerfomed é um evento (metódo em resposta a algo)
                text.setText("Olá Mundo!");//setText é um metódo desse objeto que permite modificar o texto que esta nele
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Tela");
        frame.setContentPane(new OlaMundoJava().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // centraliza
        frame.setVisible(true);
    }
}
