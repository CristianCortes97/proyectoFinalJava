package Ejecutando;

import java.util.ArrayList;
import java.util.List;

import Universidad.Carrera;
import Universidad.Estudiante;



public class EjecutandoSistema {
	
public static void main(String[] args) {
	
	Estudiante estudiante = new Estudiante("Cristian", 24 , null);
	Estudiante estudiante1 = new Estudiante("Felipe", 30 , null);
	Estudiante estudiante2 = new Estudiante("Cesar", 35 , null);
	
	Carrera carrera = new Carrera (0,"Ingenieria");
	Carrera carrera1 = new Carrera (1, "LenguasModernas");
	Carrera carrera2 = new Carrera (2, "Artes");
	
	
	List<String> asignaturas = new ArrayList<String>();

	asignaturas.add("calculo lineal");
	asignaturas.add("Calculo diferencial");
	asignaturas.add("matematicas pura");
	
	//carrera.setAsignaturas(asignaturas1);

	System.out.println("Estudiante = " + estudiante.datosEstudiante() );
	carrera.setAsignaturas(asignaturas);
	System.out.println( carrera);
	
	
	List<String> asignaturas1 = new ArrayList<String>();	
	asignaturas1.add("Ingles Basico");
	asignaturas1.add("Mandarine");
	asignaturas1.add("Frances");
	asignaturas1.add("Portuges");
	System.out.println("Estudiante1 = " + estudiante1.datosEstudiante() );
	carrera1.setAsignaturas(asignaturas1);
	System.out.println( carrera1);
	
	

	List<String> asignaturas2 = new ArrayList<String>();	
	asignaturas2.add("Ingles Basico");
	asignaturas2.add("Mandarine");
	asignaturas2.add("Frances");
	asignaturas2.add("Portuges");
	System.out.println("Estudiante2 = " + estudiante2.datosEstudiante() );
	carrera2.setAsignaturas(asignaturas2);
	System.out.println( carrera2);
	
	
	
	}
	
}	
	

	
	
	
	

		
		
	

