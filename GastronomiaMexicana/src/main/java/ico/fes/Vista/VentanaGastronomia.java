package ico.fes.Vista;

import javax.swing.*;
import java.awt.*;
import java.security.PrivateKey;

public class VentanaGastronomia extends JFrame {
    //Formulario1
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblRegion;
    private JLabel lblIngredientes;
    private JLabel lblTecnica;
    private JLabel lblFotoURL;
    private JLabel lblImagen;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtRegion;
    private JTextField txtIngredientes;
    private JTextField txtTecnica;
    private JTextField txtFotoURL;
    //Formulario2
    private JLabel lblId2;
    private JLabel lblNombre2;
    private JLabel lblRegion2;
    private JLabel lblIngredientes2;
    private JLabel lblTecnica2;
    private JLabel lblFotoURL2;
    private JLabel lblAviso;
    private JTextField txtId2;
    private JTextField txtNombre2;
    private JTextField txtRegion2;
    private JTextField txtIngredientes2;
    private JTextField txtTecnica2;
    private JTextField txtFotoURL2;
    //Botones
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    //Tabla
    private JTable tblPlatillos;
    private JScrollPane scroll;
    private GridLayout layout;
    //Paneles
    private JPanel panel1; //formulario para agregar
    private JPanel panel2; //tabla muestra la DB
    private JPanel panel3; // imagenURl
    private JPanel panel4; //eliminacion y actualizacion de campos

