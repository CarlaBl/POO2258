package ICO.FES;

public class DriverMaquinaDeCafe {
    public static void main(String[] args) {
         MaquinaDeCafe cafetera = new MaquinaDeCafe();
        System.out.println(cafetera);
        boolean hayRecursos = true;
         while (hayRecursos){
             cafetera.prepararAmericano();
             cafetera.prepararExpreso();
             cafetera.prepararCapuchino();
             cafetera.recursos();
             hayRecursos = (cafetera.getAgua()>=100 && cafetera.getCafe()>=15 && cafetera.getCrema()>=70 && cafetera.getVasos()>=1);
         }
        System.out.println("Recursos insuficientes para servir cafe");

    }// end main
}//end class