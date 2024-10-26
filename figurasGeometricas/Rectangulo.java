package figurasGeometricas;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }
    

    public double getAncho() {
        return ancho;
    }


    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double getAlto() {
        return alto;
    }


    public void setAlto(double alto) {
        this.alto = alto;
    }


    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + calcularArea());
    }
    
}