    public VentanaGastronomia(String title) throws HeadlessException {
        super(title);
        this.setSize(950,700);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(188, 152, 243));
        lblId = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblRegion = new JLabel("Region:");
        lblIngredientes = new JLabel("Ingredientes:");
        lblTecnica = new JLabel("Tecnica:");
        lblFotoURL = new JLabel("Foto(url):");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(12);
        txtRegion = new JTextField(12);
        txtIngredientes = new JTextField(40);
        txtTecnica = new JTextField(15);
        txtFotoURL = new JTextField(35);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblRegion);
        panel1.add(txtRegion);
        panel1.add(lblIngredientes);
        panel1.add(txtIngredientes);
        panel1.add(lblTecnica);
        panel1.add(txtTecnica);
        panel1.add(lblFotoURL);
        panel1.add(txtFotoURL);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(211, 188, 246));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblPlatillos = new JTable();
        scroll = new JScrollPane(tblPlatillos);
        panel2.add(scroll);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(169, 212, 246));
        lblImagen =new JLabel("...");
        panel3.add(lblImagen);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(186, 224, 245));
        lblAviso = new JLabel("De la tabla que se muetra arriba, seleccione la fila que desea actualizar o eliminar  ");
        lblId2 = new JLabel("Id:");
        lblNombre2 = new JLabel("Nombre:");
        lblRegion2 = new JLabel("Region:");
        lblIngredientes2 = new JLabel("Ingredientes:");
        lblTecnica2 = new JLabel("Tecnica:");
        lblFotoURL2 = new JLabel("Foto(url):");
        txtId2 = new JTextField(3);
        txtId2.setText("0");
        txtId2.setEnabled(false);
        txtNombre2 = new JTextField(12);
        txtRegion2 = new JTextField(12);
        txtIngredientes2 = new JTextField(40);
        txtTecnica2 = new JTextField(15);
        txtFotoURL2 = new JTextField(35);
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        panel4.add(lblAviso);
        panel4.add(lblId2);
        panel4.add(txtId2);
        panel4.add(lblNombre2);
        panel4.add(txtNombre2);
        panel4.add(lblRegion2);
        panel4.add(txtRegion2);
        panel4.add(lblIngredientes2);
        panel4.add(txtIngredientes2);
        panel4.add(lblTecnica2);
        panel4.add(txtTecnica2);
        panel4.add(lblFotoURL2);
        panel4.add(txtFotoURL2);
        panel4.add(btnActualizar);
        panel4.add(btnEliminar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //metodos de acceso
    public JLabel getLblId() {
        return lblId;
    }
    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }
    public JLabel getLblNombre() {
        return lblNombre;
    }
    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }
    public JLabel getLblRegion() {
        return lblRegion;
    }
    public void setLblRegion(JLabel lblRegion) {
        this.lblRegion = lblRegion;
    }
    public JLabel getLblIngredientes() {
        return lblIngredientes;
    }
    public void setLblIngredientes(JLabel lblIngredientes) {
        this.lblIngredientes = lblIngredientes;
    }
    public JLabel getLblTecnica() {
        return lblTecnica;
    }
    public void setLblTecnica(JLabel lblTecnica) {
        this.lblTecnica = lblTecnica;
    }
    public JLabel getLblFotoURL() {
        return lblFotoURL;
    }
    public void setLblFotoURL(JLabel lblFotoURL) {
        this.lblFotoURL = lblFotoURL;
    }
    public JLabel getLblImagen() {
        return lblImagen;
    }
    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }
    public JTextField getTxtId() {
        return txtId;
    }
    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }
    public JTextField getTxtNombre() {
        return txtNombre;
    }
    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    public JTextField getTxtRegion() {
        return txtRegion;
    }
    public void setTxtRegion(JTextField txtRegion) {
        this.txtRegion = txtRegion;
    }
    public JTextField getTxtIngredientes() {
        return txtIngredientes;
    }
    public void setTxtIngredientes(JTextField txtIngredientes) {
        this.txtIngredientes = txtIngredientes;
    }
    public JTextField getTxtTecnica() {
        return txtTecnica;
    }
    public void setTxtTecnica(JTextField txtTecnica) {
        this.txtTecnica = txtTecnica;
    }
    public JTextField getTxtFotoURL() {
        return txtFotoURL;
    }
    public void setTxtFotoURL(JTextField txtFotoURL) {
        this.txtFotoURL = txtFotoURL;
    }
    public JLabel getLblId2() {
        return lblId2;
    }
    public void setLblId2(JLabel lblId2) {
        this.lblId2 = lblId2;
    }
    public JLabel getLblNombre2() {
        return lblNombre2;
    }
    public void setLblNombre2(JLabel lblNombre2) {
        this.lblNombre2 = lblNombre2;
    }
    public JLabel getLblRegion2() {
        return lblRegion2;
    }
    public void setLblRegion2(JLabel lblRegion2) {
        this.lblRegion2 = lblRegion2;
    }
    public JLabel getLblIngredientes2() {
        return lblIngredientes2;
    }
    public void setLblIngredientes2(JLabel lblIngredientes2) {
        this.lblIngredientes2 = lblIngredientes2;
    }
    public JLabel getLblTecnica2() {
        return lblTecnica2;
    }
    public void setLblTecnica2(JLabel lblTecnica2) {
        this.lblTecnica2 = lblTecnica2;
    }
    public JLabel getLblFotoURL2() {
        return lblFotoURL2;
    }
    public void setLblFotoURL2(JLabel lblFotoURL2) {
        this.lblFotoURL2 = lblFotoURL2;
    }
    public JLabel getLblAviso() {
        return lblAviso;
    }
    public void setLblAviso(JLabel lblAviso) {
        this.lblAviso = lblAviso;
    }
    public JTextField getTxtId2() {
        return txtId2;
    }
    public void setTxtId2(JTextField txtId2) {
        this.txtId2 = txtId2;
    }
    public JTextField getTxtNombre2() {
        return txtNombre2;
    }
    public void setTxtNombre2(JTextField txtNombre2) {
        this.txtNombre2 = txtNombre2;
    }
    public JTextField getTxtRegion2() {
        return txtRegion2;
    }
    public void setTxtRegion2(JTextField txtRegion2) {
        this.txtRegion2 = txtRegion2;
    }
    public JTextField getTxtIngredientes2() {
        return txtIngredientes2;
    }
    public void setTxtIngredientes2(JTextField txtIngredientes2) {
        this.txtIngredientes2 = txtIngredientes2;
    }
    public JTextField getTxtTecnica2() {
        return txtTecnica2;
    }
    public void setTxtTecnica2(JTextField txtTecnica2) {
        this.txtTecnica2 = txtTecnica2;
    }
    public JTextField getTxtFotoURL2() {
        return txtFotoURL2;
    }
    public void setTxtFotoURL2(JTextField txtFotoURL2) {
        this.txtFotoURL2 = txtFotoURL2;
    }
    public JButton getBtnAgregar() {
        return btnAgregar;
    }
    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }
    public JButton getBtnCargar() {
        return btnCargar;
    }
    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public JButton getBtnEliminar() {
        return btnEliminar;
    }
    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }
    public JButton getBtnActualizar() {
        return btnActualizar;
    }
    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }
    public JTable getTblPlatillos() {
        return tblPlatillos;
    }
    public void setTblPlatillos(JTable tblPlatillos) {
        this.tblPlatillos = tblPlatillos;
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

    //metodos de uso general
    public void limpiar(){
        txtNombre.setText("");
        txtRegion.setText("");
        txtIngredientes.setText("");
        txtTecnica.setText("");
        txtFotoURL.setText("");

        txtNombre2.setText("");
        txtRegion2.setText("");
        txtIngredientes2.setText("");
        txtTecnica2.setText("");
        txtFotoURL2.setText("");

    }
}
