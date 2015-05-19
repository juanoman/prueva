package bbdd;

import java.sql.*;
import datos.Alumno;

public class BBDDalumnos {
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;
	
public static void añadir( Alumno al, basedatos bd){
	String cadena="INSERT INTO contactos VALUES('" + al.getNombre() + "','" + al.getDni()+"',"+ al.getNota() +")"; 	
	
	try{
	c=bd.getConexion();
	s=c.createStatement();
	s.executeUpdate(cadena);
	s.close();
	}
	catch ( SQLException e){
		System.out.println(e.getMessage());
	}
}
}
