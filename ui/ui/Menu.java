package ui;
import java.util.Scanner;

import animales.Anfibio;
import animales.Mamifero;
import figurasGeometricas.Circulo;
import figurasGeometricas.Rectangulo;

import java.util.InputMismatchException;


public class Menu {
    
    public Menu() {

    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;    

        do {
            mostrarMenu();
            try{
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
            }
            catch(InputMismatchException e){
                System.out.println("\t***Error: Debe ingresar un número entero.***");
                scanner.nextLine(); // Consumir la nueva línea
                continue;
            }
           
            switch (opcion) {
                case 1:
                    animales(scanner);
                    break;
                case 2:
                    figurasGeometricas(scanner);
                    break;
                
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }
    private void mostrarMenu() {
        System.out.println("\n--- Menú de Herencia ---");
        System.out.println("1. Animales");
        System.out.println("2. Figuras Geométricas");
      
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void animales(Scanner scanner){
        System.out.println("Opción Herencia en Animales");
        Anfibio anfibio1 = new Anfibio();
        Anfibio anfibio2 = new Anfibio("Rana", 2, true);

        Mamifero mamifero1 = new Mamifero();
        Mamifero mamifero2 = new Mamifero("Perro", 5, 4);

        System.out.println("Anfibio 1:");
        anfibio1.hacerSonido();
        anfibio1.mostrarInfo();

        System.out.println("\nAnfibio 2:");
        anfibio2.hacerSonido();
        anfibio2.mostrarInfo();

        System.out.println("\nMamífero 1:");
        mamifero1.hacerSonido();
        mamifero1.mostrarInfo();

        System.out.println("\nMamífero 2:");
        mamifero2.hacerSonido();
        mamifero2.mostrarInfo();

    }

    private void  figurasGeometricas(Scanner scanner){
        System.out.println("Opción Herencia con Figuras Geometricas");
        Circulo circulo = new Circulo("Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println("Círculo:");
        circulo.mostrarInfo();

        System.out.println("\nRectángulo:");
        rectangulo.mostrarInfo();

    }

    
    
    
}
