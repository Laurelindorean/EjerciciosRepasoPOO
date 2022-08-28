package POO1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EjercicioHashMap {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> cursos = new HashMap<>();

		ArrayList<String> curso1 = new ArrayList<>();
		curso1.add("Maria");
		curso1.add("Juan");
		curso1.add("Miguel");
		curso1.add("Anna");

		ArrayList<String> curso2 = new ArrayList<>();
		curso2.add("Jose Maria");
		curso2.add("Palmira");
		curso2.add("Nela");
		curso2.add("Joaquim");

		ArrayList<String> curso3 = new ArrayList<>();
		curso3.add("Santiago");
		curso3.add("Encarna");
		curso3.add("Ripley");
		curso3.add("Pilar");

		ArrayList<String> curso4 = new ArrayList<>();
		curso4.add("Emma");
		curso4.add("Eli");
		curso4.add("Isaac");
		curso4.add("Carlos");
		
		cursos.put(1, curso1);
		cursos.put(2, curso2);
		cursos.put(3, curso3);
		cursos.put(4, curso4);
		existeAlumno(cursos, "maricarmen");
		
		ordenado(cursos);
		

	}
	
	public static boolean existeAlumno(HashMap<Integer, ArrayList<String>> curso, String nombre) {	
		//List<String> listaAlumnos = curso.get(1);
		//LinkedList<String> linkedAlumnos = new LinkedList<>(listaAlumnos);		
		for (Integer numCurso : curso.keySet()) {
			Iterator<String> it = curso.get(numCurso).iterator();

			while (it.hasNext()) {
				String nombreAlumno = it.next();
				if (nombreAlumno.equalsIgnoreCase(nombre)) {
					System.out.println("El alumno " + nombre + " está dado de alta en un curso " + numCurso);
					return true;
				}
			}
		}

		System.out.println("El alumno no existe en ningún curso.");
		return false;
	}
	
	public static void ordenado (HashMap<Integer, ArrayList<String>> curso) {
		for (Integer numCurso : curso.keySet()) {
			ArrayList<String> listaNombre = curso.get(numCurso);
			listaNombre.sort(null);
			for(String nomCursos : curso.get(numCurso)) {
				System.out.println(nomCursos);
				
			}
		}
		
		
	}

}
