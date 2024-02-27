package PracticarExamen.PruebaMultitioma.ControladorMultiidoma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiidoma_CrearUsuario {
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_abajo;
    private JLabel label_titulo_crear;
    private JTextField textfield_nombre;
    private JTextField textfield_correo;
    private JLabel label_nombre;
    private JLabel label_correo;
    private JButton boton_anadir;

    public void mostrarVentana(final MultiIdioma multiIdioma){
        JFrame frame = new JFrame("NUEVO USUARIO");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,550,650);

        boton_anadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textfield_nombre.getText();
                String correo = textfield_correo.getText();

                if (!textfield_nombre.getText().isEmpty() && !textfield_correo.getText().isEmpty()){
                    multiIdioma.agregarFila(nombre,correo);
                    frame.dispose();

                }else {
                    JOptionPane.showMessageDialog(null, "RELLENA TODO", "DEBES RELLENAR TODOS CAMPOS", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public Multiidoma_CrearUsuario(){

    }


}
