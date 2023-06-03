package ico.fes.Modelo;

import ico.fes.Persistencia.PlatilloDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaPlatillo implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Platillo> datos;
    private PlatilloDAO pdao;

    public ModeloTablaPlatillo() {
        pdao = new PlatilloDAO();
        datos = new ArrayList<>();
    }
    public ModeloTablaPlatillo(ArrayList<Platillo> datos) {
        this.datos = datos;
        pdao = new PlatilloDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }
    @Override
    public int getColumnCount() {
        return COLUMNS;
    }
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Region";
            case 3:
                return "Ingredientes";
            case 4:
                return "Tecnica";
            case 5:
                return "Foto";

        }
        return null;
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Platillo tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getRegion();
            case 3:
                return tmp.getIngredientes();
            case 4:
                return tmp.getTecnica();
            case 5:
                return tmp.getFoto();

        }
        return null;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                // datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setRegion((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setIngredientes((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setTecnica((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setFoto((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }


    }
    @Override
    public void addTableModelListener(TableModelListener l) {

    }
    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try{
            datos = pdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public boolean agregarPlatillo(Platillo platillo){
        boolean resultado = false;
        try{
            if (pdao.insertar(platillo)){
                datos.add(platillo);
                resultado =  true;
            }else{
                resultado = false;
            }
        } catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean eliminarPlatillo(String index){
        boolean resultado = false;
        try {
            if (pdao.delete(index)){
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean actualizarPlatillo(Platillo platillo){
        boolean resultado = false;
        try {
            if (pdao.update(platillo)){
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Platillo getPlatilloAtIndex (int idx){
        return datos.get(idx);
    }
}
