import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo extends JDialog {
    private JTextField txtLado1;
    private JButton borrarButton;
    private JButton clacularButton;
    private JButton salirButton;
    private JPanel Main;

    public Triangulo(JFrame parent) {
        super(parent);
        setTitle("Triangulo Equilatero");
        setContentPane(Main);
        setMinimumSize(new Dimension(450, 300));
        setModal(true);
        setLocationRelativeTo(parent);

        clacularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Lado miLado = new Lado();

                double lado1 = Double.parseDouble(txtLado1.getText());
                miLado.setLado(lado1);

                double perimetro = miLado.getPerimetro();
                double altura = miLado.getAltura();
                double area = miLado.getArea();

                JOptionPane.showMessageDialog(null, "El perimetro es: "+ perimetro +
                        "\nLa altura es: "+ altura + "\nEl area es: "+ area);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado1.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        Triangulo form = new Triangulo(null);
    }
}
