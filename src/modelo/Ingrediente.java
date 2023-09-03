package modelo;

public class Ingrediente {
	
	//** Atributos
	
	private String nombre;
	private int costoAdicional;
	
	//** Constructores
	
	public Ingrediente(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional= costoAdicional;
		
	}
	
	// Métodos para consultar los atributos
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
	

}
