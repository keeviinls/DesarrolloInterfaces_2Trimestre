package Aplicacion_Notas.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana_modificar extends Component {
    private JPanel mainpanel_modificar;
    private JPanel panelarriba;
    private JPanel panel_titulo;
    private JLabel label_titulo;
    private JLabel label_texto;
    private JLabel label_foto;
    private JPanel panel_formulario;
    private JLabel label_apellido;
    private JLabel label_nota;
    private JLabel label_nombre;
    private JTextField textField_nombre;
    private JTextField textField_nota;
    private JTextField textField_apellido;
    private JButton btn_nuevo;
    private JPanel panel_botones;
    private JButton boton_aceptar;
    private JButton boton_cancelar;

    private String nuevo_nombre;
    private String nuevo_apellido;
    private String nuevo_nota;

    public ventana_modificar() {

        btn_nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField_nombre.setText("");
                textField_apellido.setText("");
                textField_nota.setText("");
            }
        });
    }

    public void mostrarVentana(final Notas_Principal notasPrincipal, String nombre, String apellidos, String nota) {
        // Crea un nuevo JFrame para mostrar la ventana
        JFrame frame = new JFrame("Ventana_Modificar");
        frame.setContentPane(mainpanel_modificar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,550,650);

        textField_nombre.setText(nombre);
        textField_apellido.setText(apellidos);
        textField_nota.setText(nota);
        boton_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtiene los datos de los JTextField
                String nombre = textField_nombre.getText();
                String apellido = textField_apellido.getText();
                String nota = textField_nota.getText();

                if (!textField_nombre.getText().isEmpty() && !textField_apellido.getText().isEmpty() && !textField_nota.getText().isEmpty()){
                    nuevo_nombre = textField_nombre.getText();
                    nuevo_apellido = textField_apellido.getText();
                    nuevo_nota = textField_nota.getText();

                    int seleccionar_fila = notasPrincipal.getTable().getSelectedRow();
                    notasPrincipal.getTable().setValueAt(nuevo_nombre, seleccionar_fila, 0);
                    notasPrincipal.getTable().setValueAt(nuevo_apellido, seleccionar_fila, 1);
                    notasPrincipal.getTable().setValueAt(nuevo_nota, seleccionar_fila, 2);


                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Para poder modificar la nota debes de rellenar todos los campos", "Rellena todo los campos", JOptionPane.ERROR_MESSAGE);
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
