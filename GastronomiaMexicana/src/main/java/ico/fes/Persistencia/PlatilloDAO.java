package ico.fes.Persistencia;

import ico.fes.Modelo.Platillo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlatilloDAO implements InterfazDAO{
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO platillos(nombre,region,ingredientes,tecnica,foto) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gastronomiaDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Platillo)obj).getNombre());
        pstm.setString(2,((Platillo)obj).getRegion());
        pstm.setString(3,((Platillo)obj).getIngredientes());
        pstm.setString(4,((Platillo)obj).getTecnica());
        pstm.setString(5,((Platillo)obj).getFoto());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE platillos SET nombre=?, region=?, ingredientes=?, tecnica=?, foto=? WHERE id=? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gastronomiaDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Platillo)obj).getNombre());
        pstm.setString(2,((Platillo)obj).getRegion());
        pstm.setString(3,((Platillo)obj).getIngredientes());
        pstm.setString(4,((Platillo)obj).getTecnica());
        pstm.setString(5,((Platillo)obj).getFoto());
        pstm.setInt(6,((Platillo)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete ="DELETE FROM platillos WHERE id = ? ;";
        int rowCount =0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gastronomiaDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM platillos";
        ArrayList<Platillo> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("gastronomiaDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Platillo(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sqlBuscar = "SELECT * FROM platillos WHERE id = ? ; ";
        Platillo platillo = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("gastronomiaDB.db").getConnection().prepareStatement(sqlBuscar);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            platillo = new Platillo(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6));
            return platillo;
        }
        return null;
    }
}
