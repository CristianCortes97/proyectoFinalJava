package Universidad;



import java.util.List;

public class Carrera {

	private	int codigo;
	private	String nombre;
	private List<String> asignaturas;
	
	public Carrera (  int codigo, String nombre) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}

	
	
	
	
	
		
		

}


