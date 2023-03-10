package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setEdad(21);
		cliente.setNombre("Mauricio");
		cliente.setTelefono("1122336699");
		cliente.setCredito(1500);
		
		System.out.println("Edad: " + cliente.getEdad());
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Telefono: " + cliente.getTelefono());
		System.out.println("Credito: " + cliente.getCredito());
		
		
		Trabajador trabajador = new Trabajador();
		trabajador.setEdad(28);
		trabajador.setNombre("Luciano");
		trabajador.setTelefono("1177553344");
		trabajador.setSalario(250000);
		
		System.out.println("Edad: " + trabajador.getEdad());
		System.out.println("Nombre: " + trabajador.getNombre());
		System.out.println("Telefono: " + trabajador.getTelefono());
		System.out.println("Salario: " + trabajador.getSalario());
	}
}

class Persona {
	
	int edad;
	String nombre;
	String telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}

class Cliente extends Persona{
	
	float credito;

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	
}

class Trabajador extends Persona{
	
	double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
