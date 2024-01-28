package Aplicacion_Notas.Controlador;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Aplicacion_Notas.Controlador.Notas_Principal.nota_seleccionada;
public class ver_Nota extends JFrame{
    public JPanel mainpanel;
    private JPanel panelarriba;
    private JPanel panel_titulo;
    private JLabel label_titulo;
    private JLabel label_texto;
    private JLabel label_foto;
    private JPanel panel_informacion;
    private JPanel panel_botones;
    private JButton boton_salir;
    private JPanel panel_nombre;
    private JPanel panel_apellido;
    private JPanel panel_nota;
    private JLabel label_nombre_ver;
    private JLabel label_apellido_ver;
    private JLabel label_nota_ver;

    public ver_Nota() {
        // Configura los labels con la información de la nota seleccionada
        label_nombre_ver.setText(nota_seleccionada.getNombre());
        label_apellido_ver.setText(nota_seleccionada.getApellidos());
        label_nota_ver.setText(nota_seleccionada.getNota_completa());
    }


    public void mostrarVentana(final Notas_Principal notasPrincipal){
        JFrame frame = new JFrame("Ver Nota");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana al cerrarla
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,500,650);

        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

}
