package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	
	private Pedido pedidoEnCurso;

	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	
	private ArrayList<Combo> combos = new ArrayList<>();
	
	private ArrayList<ProductoMenu> menu = new ArrayList<>();
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		
		Pedido elPedido = new Pedido(nombreCliente, direccionCliente);
		pedidoEnCurso = elPedido;
		pedidos.add(elPedido);
		
	}
	
	public void cerrarYGuardarPedido() {
		
		
	}
	
	public Pedido getPedidoEnCurso() {
		
		return pedidoEnCurso;
	}
	
	public ArrayList<ProductoMenu> getMenuBase(){
		
		return menu;
		
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
		
		return ingredientes;
	}
	
	public void cargarInformacionRestaurante() {
		
		
		
	}
	
	
	private void cargarIngredientes(File archivoIngredientes) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("./data/ingredientes.txt"));
		String linea = br.readLine();
		while(linea != null)
		{
			
			String[] partes = linea.split(";");
			String ingrediente = partes[0];
			int precioIngrediente = Integer.parseInt(partes[1]);
			Ingrediente elIngrediente = new Ingrediente(ingrediente, precioIngrediente);
			ingredientes.add(elIngrediente);
			linea = br.readLine();
			
		}
		
		br.close();
				
	}
	
	
	
	
	
}
