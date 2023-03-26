package ComposicionLampara;

import java.awt.*;

public class DriverLampara {
    public static void main(String[] args) {
        Foco[] tmpFocos = new Foco[Lampara.NUM_LAMPS];
        for (int i = 0; i < Lampara.NUM_LAMPS; i++) {
            tmpFocos[i] = new Foco(1.2,0.02, Color.WHITE,false);
        }
        Cable[] tmpcables = new Cable[4];
        for (int i = 0; i < 4; i++) {
            tmpcables[i] = new Cable(12.2,Color.RED,1.3);
        }
        //crear objeto de la clase lampara
        Lampara lampara1 = new Lampara("Lumen",1.2,0.6,0.15,
                new Marco("Plastico",1.25, 0.7),
                tmpFocos,
                tmpcables
        );
        //lampara inicial
        System.out.println(lampara1);
        //encendiendo lampara
        lampara1.iluminar();
        System.out.println(lampara1);
        //cambiar color de los focos de la lampara
        lampara1.getFocos()[0].setColor(Color.blue);
        lampara1.getFocos()[1].setColor(Color.blue);
        lampara1.getFocos()[2].setColor(Color.blue);
        System.out.println(lampara1);
        //cambiar marca de la lampara
        lampara1.setMarca("Phillips");
        System.out.println(lampara1);
        //cambiar material del marco de la lampara
        lampara1.getMarco().setMaterial("Lámina");
        System.out.println(lampara1);

    }
}
