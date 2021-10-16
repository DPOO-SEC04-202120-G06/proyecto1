package modelo;

import java.util.Date;

public class lote {
	private Date fecha;
	private double precioProveedor;
	private double precioVenta;
	private int cantidad;
	private int id;
	private boolean congelado;
	private boolean refrigerado;
	public lote(Date thefecha, double precioproveedor, double precioventa,int thecantidad, int theid, boolean thecongelado, boolean therefrigerado)
	{
		this.fecha= thefecha;
		this.precioProveedor = precioproveedor;
		this.precioVenta = precioventa;
		this.cantidad = thecantidad;
		this.id = theid;
		this.congelado = thecongelado;
		this.refrigerado = therefrigerado;
	}
}
