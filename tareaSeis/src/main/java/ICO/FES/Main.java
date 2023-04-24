package ICO.FES;

import ICO.FES.HerenciaMultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadro = new Cuadrado();
        cuadro.setLado(5);
        System.out.println("El area del cuadrado es : "+cuadro.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("El area del circulo es : "+circulo.calcularArea());

        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Diego");
        ada.setArte("pintura");
        ada.setDeporte("futbol");
        System.out.println(ada);
        ada.ensayar(" oleo");
        ada.entrenar();
        ada.presentarCompetencia("Nezahualcoyotl");
        System.out.println(ada);


    }
}