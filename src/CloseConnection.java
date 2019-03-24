import java.sql.*;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class CloseConnection {

	/**
	 * Constructor
	 */
	public CloseConnection() {
		// TODO Auto-generated constructor stub
	}
	/********************************************************************************************************/
	public void CerrarConexion(Connection _conx) throws SQLException {
		try {
			_conx.close();
			JOptionPane.showMessageDialog(null, "fin de conexión");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}				
	}

}
