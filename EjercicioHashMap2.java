package POO1;

import java.util.ArrayList;
import java.util.HashMap;

public class EjercicioHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<Alumno>> curso = new HashMap<>();

		ArrayList<Alumno> curso1 = new ArrayList<>();
		Alumno alumno1 = new Alumno("Juan", "Palomo", "12");
		Alumno alumno2 = new Alumno("Maria", "LaPiedra", "11");
		Alumno alumno3 = new Alumno("Francisco", "Chavez", "13");
		Alumno alumno4 = new Alumno("Emma", "Sastre", "10");

		ArrayList<Alumno> curso2 = new ArrayList<>();
		Alumno alumno5 = new Alumno("Palmi", "Romia", "14");
		Alumno alumno6 = new Alumno("Miguel", "Sastre", "15");
		Alumno alumno7 = new Alumno("Ripley", "Sastre", "14");
		Alumno alumno8 = new Alumno("Nela", "Romia", "16");

		ArrayList<Alumno> curso3 = new ArrayList<>();
		Alumno alumno9 = new Alumno("Carlos", "Romia", "9");
		Alumno alumno10 = new Alumno("Eli", "Losada", "8");
		Alumno alumno11 = new Alumno("Encarna", "Segura", "5");
		Alumno alumno12 = new Alumno();
		alumno12.setNombre("Ariadna");
		alumno12.setApellido("Bosch");
		alumno12.setEdad("7");

		curso1.add(alumno1);
		curso1.add(alumno2);
		curso1.add(alumno3);
		curso1.add(alumno4);
		curso2.add(alumno5);
		curso2.add(alumno6);
		curso2.add(alumno7);
		curso2.add(alumno8);
		curso3.add(alumno9);
		curso3.add(alumno10);
		curso3.add(alumno11);
		curso3.add(alumno12);
		
		curso.put("Curso 1", curso1);
		curso.put("Curso 2", curso2);
		curso.put("Curso 3", curso3);

	}
	public static boolean existeAlumno(HashMap<String, ArrayList<Alumno>> curso, String nombre) {
		
		
		return true;
	}

}
