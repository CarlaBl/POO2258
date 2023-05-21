package org.example.DAO;

import org.example.Modelo.Libro;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Update-----");
        LibroDAO ldao = new LibroDAO();
       /* Libro libro = new Libro(1,"El perfume","Patrick Suskind");
        try{
            if (ldao.update(libro)){
                System.out.println("Se modifico correctamente");
            } else {
                System.out.println("No se pudo modificar");
            }
        }catch (SQLException sqle){
            System.out.println("Error al insertar");
        } **/
        System.out.println("-----Eliminacion----");
        /* try{
            if (ldao.delete("6")){
                System.out.println("Se elimino correctamente");
            } else {
                System.out.println("No se pudo eliminar");
            }
        }catch (SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        } **/
        System.out.println("-----BuscarPorId-----");
        try{
            Libro res =(Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("----ObtenerTodo-----");
            for (Object lib: ldao.obtenerTodo()) {
                System.out.println((Libro)lib);

            }

        }catch (SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }

    }
}
