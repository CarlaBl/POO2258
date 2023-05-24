package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaCompu extends JFrame {
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblFrecuencia;
    private JLabel lblFoto;
    private JLabel imagenCompu;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtFrecuencia;
    private JTextField txtFoto;
    private JButton btnAdd;
    private JTable tabla;
    private JScrollPane scroll;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public VentanaCompu(String title) throws HeadlessException {
        super(title);
        this.setSize(850,600);
        layout =  new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(220, 71, 231));
        lblMarca = new JLabel("Marca: ");
        lblModelo = new JLabel("Modelo: ");
        lblFrecuencia= new JLabel("Frecuencia: ");
        lblFoto = new JLabel("Foto(url):");
        txtMarca = new JTextField(10);
        txtModelo = new JTextField(10);
        txtFrecuencia = new JTextField(5);
        txtFoto = new JTextField(30);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);
        panel1.add(lblFoto);
        panel1.add(txtFoto);
        btnAdd = new JButton("Agregar");
        panel1.add(btnAdd);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(167, 71, 231));
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(100, 71, 231));
        imagenCompu = new JLabel("...");
        panel3.add(imagenCompu);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(71, 170, 231));

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //metodos acceso

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblFrecuencia() {
        return lblFrecuencia;
    }

    public void setLblFrecuencia(JLabel lblFrecuencia) {
        this.lblFrecuencia = lblFrecuencia;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getImagenCompu() {
        return imagenCompu;
    }

    public void setImagenCompu(JLabel imagenCompu) {
        this.imagenCompu = imagenCompu;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtFrecuencia() {
        return txtFrecuencia;
    }

    public void setTxtFrecuencia(JTextField txtFrecuencia) {
        this.txtFrecuencia = txtFrecuencia;
    }

    public JTextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(JTextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtMarca.setText("");
        txtModelo.setText("");
        txtFrecuencia.setText("");
        txtFoto.setText("");

    }
}

