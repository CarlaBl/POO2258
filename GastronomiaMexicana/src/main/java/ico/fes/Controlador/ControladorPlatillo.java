package ico.fes.Controlador;

import ico.fes.Modelo.ModeloTablaPlatillo;
import ico.fes.Modelo.Platillo;
import ico.fes.Vista.VentanaGastronomia;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorPlatillo extends MouseAdapter {
    private VentanaGastronomia view;
    private ModeloTablaPlatillo model;

    //constructor
    public ControladorPlatillo(VentanaGastronomia view) {
        this.view = view;
        //modelo tabla
        model = new ModeloTablaPlatillo();
        this.view.getTblPlatillos().setModel(model);

        //MouseListener
        this.view.getTblPlatillos().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
            System.out.println("Evento sobre boton Cargar");
            model.cargarDatos();
            this.view.getTblPlatillos().setModel(model);
            this.view.getTblPlatillos().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("Evento sobre boton Agregar");
            Platillo platillo = new Platillo();
            platillo.setId(0);
            platillo.setNombre(this.view.getTxtNombre().getText());
            platillo.setRegion(this.view.getTxtRegion().getText());
            platillo.setIngredientes(this.view.getTxtIngredientes().getText());
            platillo.setTecnica(this.view.getTxtTecnica().getText());
            platillo.setFoto(this.view.getTxtFotoURL().getText());
            if (model.agregarPlatillo(platillo)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblPlatillos().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. Por favor revise su conexion",
                        "ERROR al insertar", JOptionPane.ERROR_MESSAGE);
            }
            model.cargarDatos();
            this.view.getTblPlatillos().setModel(model);
            this.view.getTblPlatillos().updateUI();
            this.view.limpiar();
        }
        if (e.getSource() == view.getTblPlatillos()){
            System.out.println("Evento sobre Tabla");
            int index = this.view.getTblPlatillos().getSelectedRow();
            Platillo tmp = model.getPlatilloAtIndex(index);
            try {
                this.view.getLblImagen().setIcon(tmp.getImagen());
                this.view.getLblImagen().setText("");
                this.view.getTxtNombre2().setText(tmp.getNombre());
                this.view.getTxtRegion2().setText(tmp.getRegion());
                this.view.getTxtIngredientes2().setText(tmp.getIngredientes());
                this.view.getTxtTecnica2().setText(tmp.getTecnica());
                this.view.getTxtFotoURL2().setText(tmp.getFoto());

            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }
        if (e.getSource() == view.getBtnActualizar()){
            System.out.println("Evento sobre boton Actualizar");
            int row = this.view.getTblPlatillos().getSelectedRow();
            String index = String.valueOf(this.model.getValueAt(row,0));
            System.out.println(index);
            Platillo platillo = new Platillo();
            platillo.setNombre(this.view.getTxtNombre2().getText());
            platillo.setRegion(this.view.getTxtRegion2().getText());
            platillo.setIngredientes(this.view.getTxtIngredientes2().getText());
            platillo.setTecnica(this.view.getTxtTecnica2().getText());
            platillo.setFoto(this.view.getTxtFotoURL2().getText());
            platillo.setId(Integer.parseInt(index));
            if (model.actualizarPlatillo(platillo)){
                JOptionPane.showMessageDialog(view,"El registro se actualizo correctamente",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblPlatillos().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,
                        "No se pudo actualizar la base de datos. Por favor revise su conexion",
                        "ERROR al actualizar", JOptionPane.ERROR_MESSAGE);
            }
            model.cargarDatos();
            this.view.getTblPlatillos().setModel(model);
            this.view.getTblPlatillos().updateUI();
            this.view.limpiar();
        }
        if (e.getSource() == view.getBtnEliminar()){
            System.out.println("Evento sobre boton Eliminar");
            int row = this.view.getTblPlatillos().getSelectedRow();
            String index = String.valueOf(this.model.getValueAt(row,0));
            System.out.println(index);

            int respuesta = JOptionPane.showConfirmDialog(view, "Esta seguro de eliminar el registro?",
                    "Selecciona una opcion",JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_NO_OPTION){
                model.eliminarPlatillo(index);
                JOptionPane.showMessageDialog(view,"El registro fue eliminado","Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,"El objeto no fue eliminado","Error al eliminar",
                        JOptionPane.ERROR_MESSAGE);
            }
            model.cargarDatos();
            this.view.getTblPlatillos().setModel(model);
            this.view.getTblPlatillos().updateUI();
            this.view.limpiar();
        }
    }
}
