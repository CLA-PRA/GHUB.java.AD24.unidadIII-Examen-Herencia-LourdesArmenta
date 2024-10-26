package figurasGeometricas;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
