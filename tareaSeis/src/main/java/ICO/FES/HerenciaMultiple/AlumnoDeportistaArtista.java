package ICO.FES.HerenciaMultiple;

import java.security.PrivateKey;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private  int idActividadExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int idActividadExtra, String deporte, String arte) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.idActividadExtra = idActividadExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadExtra() {
        return idActividadExtra;
    }

    public void setIdActividadExtra(int idActividadExtra) {
        this.idActividadExtra = idActividadExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActividadExtra=" + idActividadExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando "+this.arte+ disciplina);
        return 0;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre()+" esta presentando su obra...");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+ " esta entrenando el deporte "+ this.deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre()+ " esta en una competencia del deporte "+ this.deporte+" en "+ ubicacion);
        return true;
    }
}
