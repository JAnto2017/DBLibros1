import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class GetDatas {
	String query;
	
	/**
	 * Constructor
	 */
	public GetDatas() {
		// TODO Auto-generated constructor stub
	}
	
	/********************************************************************************************************/
	public void LeerDatos(Connection _conx, Statement _st, String _tabla) {
		
		try {
			query = "SELECT * FROM " + _tabla;
			_st = _conx.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = _st.executeQuery(query);
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}
