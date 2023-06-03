package org.example.Modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaComputadora implements TableModel {
    private ArrayList<Computadora> datos;
    public static final int COLS = 4;

    public ModeloTablaComputadora() {
        datos = new ArrayList<>();
    }

    public ModeloTablaComputadora(ArrayList<Computadora> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex){
            case 0:
                columnName = "Marca";
                break;
            case 1:
                columnName = "Modelo";
                break;
            case 2:
                columnName = "FrecuProcesador";
                break;
            case 3:
                columnName = "Foto";
                break;
            default:
                columnName = "";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
               return Double.class;
            case 3:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Computadora tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getMarca();
            case 1:
                return tmp.getModelo();
            case 2:
                return tmp.getFrecuenciaProcesador();
            case 3:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setMarca((String) aValue);
                break;
            case 1:
                datos.get(rowIndex).setModelo((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setFrecuenciaProcesador((Double) aValue);
                break;
            case 3:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarCompu(Computadora compu){
        datos.add(compu);
    }
    public Computadora getCompuAtIndex (int idx){
        return datos.get(idx);
    }
}
