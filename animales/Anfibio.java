package animales;
public class Anfibio extends Animal{
    private boolean cola;

    public Anfibio() {
        super("Anfibio Desconocido", 0);
        this.cola = false;
    }

    public Anfibio(String nombre, int edad, boolean cola) {
        super(nombre, edad);
        this.cola = cola;
    }
    

    @Override
    public String hacerSonido() {
        System.out.println("El anfibio croa");
        return "El anfibio croa";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene cola: " + (cola ? "Sí" : "No"));
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
}
