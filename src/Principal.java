import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear una coleccion de objetos
		/* Indice 0 */Empleados empleado = new Empleados(1, "David", 18000, true);
		/* Indice 1 */Empleados empleado2 = new Empleados(2, "Ricardo", 19000, true);
		/* Indice 2 */Empleados empleado3 = new Empleados(3, "Hector", 17000, false);

		// Declarar la lista para realizar el --- CRUD
		System.out.println("Hola mundo");
		System.out.println("Que tengas un buen dia "+10);

		// Que es una libreria: Es un conjunto de clases desarrollados por alguien mas
		// para que nuestras aplicaciones funcionen correctamente

		List<Empleados> lista = new ArrayList<Empleados>();

		// Agregar elementos a la lista .add
		lista.add(empleado);
		lista.add(empleado2);
		lista.add(empleado3);

		// Mostrar los elementos de la lista
		System.out.println(lista);

		// Buscar elemntos en la lista .get(indice)
		Empleados empleadoEncon = null; // Reserva de espacio en memoria

		empleadoEncon = lista.get(2);
		System.out.println("Se encontro el registro " + empleadoEncon);

		// Para editar primero hay que buscar
		empleadoEncon = lista.get(1);
		System.out.println("Se encontro el empleado " + empleadoEncon.getNombre() + " para editar");

		// Actualizar
		empleadoEncon.setNombre("Lorenzo");
		empleadoEncon.setEstatus(false);

		// Mostrar
		System.out.println(lista);

		// Eliminar elementos de la lista .remove
		lista.remove(0);

		// Mostrar
		System.out.println(lista);

	}

}
