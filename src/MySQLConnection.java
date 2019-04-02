import java.sql.*;

import javax.swing.JOptionPane;
/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class MySQLConnection {
	private Connection _conexion;
	/********************************************************************************************************/
	/**
	 * constructor
	 */
	public MySQLConnection() {
		this._conexion = null;
	}
	
	/********************************************************************************************************/
	/*
	 * método que recibe parámetros de la base de datos
	 * y devuelve el objeto conexión a la BD del tipo Connection
	 */
	public Connection ConexionMySQL(String _user,String _pass,String _dbName) throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+_dbName,_user,_pass);
			
			//Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdlibros1", "root", "joseantonio-123");
			
			//JOptionPane.showMessageDialog(null, "conexion exitosa");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace(); _conexion = null;
		} catch (SQLException e) {			
			e.printStackTrace(); _conexion = null;
		}	
		return _conexion;
	}
	/********************************************************************************************************/
	/*public void CerrarConexion() {
		try {
			conexion.close();
			
		} catch (SQLException ex) {
			
		}
	}*/
	/********************************************************************************************************/
	/*public Connection getConexion() {
		return conexion;
	}*/
	/********************************************************************************************************/
	/*public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}*/

}
