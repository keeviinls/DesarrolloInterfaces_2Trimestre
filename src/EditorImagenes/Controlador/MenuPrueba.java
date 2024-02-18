package EditorImagenes.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrueba {
    private JPanel mainpanel;
    private JPanel panel_menu;
    private JPanel panel_medio;
    private JPanel panel_foto_grande;
    private JPanel panel_barra;
    private JLabel imagen_final;
    private JMenu jmenu_archivo;
    private JMenuItem item_abrir;
    private JMenuItem item_guardar;
    private JMenuItem item_cerrar;
    private JMenu jmenu_efectos;
    private JMenuItem item_byn;
    private JMenuItem item_grises;
    private JMenuItem item_sepia;
    private JMenuItem item_altocontraste;
    private JMenuItem item_pixelada;
    private JMenuItem item_icono;
    private JMenuItem item_bajaResolucion;
    private JPanel panel_izq;
    private JPanel panel_imagen_uno;
    private JPanel panel_texto_imagen_uno;
    private JLabel nombre_imagen_uno;
    private JLabel imagen_uno;
    private JLabel nombre_imagen_final;
    private JButton boton_convertir;
    private JPanel panel_imagen_final;
    private JPanel panel_primer_parametro;
    private JSlider slider1;
    private JPanel panel_segundo_parametro;
    private JPanel panel_tercer_parametro;
    private JPanel panel_cuarto_parametro;
    private JPanel panel_quinto_parametro;
    private JPanel panel_sexto_parametro;
    private JPanel panel_septimo_parametro;

    public MenuPrueba(){

        opciones_menu();
        opciones_efectos();



    }

    private void opciones_efectos() {


        item_byn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_byn.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);
                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(false);
                panel_tercer_parametro.setVisible(false);
                panel_cuarto_parametro.setVisible(false);
                panel_quinto_parametro.setVisible(false);
                panel_sexto_parametro.setVisible(false);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en Blanco y Negro");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);


                    }
                });
            }
        });

        item_grises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_grises.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);
                imagen_final.setVisible(true);
                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(false);
                panel_cuarto_parametro.setVisible(false);
                panel_quinto_parametro.setVisible(false);
                panel_sexto_parametro.setVisible(false);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en gris");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
        });

        item_sepia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_sepia.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);

                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(true);
                panel_cuarto_parametro.setVisible(false);
                panel_quinto_parametro.setVisible(false);
                panel_sexto_parametro.setVisible(false);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en Sepia");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);

                    }
                });
            }
        });

        item_altocontraste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_altocontraste.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);

                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(true);
                panel_cuarto_parametro.setVisible(true);
                panel_quinto_parametro.setVisible(false);
                panel_sexto_parametro.setVisible(false);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en Alto Contraste");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);
                    }
                });
            }
        });

        item_pixelada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_pixelado.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);
                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(true);
                panel_cuarto_parametro.setVisible(true);
                panel_quinto_parametro.setVisible(true);
                panel_sexto_parametro.setVisible(false);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en Alto Contraste");


                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);
                    }
                });
            }
        });

        item_icono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_icono.ico";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);

                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(true);
                panel_cuarto_parametro.setVisible(true);
                panel_quinto_parametro.setVisible(true);
                panel_sexto_parametro.setVisible(true);
                panel_septimo_parametro.setVisible(false);
                nombre_imagen_final.setText("Perro en Alto Contraste");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);

                    }
                });
            }
        });

        item_bajaResolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_imagen = "src/EditorImagenes/Fotos/perro_bajaresolucion.jpg";
                ImageIcon icon = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icon);
                imagen_final.setVisible(false);

                panel_primer_parametro.setVisible(true);
                panel_segundo_parametro.setVisible(true);
                panel_tercer_parametro.setVisible(true);
                panel_cuarto_parametro.setVisible(true);
                panel_quinto_parametro.setVisible(true);
                panel_sexto_parametro.setVisible(true);
                panel_septimo_parametro.setVisible(true);
                nombre_imagen_final.setText("Perro en Alto Contraste");

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        imagen_final.setVisible(true);
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

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Archivo seleccionado: " + fileChooser.getSelectedFile().getAbsolutePath());
                }

                String path_img_origen=fileChooser.getSelectedFile().getPath();
                ImageIcon icon = new ImageIcon(path_img_origen);
                imagen_uno.setIcon(icon);

                String ruta_imagen = "src/EditorImagenes/Fotos/perro_grande.jpg";
                ImageIcon icono = new ImageIcon(ruta_imagen);
                imagen_final.setIcon(icono);

            }
        });

        item_cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrueba");
        frame.setContentPane(new MenuPrueba().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(0,0,1200,800);
        frame.setVisible(true);
    }
}
