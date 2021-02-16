package mx.edu.j2se.DeLaMora.tasks;

public class Main {
	public static void main(String[] args) {

		Persona estudianteNC = new Persona();

		estudianteNC.setNombre("Eduardo");
		estudianteNC.setEdad(18);

		String loDejaron = estudianteNC.loDejanEntrarAlBar();
		System.out.println(estudianteNC.getNombre() + loDejaron);


		Persona estudianteNC2 = new Persona();
		estudianteNC2.setNombre("Fabiola");
		estudianteNC2.setEdad(22);

		
	}
}

