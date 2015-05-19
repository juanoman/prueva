package ejemploalumno;
import datos.Alumno;
import java.util.Scanner;
import bbdd.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte opc=0;
	while(opc!=5){
		basedatos miBase=new basedatos("alumnosnotas");
		System.out.println("elige una obcion:\n1-Nuevo alumno\n2-Baja alumno\n3-Modificar nota alumno\n4-Listado de aprobados\n5-Salir");
		opc=scan.nextByte();
		switch(opc){
			case 1:
			System.out.println("nombre:");
			String nombre=scan.next();
			System.out.println("dni");
			String dni=scan.next();
			System.out.println("nota");
			int nota=scan.nextInt();
			Alumno al=new Alumno(nombre,dni,nota);
			miBase.abrir();
			BBDDalumnos.añadir(al, miBase);
			miBase.cerrar();
		}
	}
	}

}
