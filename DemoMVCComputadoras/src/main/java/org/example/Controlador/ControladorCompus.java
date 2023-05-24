package org.example.Controlador;

import org.example.Modelo.Computadora;
import org.example.Modelo.ModeloTablaComputadora;
import org.example.Vista.VentanaCompu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorCompus extends MouseAdapter {
    private VentanaCompu view;
    private ModeloTablaComputadora modelo;
    public ControladorCompus(VentanaCompu view) {
        this.view = view;
        this.view.getBtnAdd().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        modelo = new ModeloTablaComputadora();
        this.view.getTabla().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnAdd()){
            System.out.println("Evento sobre boton");
            Computadora compu = new Computadora();
            compu.setMarca(this.view.getTxtMarca().getText());
            compu.setModelo(this.view.getTxtModelo().getText());
            compu.setFrecuenciaProcesador(Double.parseDouble(this.view.getTxtFrecuencia().getText()));
            compu.setUrl(this.view.getTxtFoto().getText());
            modelo.agregarCompu(compu);
            this.view.getTabla().updateUI();
        }
        this.view.limpiar();

        if (e.getSource() == view.getTabla()){
            System.out.println("Evento sobre Tabla");
            int index = this.view.getTabla().getSelectedRow();
            Computadora tmp = modelo.getCompuAtIndex(index);
            try {
                this.view.getImagenCompu().setIcon(tmp.getImagen());
                this.view.getImagenCompu().setText("");

            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }

    }
}
