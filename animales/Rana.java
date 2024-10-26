package animales;

public class Rana extends Anfibio{
    private boolean esVenenoza;

    public Rana() {
        super("Rana Desconocida", 0, false);
        this.esVenenoza = false;
    }

    public Rana(String nombre, int edad, boolean cola, boolean esVenenoza) {
        super(nombre, edad, cola);
        this.esVenenoza = esVenenoza;
    }
    

    @Override
    public String hacerSonido() {
        System.out.println("La rana croa");
        return "La rana croa";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es venenosa: " + (esVenenoza ? "Sí" : "No"));
    }

    public boolean getEsVenenoza() {
        return esVenenoza;
    }

    public void setEsVenenoza(boolean esVenenoza) {
        this.esVenenoza = esVenenoza;
    }
    
}
