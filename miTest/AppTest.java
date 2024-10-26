package miTest;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import animales.*;
import figurasGeometricas.*;

class AppTest {
    @Test 
    void herenciaAnimales() {
        // Prueba de creación de un objeto Anfibio y verificación de atributos predeterminados
        Anfibio anfibio = new Anfibio();
        assertEquals("Anfibio Desconocido", anfibio.getNombre());
        assertEquals(0, anfibio.getEdad());
        assertFalse(anfibio.isCola());

        // Prueba de creación de un objeto Mamifero y verificación de atributos predeterminados
        Mamifero mamifero = new Mamifero();
        assertEquals("Mamífero Desconocido", mamifero.getNombre());
        assertEquals(0, mamifero.getEdad());
        assertEquals(4, mamifero.getNumeroPatas());

        // Prueba de sobrescritura del método hacerSonido() en Rana
        Rana rana = new Rana();
        assertEquals("La rana croa", rana.hacerSonido());

        // Prueba de sobrescritura del método mostrarInfo() en Rana
        rana.mostrarInfo();
        // Verificar la salida esperada en la consola

        // Prueba de creación de un objeto Rana con parámetros y verificación de atributos
        Rana ranaConParametros = new Rana("Rana Verde", 2, false, true);
        assertEquals("Rana Verde", ranaConParametros.getNombre());
        assertEquals(2, ranaConParametros.getEdad());
        assertFalse(ranaConParametros.isCola());
        assertTrue(ranaConParametros.getEsVenenoza());
    }

    @Test
    void herenciaFiguras() {
        // Prueba de creación de un objeto Circulo y cálculo del área
        Circulo circulo = new Circulo("Rojo", 5.0);
        assertEquals("Rojo", circulo.getColor());
        assertEquals(5.0, circulo.getRadio());
        assertEquals(Math.PI * 25, circulo.calcularArea());

        // Prueba de creación de un objeto Rectangulo y cálculo del área
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);
        assertEquals("Azul", rectangulo.getColor());
        assertEquals(4.0, rectangulo.getAncho());
        assertEquals(6.0, rectangulo.getAlto());
        assertEquals(24.0, rectangulo.calcularArea());

        // Prueba de sobrescritura del método mostrarInfo() en Circulo
        circulo.mostrarInfo();
        // Verificar la salida esperada en la consola

        // Prueba de sobrescritura del método mostrarInfo() en Rectangulo
        rectangulo.mostrarInfo();
        // Verificar la salida esperada en la consola

        // Prueba de creación de un objeto Figura y verificación de atributos
        Figura figura = new Figura("Verde");
        assertEquals("Verde", figura.getColor());
        assertEquals(0.0, figura.calcularArea());
    }

    @Test
    void polimorfismoFiguras() {
        // Crear una instancia de Circulo usando el tipo Figura
        Figura figuraCirculo = new Circulo("Verde", 3.0);

        // Verificar que el método calcularArea() de Circulo se llama correctamente
        assertEquals(Math.PI * 9, figuraCirculo.calcularArea());

        // Verificar que el método mostrarInfo() de Circulo se llama correctamente
        figuraCirculo.mostrarInfo();
        // Debería imprimir:
        // Color: Verde
        // Radio: 3.0
        // Área: 28.274333882308138

        // Crear una instancia de Rectangulo usando el tipo Figura
        Figura figuraRectangulo = new Rectangulo("Amarillo", 2.0, 5.0);

        // Verificar que el método calcularArea() de Rectangulo se llama correctamente
        assertEquals(10.0, figuraRectangulo.calcularArea());

        // Verificar que el método mostrarInfo() de Rectangulo se llama correctamente
        figuraRectangulo.mostrarInfo();
        // Debería imprimir:
        // Color: Amarillo
        // Ancho: 2.0
        // Alto: 5.0
        // Área: 10.0
    }
    @Test
    void testPolimorfismoYUsoDeSuper() {
        // Crear una instancia de Rana usando el tipo Animal
        Animal animalRana = new Rana("Rana Verde", 2, false, true);

        // Verificar que el método hacerSonido() de Rana se llama correctamente
        animalRana.hacerSonido(); // Debería imprimir "La rana croa"

        // Verificar que el método mostrarInfo() de Rana se llama correctamente
        animalRana.mostrarInfo();
        // Debería imprimir:
        // Nombre: Rana Verde, Edad: 2
        // Tiene cola: No
        // Es venenosa: Sí

        // Verificar que los métodos de la clase base se llaman correctamente usando super
        Rana rana = (Rana) animalRana;
        assertEquals("Rana Verde", rana.getNombre());
        assertEquals(2, rana.getEdad());
        assertFalse(rana.isCola());
        assertTrue(rana.getEsVenenoza());
    }
    

}