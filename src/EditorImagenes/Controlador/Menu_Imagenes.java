package EditorImagenes.Controlador;

import javax.swing.*;

public class Menu_Imagenes {
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_menu;
    private JMenu jmenu_archivo;
    private JMenu jmenu_efectos;
    private JMenuItem item_abrir;
    private JMenuItem item_guardar;
    private JMenuItem item_cerrar;
    private JMenuItem item_byn;
    private JMenuItem item_grises;
    private JMenuItem item_sepia;
    private JMenuItem item_altocontraste;
    private JMenuItem item_pixelada;
    private JMenuItem item_icono;
    private JMenuItem item_bajaResolucion;
    private JPanel panel_central;
    private JPanel panel_titulo;
    private JLabel titulo;
    private JPanel panel_izq;
    private JPanel panel_drc;
    private JLabel foto_origen;
    private JLabel titulo_origen;
    private JLabel foto_destino;
    private JLabel titulo_destino;
    private JButton boton_convertir;
    private JPanel panel_abajo;
    private JPanel panel_primer_parametro;
    private JSlider slider1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu_Imagenes");
        frame.setContentPane(new Menu_Imagenes().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,750,700);

    }
}
