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
	//private Connection conexion;
	/********************************************************************************************************/
	/**
	 * constructor
	 */
	public MySQLConnection() {
		//this.setConexion(null);
	}
	
	/********************************************************************************************************/
	public void ConexionMySQL(Connection conexion,String _user,String _pass,String _dbName) throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+_dbName,_user,_pass);
			//Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdlibros1", "root", "joseantonio-123");
			JOptionPane.showMessageDialog(null, "conexion exitosa");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}				
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
