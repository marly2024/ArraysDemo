package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Manejo de los argumentos que recbe el metodo main, es decir, la APP cuando se ejecuta
    	 * porque la APP cuando se ejecuta recibe como parametro un array un argumento de tipo
    	 * ( String[] args ).
    	 * Done se especifica los argumentos que recibe la APP en el IDE eclipse?
    	 * RTA: En la configuracion de las opciones de ejecucion*/
    	
    	//Primero hay que comprobar si la APP esta recibiendo los
    	// argumentos esperados
    	if(args.length == 0) { 
    		System.out.println("No se han recibido los argumentos esperados");	
    	} else if (args.length != 3) { 
    		System.out.println("No se han recibido tres argumentos");
    
    	}else { 
    		//Mostrar o manejar los argumentos recibidos.
    		System.out.println("Se han recibido los guientes argumentos");
    		for(String argumento : args)
    			System.out.println(argumento);
    	}
    	
       // VARANTE 2
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
    	
    	// Primero Con una sentencia for de toda la vida, o clasica
    	
    	
    	/*Ejercicio # 1. solamente mostrar los nombres del array de nombres que tienen
    	 * mas de 4 caracteres*/
    	for(int i = 0; i < nombres.length; i++ ) {
    		if (nombres[i].length() > 4) {
    		System.out.println(nombres[i]);	
    		} 
    		
    		
    	}
    	/*Que diferencia hay en utilizar el operador de autoincremento,o autodecremento,
    	 * antes o despues
    	 * 
    	 * para solucionar este problema,clasico de cuando uno empieza con un lenguaje
    	 * de programacion utilizamos JSHELL, que es como shell que es como un shell de python
    	 * que antes Java antes o despues
    	 * 
    	 * El operador de autoincremento o autodecremento si esta solo en una sentencia,
    	 * da igual que vaya antes o despues, es decir, i++; o ++i; SON EXACTAMENTE LO
    	 * MISMO, sin embargo, i + ++] no es lo mismo que i + j++*/
    	
    	 /*NOTA IMPORTANTE cuando se utiliza el for clasico?
    	  * cuando nos interesa el indice. por ejemplo, si queremos recorrer el array de numeros 
    	  * y solamente quiero mostrar los elementos que son de indice par*/
    	
    	for(int i = 0; i < numeros.length; i++) {
    	if (i % 2 == 0)
    		System.out.println("El elemento de indice" + i + ",es par");
    	
    		
    	// SEGUNDO: con un for mejorado, en ocasiones MAL llamado por each (po cada)
    	// digo mal llamado porque la sentencia forEach existe,como veran posteriormente
    }
  }
}