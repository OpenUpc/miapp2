package pe.edu.upc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
       protected static Connection oCn;
       //Appweb
       static {
	         try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       }
       
       public static Connection AbrirConexion() {
    	   if(oCn != null) {
    		   return oCn;
    	   }
    	   String usuario="root";
    	   String password = "root";
    	   try {
    	         oCn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appweb?useSSL=false&serverTimezone=UTC",
    			 usuario,  password);
    	         System.out.println("Conexion OK");
    	   }
    	   catch (Exception e) {
    		   System.out.println(e.getMessage());
    		   System.out.println("Error al conectar");
    	   }
    	   return oCn;
       }
       
       public static void CerrarConexion() {
    	 try {    	   
    	   if(oCn!=null) {
    	    oCn.close();
    	    oCn =null; //adicionar
    	   }
    	 }catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }    	   
       }
       
}	 		
