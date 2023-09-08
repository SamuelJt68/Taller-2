package Consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import Modelo.Combo;
import Modelo.Ingrediente;
import Modelo.Producto;
import Modelo.Pedido;
import Modelo.Restaurante;
import Modelo.ProductoMenu;
import Modelo.ProductoAjustado; 

public class Aplicacion {
	
	private Restaurante menu;
	
	public void mostrarMenu()
	{
		
		System.out.println("-------------");
		System.out.println("\n" + "Iniciando pedido");
		System.out.println("1. Producto");
		System.out.println("2. Bebida");
		System.out.println("3. Combo");
		System.out.println("4. Terminar pedido");
				
	}
	
	public void ejecutarOpcion()
	{
		boolean working = true;
		while (working)
		{
			try
			{
				mostrarMenu();
				int opcionSeleccionada = Integer.parseInt(input("Por favor seleccione una opción: "));
				if (opcionSeleccionada == 1 && menu != null)
					
				
				{
					System.out.println("Saliendo de la aplicación ...");
					working = false;
				}
				
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
		
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarOpcion();
		
	}

}
