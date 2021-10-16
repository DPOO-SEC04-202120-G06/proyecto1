package modelo;

import java.util.Date;

public class producto {
	private int codigoBarras;
	private int lote;
	private boolean congelado;
	private boolean refrigerado;
	private String nombre;
	private double precio;
	private float peso;
	public producto(int elcodigoBarras, int thelote, boolean thecongelado, boolean therefrigerado,String elnombre, double elprecio, float elpeso)
	{
		this.codigoBarras= elcodigoBarras;
		this.lote = thelote;
		this.congelado = thecongelado;
		this.refrigerado = therefrigerado;
		this.nombre = elnombre;
		this.precio = elprecio;
		this.peso = elpeso;
	}
	public double getPrecioPublico()
	{
		return precio;
	}
	public int getCodigoBarras()
	{
		return codigoBarras;
	}

}
