package buscandoNombres;

public class Nombre {
	private String nombre;
	private int cant;
	
	public Nombre(String n)
	{
		this.nombre = n;
		this.cant=1;
	}

	public void comparar(String n)
	{
		if(this.nombre.compareTo(n)==0)
		this.cant++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void incrementar() {
		this.cant++;
		// TODO Auto-generated method stub
		
	}
	
	public void
}
