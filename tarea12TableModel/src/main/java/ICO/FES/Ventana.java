package ICO.FES;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAdd;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);
        //panel1
        panel1 =new JPanel(new FlowLayout());
        panel1.setBackground(new Color(136,232, 149));
        lblId = new JLabel("Id: ");
        txtId = new JTextField(3);
        panel1.add(lblId);
        panel1.add(txtId);
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(25);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(20);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        lblPeso = new JLabel("Peso: ");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(10);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        lblDesarrollador = new JLabel("Desarrollador: ");
        txtDesarrollador = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);
        btnAdd = new JButton("Agregar Juego");
        panel1.add(btnAdd);
        this.getContentPane().add(panel1,0);
        //panel2
        panel2 =new JPanel(new FlowLayout());
        panel2.setBackground(new Color(136,232, 232));
        info = new ArrayList<>();
        info.add(new Videojuego(1,"league of Legend",
                "MOBA",4.5,"Windows y Mac",
                "Riot games"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);
        this.getContentPane().add(panel2,1);
        this.btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego juego = new Videojuego();
                juego.setId(Integer.parseInt(txtId.getText()));
                juego.setNombre(txtNombre.getText());
                juego.setGenero(txtGenero.getText());
                juego.setPesoEnGb(Double.parseDouble(txtPeso.getText()));
                juego.setPlataforma(txtPlataforma.getText());
                juego.setDesarrollador(txtDesarrollador.getText());
                //info.add(juego);
                modelo.addJuego(juego);
                tblTabla.updateUI();
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //sea visible
        this.setVisible(true);
    }
}
