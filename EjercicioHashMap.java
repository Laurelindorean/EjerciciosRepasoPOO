package POO1;

import java.util.ArrayList;
import java.util.HashMap;

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

	}

}
