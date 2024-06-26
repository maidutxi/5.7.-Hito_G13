package com.ejemplo;

/**
 * La clase FuncionesADocumentar contiene diversos métodos,
 * que incluyen operaciones como sumar, calcular el promedio de una lista y mostrarla ordenada.
 */
public class FuncionesADocumentar {
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }

    /**
     *Función que calcula la suma de todos los elementos en un array.
     * @param a El parámetro a es el array cuyos elementos se sumarán.
     * @return La suma total de los elementos del array.
     */
    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }

    /**
     * Método que devuelve el promedio de todos los números del array.
     * @param a El parámetro a define el array del que se quiere saber la media.
     * @return devuelve el promedio de los elementos del array.
     */
    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }

    /**
     * Función que obtiene el valor máximo del array.
     * @param a El parámetro a es el array del que se desea encontrar el valor máximo.
     * @return Devuelte el número más alto de todos los números del array.
     */
    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }

    /**
     * Devuelve el valor mínimo en un array de enteros.
     * @param a Un array de enteros.
     * @return El entero más pequeño del array.
     */
    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }

    /**
     * Muestra en la consola un array de enteros en orden inverso, comenzando desde el último elemento hasta el primero.
     * @param a  Un array de enteros.
     */
    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * Imprime en la consola los elementos de un array de enteros en orden ascendente.
     * @param a Un array de enteros.
     */
    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
