package Modelo;

import java.util.ArrayList;

public class Pedido {
	
	private static int numerosPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	private ArrayList<Producto> itemsPedido;

	public Pedido(String nombreCliente, String direccionCliente) 
	{
		
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.idPedido = numerosPedidos ++;
		
	}
	
	public int getIdPedido() {
		
		return this.idPedido;
		
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
		ArrayList<Producto> itemPedido = this.itemsPedido;
		itemPedido.add(nuevoItem);
		
	}
	
	private int getPrecioNetoPedido() {
		
		int precioNeto = 0;
		for (Producto item : itemsPedido) {
			
			precioNeto += item.getPrecio();
			
		}
		
		return precioNeto; 
	}
	
	private int getPrecioTotalPedido() {
		
		int precioNeto = getPrecioNetoPedido();
		int iva = getPrecioIvaPedido();
		int precioTotal = iva + precioNeto;
		
		return precioTotal;
			
	}
	
	private int getPrecioIvaPedido() {
		
		int precioNeto = getPrecioNetoPedido();
		int iva = (int) (precioNeto * 0.19);
		return iva;
		
	}
	
	private String generarTextoFac() {
		
		return null;
		
	}
	
	

}
