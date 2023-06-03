package ico.fes;

import ico.fes.Controlador.ControladorPlatillo;
import ico.fes.Modelo.Platillo;
import ico.fes.Persistencia.PlatilloDAO;
import ico.fes.Vista.VentanaGastronomia;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaGastronomia view = new VentanaGastronomia("Gastronomia Mexicana");
        ControladorPlatillo controller = new ControladorPlatillo(view);

    }
}
