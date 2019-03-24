import java.sql.*;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class InsertDatas {
	private String Query;
	//private Statement st;
	
	/**
	 * Constructor
	 */
	public InsertDatas() {
		this.Query = "";
	}
	
	/********************************************************************************************************/
	public void InsertarDatos(Connection _conx, Statement st,String _tabla,String _tit,String _edit,String _autor,
			int _numPag,int _codBarra,String _tematic,String _calidad,String _coment) throws SQLException {
		try {
			Query = "INSERT INTO " + _tabla + "VALUES("
					+"\""	+	_tit		+	"\","
					+"\""	+	_edit		+	"\","
					+"\""	+	_autor		+	"\","
					+"\""	+	_numPag		+	"\","
					+"\""	+	_codBarra	+	"\","
					+"\""	+	_tematic	+	"\","
					+"\""	+	_calidad	+	"\","
					+"\""	+	_coment		+	"\")";
			
			st = _conx.createStatement();
			st.executeUpdate(Query);
			JOptionPane.showMessageDialog(null, "Datos almacenados ok");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
