package Aplicacion_Notas.Controlador;

import Aplicacion_Notas.Modelo.Nota;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public static Nota nota_seleccionada =null;
    private JLabel label_descripcion;
    private JLabel label_descripcion_dos;
    private JPanel panel_arriba;
    private JButton btn_ver_nota;
    private JButton btn_ayuda;
    private DefaultTableModel model;


    public Notas_Principal(){
        model = new DefaultTableModel();
        crear_tabla();
        configuracion_botones();
    }

    private void configuracion_botones() {
        btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Nota ventanaNota = new Ventana_Nota();
                ventanaNota.mostrarVentana(Notas_Principal.this);
            }
        });
        btn_ver_nota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int seleccionar_fila = tabla.getSelectedRow();
                String nombre = (String) tabla.getValueAt(seleccionar_fila, 0);
                String apellidos = (String) tabla.getValueAt(seleccionar_fila, 1);
                String nota = (String) tabla.getValueAt(seleccionar_fila, 2);

                nota_seleccionada = new Nota(nombre,apellidos,nota);

                ver_Nota ver_nota = new ver_Nota();
                ver_nota.mostrarVentana(Notas_Principal.this);
            }
        });

        btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int seleccionar_fila = tabla.getSelectedRow();

                if (seleccionar_fila >= 0) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar esta nota?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                        model.removeRow(seleccionar_fila);
                        JOptionPane.showMessageDialog(null, "Nota eliminada correctamente.", "Eliminación correcta", JOptionPane.INFORMATION_MESSAGE);
                    } else {

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btn_modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int seleccionar_fila = tabla.getSelectedRow();

                if (seleccionar_fila >= 0){
                    String nombre = (String) tabla.getValueAt(seleccionar_fila, 0);
                    String apellidos = (String) tabla.getValueAt(seleccionar_fila, 1);
                    String nota = (String) tabla.getValueAt(seleccionar_fila, 2);

                    ventana_modificar vent_modificar = new ventana_modificar();
                    vent_modificar.mostrarVentana(Notas_Principal.this, nombre, apellidos, nota);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para modificar.", "Ayuda", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        btn_ayuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este programa esta diseñado para almacenar notas que los usuarios vayan creando, para comenzar a crear una deberán pulsar el boton Crear", "Ayuda", JOptionPane.PLAIN_MESSAGE);

            }
        });

        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int seleccionar_fila = tabla.getSelectedRow();
                if (seleccionar_fila >= 0){
                    btn_modificar.setEnabled(true);
                    btn_eliminar.setEnabled(true);
                    btn_ver_nota.setEnabled(true);
                }
                else {
                    btn_modificar.setEnabled(false);
                    btn_eliminar.setEnabled(false);
                    btn_ver_nota.setEnabled(false);
                }
            }
        });
    }

    private void crear_tabla() {
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Nota");
        tabla.setModel(model);
    }
    public JTable getTable() {
        return tabla;
    }
    public void agregarFila(String nombre, String apellido, String nota) {
        String[] fila = {nombre, apellido, nota};
        model.addRow(fila);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Notas_Principal");
        frame.setContentPane(new Notas_Principal().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,750,700);

    }
}
