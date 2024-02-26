package PracticarExamen.PruebaMultitioma.ControladorMultiidoma;

import PracticarExamen.PruebaMultitioma.ModeloMulitiidoma.Usuario;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class MultiIdioma {
    private JPanel mainpanel;
    private JPanel panel_arriba;
    private JPanel panel_medio;
    private JPanel panel_bajo;
    private JLabel label_titulo;
    private JTable tabla;

    public static Usuario usuario_seleccionado = null;
    private JButton boton_ver_usuario;
    private JButton boton_crear;

    private DefaultTableModel model;

    public MultiIdioma(){
        model = new DefaultTableModel();
        crear_tabla();
        configuracion_botones();


    }

    private void configuracion_botones() {
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Multiidoma_CrearUsuario multiidoma_crearUsuario = new Multiidoma_CrearUsuario();
                multiidoma_crearUsuario.mostrarVentana(MultiIdioma.this);
            }
        });

        boton_ver_usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int seleccionar_fila = tabla.getSelectedRow();
                String nombre = (String) tabla.getValueAt(seleccionar_fila,0);
                String correo = (String) tabla.getValueAt(seleccionar_fila,1);

                usuario_seleccionado = new Usuario(nombre,correo);


                MultiIdioma_VerUsuario multiIdioma_verUsuario = new MultiIdioma_VerUsuario();
                multiIdioma_verUsuario.mostrarVentana(MultiIdioma.this);
            }
        });

        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int seleccionar_fila = tabla.getSelectedRow();

                if (seleccionar_fila>=0){
                    boton_ver_usuario.setEnabled(true);
                }
                else {
                    boton_ver_usuario.setEnabled(false);
                }

            }
        });
    }

    private void crear_tabla() {
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        model.addColumn(ResourceBundle.getBundle("Text").getString("label_nombre"));
        model.addColumn(ResourceBundle.getBundle("Text").getString("label_correo"));

        tabla.setModel(model);

    }

    public void agregarFila(String nombre, String correo){
        String[] fila = {nombre,correo};
        model.addRow(fila);
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("MultiIdioma");
        frame.setContentPane(new MultiIdioma().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
