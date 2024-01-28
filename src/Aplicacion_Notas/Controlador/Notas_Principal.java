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
    private JLabel label_descripcion;
    private JLabel label_descripcion_dos;
    private JPanel panel_arriba;
    private JButton btn_ver_nota;

    private DefaultTableModel model;

    public static Nota nota_seleccionada =null;

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
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar la nota?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                        model.removeRow(seleccionar_fila);
                        JOptionPane.showMessageDialog(null, "Nota eliminada exitosamente.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // No hacer nada si se selecciona "No"
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
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

    public void agregarFila(String nombre, String apellido, String nota) {
        // Añade una nueva fila a la tabla con los datos proporcionados
        String[] fila = {nombre, apellido, nota};
        model.addRow(fila);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Notas_Principal");
        frame.setContentPane(new Notas_Principal().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0,800,650);

    }
}
