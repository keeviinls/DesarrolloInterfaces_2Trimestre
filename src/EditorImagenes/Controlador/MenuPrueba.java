package EditorImagenes.Controlador;

import javax.swing.*;

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


    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrueba");
        frame.setContentPane(new MenuPrueba().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}