package Aplicacion_Notas.Controlador;

import javax.swing.*;

public class Notas_Principal {
    private JPanel panel_titulo;
    private JPanel panel_tabla;
    private JTable tabla;
    private JScrollPane jscrollpane;
    private JLabel label_titulo;
    private JPanel panel_botones;
    private JButton btn_modificar;
    private JButton btn_eliminar;
    private JPanel mainpanel;
    private JLabel label_foto;
    private JButton btn_crear;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notas_Principal");
        frame.setContentPane(new Notas_Principal().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
