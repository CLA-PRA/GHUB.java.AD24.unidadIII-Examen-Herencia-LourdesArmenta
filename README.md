# Proyecto - Herencia

## Objetivo

El objetivo de este proyecto es demostrar el uso de la herencia en la programación orientada a objetos mediante la creación de un conjunto de clases que representan diferentes tipos de animales. A través de este ejercicio, se busca:

1. **Comprender y aplicar el concepto de herencia**: Crear una jerarquía de clases donde las clases derivadas heredan atributos y métodos de sus clases base.
2. **Promover la reutilización de código**: Utilizar la herencia para evitar la duplicación de código y facilitar la extensión de funcionalidades.
3. **Implementar y verificar el comportamiento específico de cada clase**: Definir métodos y atributos específicos para cada tipo de animal y verificar su correcto funcionamiento mediante pruebas unitarias.
4. **Visualizar las relaciones entre clases**: Utilizar diagramas de clases para representar gráficamente la estructura y las relaciones de herencia entre las clases.


## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Herencia en Animales
---
classDiagram
    class Animal {
        -String nombre
        -int edad
        +Animal(String nombre, int edad)
        +String getNombre()
        +void setNombre(String nombre)
        +int getEdad()
        +void setEdad(int edad)
        +void hacerSonido()
        +void mostrarInfo()
    }

    class Anfibio {
        -boolean cola
        +Anfibio()
        +Anfibio(String nombre, int edad, boolean cola)
        +boolean tieneCola()
        +void setCola(boolean cola)
        +void hacerSonido()
        +void mostrarInfo()
    }

    class Mamifero {
        -int numeroPatas
        +Mamifero()
        +Mamifero(String nombre, int edad, int numeroPatas)
        +int getNumeroPatas()
        +void setNumeroPatas(int numeroPatas)
        +void hacerSonido()
        +void mostrarInfo()
    }

    class Rana {
        -boolean esVenenoza
        +Rana()
        +Rana(String nombre, int edad, boolean cola, boolean esVenenoza)
        +boolean esVenenoza()
        +void setVenenoza(boolean esVenenoza)
        +void hacerSonido()
        +void mostrarInfo()
    }

    Animal <|-- Anfibio
    Animal <|-- Mamifero
    Anfibio <|-- Rana

```

```mermaid
---
title: Herencia en Figuras
---
classDiagram
    class Figura {
        -String color
        +Figura(String color)
        +double calcularArea()
        +void mostrarInfo()
    }

    class Circulo {
        -double radio
        +Circulo(String color, double radio)
        +double calcularArea()
        +void mostrarInfo()
    }

    class Rectangulo {
        -double ancho
        -double alto
        +Rectangulo(String color, double ancho, double alto)
        +double calcularArea()
        +void mostrarInfo()
    }

    Figura <|-- Circulo
    Figura <|-- Rectangulo

```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
