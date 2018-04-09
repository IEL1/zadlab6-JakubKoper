package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    
    public static double PoleKwadratu(double a){
        return Math.pow(a,2);
    }
    public static double ObwodKwadratu(double a){
        return 4*a;
    }
    
    public static double PoleProstokąta(double a, double b){
        return a*b;
    }
    public static double ObwodProstokąta(double a, double b){
        return a+a+b+b;
    }
    public static double PolePodstawyStożka(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double PolePowierzchniBocznej(double r, double l){
        return Math.PI*r*l;
    }
    public static double PolePowierzchniCałkowitej(double r, double l){
        return Math.PI*Math.pow(r,2) + Math.PI*r*l;
    }
    public static double ObjętośćStożka(double r, double h){
        return (Math.PI*Math.pow(r,2)*h)/3;
    }
    public static double PolePodstawyWalca(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double PolePowierzchniBocznejWalca(double r, double h){
        return h*2*Math.PI*r;
    }
    public static double PolePowierzchniCałkowitejWalca(double r, double h){
        return 2*Math.PI*Math.pow(r,2) + h*2*Math.PI*r;
    }
    public static double ObjętośćWalca(double r, double h){
        return Math.PI*Math.pow(r,2)*h;
    }
    
}
