
package conexionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBaseDatos {
    private String url = "jdbc:mysql://localhost:3306/sistema_persona";
    private String userName = "root";
    private String password = "";
    
    private Connection con;
    
    public ConexionBaseDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("conexion exitosa");
        }catch(Exception e) {
            System.err.println("No se puedo establecer conexion con la Base de Datos. ERROR: "+e);
        }
    }
    public Connection getConnection() {
        return con;
    }
    
}
