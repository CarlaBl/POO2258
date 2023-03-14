package ComposicionCompu;

public class DriverComputadora {
    public static void main(String[] args) {
        Computadora compu1 = new Computadora();
        System.out.println(compu1);
        compu1.setMarca("HP");
        System.out.println(compu1);
        compu1.setModelo("Pavillion 10");
        System.out.println(compu1);
        compu1.setProcesador(new Cpu("Intel","i9",3.6));
        System.out.println(compu1);
        compu1.getProcesador().setVelocidad(5.1);
        System.out.println(compu1);
        compu1.setPantalla(new Monitor("HP","V22",21.5));
        System.out.println(compu1);
        compu1.getPantalla().setModelo("V24i");
        System.out.println(compu1);
        compu1.getPantalla().setPulgadas(23.8);
        System.out.println(compu1);


    }
}
