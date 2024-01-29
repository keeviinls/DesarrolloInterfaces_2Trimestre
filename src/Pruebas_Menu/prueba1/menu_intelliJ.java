package Pruebas_Menu.prueba1;

import javax.swing.*;

public class menu_intelliJ {
    private JPanel mainpanel;
    private JPanel panel_menu;
    private JPanel panel_central;
    private JMenuBar jmenubar;
    private JMenu jmenu_file;
    private JMenu jmenu_edit;
    private JMenu jmenu_view;
    private JMenu jmenu_navigate;
    private JMenu jmenu_code;
    private JMenu jmenu_refactor;
    private JMenu jmenu_build;
    private JMenu jmenu_run;
    private JMenu jmenu_tools;
    private JMenu jmenu_git;
    private JMenu jmenu_window;
    private JMenu jmenu_help;
    private JMenuItem item_new;
    private JMenuItem item_open;
    private JMenuItem item_recent;
    private JMenuItem item_close;
    private JMenuItem item_settings;
    private JMenuItem item_project_structure;
    private JMenuItem item_file_properties;
    private JMenuItem item_local_history;
    private JMenuItem item_save_all;
    private JMenuItem item_reload;
    private JMenuItem item_repair;
    private JMenuItem item_invalidate;
    private JMenuItem item_manage_ide;
    private JMenuItem item_new_projects_setup;
    private JMenuItem item_save_file;
    private JMenuItem item_export;
    private JMenuItem item_print;
    private JMenuItem item_power_save;
    private JMenuItem item_exit;

    public static void main(String[] args) {
        JFrame frame = new JFrame("menu_intelliJ");
        frame.setContentPane(new menu_intelliJ().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
