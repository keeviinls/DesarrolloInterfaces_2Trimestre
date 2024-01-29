package Aplicacion_Notas.Controlador;

import Aplicacion_Notas.Modelo.Nota;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Ventana_Nota extends Component {
    private JPanel main_panel_ventana;
    private JPanel panel_titulo;
    private JLabel label_titulo;
    private JPanel panel_formulario;
    private JTextField textField_nombre;
    private JTextField textField_apellido;
    private JTextField textField_nota;
    private JLabel label_nombre;
    private JLabel label_apellido;
    private JLabel label_nota;
    private JButton boton_aceptar;
    private JButton boton_cancelar;
    private JPanel panel_botones;
    private JLabel label_texto;
    private JLabel label_foto;
    private JPanel panelarriba;
    private JButton btn_nuevo;

    public Ventana_Nota() {

        btn_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField_nombre.setText("");
                textField_apellido.setText("");
                textField_nota.setText("");
            }
        });
    }

    public void mostrarVentana(final Notas_Principal notasPrincipal) {

        JFrame frame = new JFrame("Ventana_Nota");
        frame.setContentPane(main_panel_ventana);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,550,650);


        boton_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = textField_nombre.getText();
                String apellido = textField_apellido.getText();
                String nota = textField_nota.getText();

                if (!textField_nombre.getText().isEmpty() && !textField_apellido.getText().isEmpty() && !textField_nota.getText().isEmpty()){
                    notasPrincipal.agregarFila(nombre, apellido, nota);

                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Para poder crear una nueva nota debes de rellenar todos los campos", "Rellena todo los campos", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        boton_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
    }

}

