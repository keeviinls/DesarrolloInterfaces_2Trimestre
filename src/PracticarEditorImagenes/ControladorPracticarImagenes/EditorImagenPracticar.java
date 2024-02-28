package PracticarEditorImagenes.ControladorPracticarImagenes;

import PracticarEditorImagenes.ModeloPracticarImagenes.Imagen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorImagenPracticar {
    private JPanel mainpanel;
    private JLabel imagen_uno;
    private JLabel imagen_dos;
    private JLabel nombre_uno;
    private JLabel nombre_dos;
    private JPanel panel_arriba;
    private JPanel panel_menu;
    private JPanel panel_abajo;

    public static Imagen imagen_seleccionada = null;
    private JButton boton_mostrar_info;
    private JMenu jmenu_uno;
    private JMenu jmenu_dos;
    private JMenuItem item_abrir;
    private JMenuItem item_abrir_perro;
    private JMenuItem item_byn;
    private JButton boton_convertir;
    private JMenuItem item_gris;


    public EditorImagenPracticar(){
        opciones_menu();
        opciones_efectos();


        boton_mostrar_info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditorImagenPracticar_Ver editorImagenPracticar_ver = new EditorImagenPracticar_Ver();
                editorImagenPracticar_ver.mostrarVentana(EditorImagenPracticar.this);
            }
        });
    }

    private void opciones_efectos() {

        item_byn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ruta_imagen = "src/PracticarEditorImagenes/Fotos/perro_byn.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_dos.setIcon(icon);
                imagen_dos.setVisible(false);

                nombre_dos.setText("perro_byn");
                imagen_seleccionada=new Imagen("perro_byn",ruta_imagen);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_dos.setVisible(true);

                    }
                });

            }
        });

        item_gris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ruta_imagen = "src/PracticarEditorImagenes/Fotos/perro_grises.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_dos.setIcon(icon);
                imagen_dos.setVisible(false);
                nombre_dos.setText("perro_gris");
                imagen_seleccionada=new Imagen("perro_byn",ruta_imagen);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_dos.setVisible(true);

                    }
                });

            }
        });
    }

    private void opciones_menu() {

        item_abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int returnValue = fileChooser.showOpenDialog(null);



                    String img_origen=fileChooser.getSelectedFile().getPath();
                    ImageIcon icon = new ImageIcon(img_origen);
                    imagen_uno.setIcon(icon);
            }
        });

        item_abrir_perro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/PracticarEditorImagenes/Fotos/labrador_peq.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_uno.setIcon(icon);

            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EditorImagenPracticar");
        frame.setContentPane(new EditorImagenPracticar().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
