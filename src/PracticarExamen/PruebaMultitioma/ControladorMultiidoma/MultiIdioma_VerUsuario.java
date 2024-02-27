package PracticarExamen.PruebaMultitioma.ControladorMultiidoma;

import PracticarExamen.PruebaMultitioma.ControladorMultiidoma.MultiIdioma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static PracticarExamen.PruebaMultitioma.ControladorMultiidoma.MultiIdioma.usuario_seleccionado;

public class MultiIdioma_VerUsuario {
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_abajo;
    private JLabel label_titulo_ver;
    private JLabel label_nombre;
    private JLabel label_correo;
    private JLabel label_nombre_ver;
    private JLabel label_correo_ver;

    public void mostrarVentana(final MultiIdioma multiIdioma){
        JFrame frame = new JFrame("VER USUARIO");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,550,650);

    }

    public MultiIdioma_VerUsuario(){
        label_nombre_ver.setText(usuario_seleccionado.getNombre());
        label_correo_ver.setText(usuario_seleccionado.getCorreo());
    }

}
