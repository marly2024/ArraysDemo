package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Como se declara un array?
    	
    	int[] numeros = {
    			1,2,3,4,5,6,7,8,9,10,11,12,13,14
    	};
    	
    	// Un array de nombre seria
    	String[] nombres = {
    	          "Tamara","Jessica","Carlos","Adrian","Maria Lopez","Maria Jose",
    	          "Rosa"};
    	// Para mostrar por consola los elementos del array de nombres
    	// VARIANTE # 1.Utilizando una funcion println, mostrar cada elemento del array
    	System.out.println(nombres[0]);
    	System.out.println(nombres[1]);
    	
    	// y, como podran apreciar, la variante # 1 NO SIRVE DE NADA.
    	
    	//VARIANTE # 2.Implica utilizar una sentencia de control de flujo. para recorrer
    	// el array 
    	// lo veremos en la rama "sentenciasDeControlDeFlujo"
    }
}
