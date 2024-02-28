package PracticarEditorImagenes.ControladorPracticarImagenes;

import javax.swing.*;

import static PracticarEditorImagenes.ControladorPracticarImagenes.EditorImagenPracticar.imagen_seleccionada;


public class EditorImagenPracticar_Ver extends JFrame {
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_abajo;
    private JLabel imagen_ver;
    private JLabel label_nombre;
    private JLabel label_nombre_imagen;

    public EditorImagenPracticar_Ver(){
        label_nombre_imagen.setText(imagen_seleccionada.getNombre());


        ImageIcon icono = new ImageIcon(imagen_seleccionada.getImagen());
        imagen_ver.setIcon(icono);

    }


    public void mostrarVentana(final EditorImagenPracticar editorImagenPracticar) {
        JFrame frame = new JFrame("EditorImagenPracticar_Ver");
        frame.setContentPane(mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,750,600);

    }
}
