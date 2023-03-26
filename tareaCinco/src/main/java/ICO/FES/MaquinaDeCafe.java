package ICO.FES;

public class MaquinaDeCafe {
    private int agua; //ml
    private int cafe; //gr
    private int crema; //ml
    private int vasos; //50

    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public MaquinaDeCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if(agua>=0 && agua<=5000){
        this.agua = agua;
        }else{
            System.out.println("Este valor no es permitido");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if(cafe>=0 && cafe<=1000){
            this.cafe = cafe;
        }else{
            System.out.println("Este valor no es permitido");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if(crema>=0 && crema<=1500){
            this.crema = crema;
        }else{
            System.out.println("Este valor no es permitido");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void prepararAmericano(){
        if (this.agua>=180 && this.cafe>=15 && this.vasos>=1) {
            this.agua -=180;
            this.cafe -=15;
            this.vasos --;
            System.out.println("Sirviendo cafe americano...");
        } else {
            System.out.println("No se puede servir mas cafe americano");
        }
    }
    public void prepararExpreso(){
        if (this.agua>=120 && this.cafe>=20 && this.vasos>=1) {
            this.agua -=120;
            this.cafe -=20;
            this.vasos --;
            System.out.println("Sirviendo cafe expreso...");
        } else {
            System.out.println("No se puede servir mas cafe expreso");
        }
    }
    public void prepararCapuchino(){
        if (this.agua>=100 && this.cafe>=14 && this.crema>=70 && this.vasos>=1) {
            this.agua -=180;
            this.cafe -=14;
            this.crema-=70;
            this.vasos --;
            System.out.println("Sirviendo cafe capuchino...");
        } else {
            System.out.println("No se puede servir mas cafe capuchino");
        }
    }
    public void recursos(){
        System.out.println("Cantidad de recursos actuales: ");
        System.out.println("Cantidad de agua: "+ this.agua+" ml");
        System.out.println("Cantidad de cafe: "+ this.cafe+" g");
        System.out.println("Cantidad de crema: "+ this.crema+" ml");
        System.out.println("Cantidad de vasos: "+ this.vasos);
    }

}//end class
