package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        */
        Scanner reader = new Scanner(System.in);
        int numeroIf;
        System.out.println("Ingrese un número: ");
        numeroIf = reader.nextInt();
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        }else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es " + numeroIf);
        }
        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
                Incrementar el valor de la variable en uno cada vez que se ejecute.
                Mostrarlo por pantalla cada vez que se ejecute.
        */
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        */
        numeroWhile = 0;
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile == 0);
        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
        se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        */
        int numerofor = 0;
        for (int i = 0; i < 3; i++) {
            numerofor++;
            System.out.println(numerofor);
        }
        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
        */
        Scanner reader2 = new Scanner(System.in);
        String estacion;
        System.out.println("Ingrese estacin del año: ");
        estacion = reader2.next();

        switch(estacion.toLowerCase()) {
            case "primavera":
                System.out.println("La estacion es : " + estacion);
                break;
            case "verano":
                System.out.println("La estacion es : " + estacion);
                break;
            case "otoño":
                System.out.println("La estacion es : " + estacion);
                break;
            case "invierno":
                System.out.println("La estacion es : " + estacion);
                break;
            default:
                System.out.println(estacion + "No es una estacion del año");
        }
    }
}
