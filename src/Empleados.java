
public class Empleados {

	private int numEmpleado;
	private String nombre;
	private float sueldo;
	private boolean estatus;

	public Empleados(int numEmpleado, String nombre, float sueldo, boolean estatus) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Empleados [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo + ", estatus="
				+ estatus + "]\n";
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
