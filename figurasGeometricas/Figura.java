package figurasGeometricas;

public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }
    

    public double calcularArea() {
        return 0.0;
    }

    public void mostrarInfo() {
        System.out.println("Color: " + color);
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    
}
