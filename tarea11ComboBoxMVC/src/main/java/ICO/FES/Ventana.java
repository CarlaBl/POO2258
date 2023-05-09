package ICO.FES;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton1;
    private JComboBox comboBox;
    private NombreModeloCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblNombre =new JLabel("Ingresa un nombre:");
        this.getContentPane().add(lblNombre);
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton1 = new JButton("Agregar");
        this.getContentPane().add(boton1);
        //configurar el modelo
        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("David");
        comboBox = new JComboBox(modelo);
        this.getContentPane().add(comboBox);
        //
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               String nuevo = txtNombre.getText();
               modelo.agregarNombre(nuevo);
               txtNombre.setText("");
            }
        });
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedIndex());
                System.out.println(comboBox.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Hola "+ comboBox.getSelectedItem());
            }
        });

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
