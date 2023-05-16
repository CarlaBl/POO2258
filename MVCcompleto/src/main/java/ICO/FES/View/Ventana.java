package ICO.FES.View;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JTextField txtNombre;
    private JLabel lblSaludo;
    private JButton btnBoton;

    //constructor por defecto
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,300);
        this.getContentPane().setLayout(new FlowLayout());
        txtNombre = new JTextField(12);
        lblSaludo = new JLabel("...");
        btnBoton = new JButton("Saludar");
        this.getContentPane().add(txtNombre);
        this.getContentPane().add(lblSaludo);
        this.getContentPane().add(btnBoton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //metodos de acceso
    public JTextField getTxtNombre() {
        return txtNombre;
    }
    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    public JLabel getLblSaludo() {
        return lblSaludo;
    }
    public void setLblSaludo(JLabel lblSaludo) {
        this.lblSaludo = lblSaludo;
    }
    public JButton getBtnBoton() {
        return btnBoton;
    }
    public void setBtnBoton(JButton btnBoton) {
        this.btnBoton = btnBoton;
    }
}//end

