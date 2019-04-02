import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.DropMode;

public class PrincipalBDLibros {

	private JFrame frmBaseDeDatos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtRoot;
	//private JTextField txtJoseantonio;
	private JTextField txtBdlibros;
	
	//---------------------------------------------- Acceso a otras clases
	MySQLConnection conexionBD;
	CloseConnection cerrarConexBD;
	InsertDatas inserDatosBD;
	GetDatas obtenerDatosBD;
	//----------------------------------------------
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalBDLibros window = new PrincipalBDLibros();
					window.frmBaseDeDatos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalBDLibros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBaseDeDatos = new JFrame();
		frmBaseDeDatos.setBackground(new Color(255, 228, 196));
		frmBaseDeDatos.setTitle("BASE DE DATOS LIBROS");
		frmBaseDeDatos.setBounds(100, 100, 590, 552);
		frmBaseDeDatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBaseDeDatos.getContentPane().setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			//------------------------------------------------------------btn. SALIR
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 554, 453);
		frmBaseDeDatos.getContentPane().add(tabbedPane);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(new Color(216, 191, 216));
		tabbedPane.addTab("Leer Base Datos", null, panel_0, null);		//pestaña 0 
		panel_0.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00CDTULO:");
		lblTtulo.setBackground(new Color(0, 0, 205));
		lblTtulo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTtulo.setBounds(10, 11, 58, 14);
		panel_0.add(lblTtulo);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setBounds(10, 26, 529, 20);
		panel_0.add(textField);
		textField.setColumns(10);
		
		JLabel lblEditorial = new JLabel("EDITORIAL:");
		lblEditorial.setBackground(new Color(0, 0, 205));
		lblEditorial.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEditorial.setBounds(10, 67, 88, 14);
		panel_0.add(lblEditorial);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 240));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setBounds(10, 81, 201, 20);
		panel_0.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAutor = new JLabel("AUTOR:");
		lblAutor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAutor.setBounds(228, 67, 88, 14);
		panel_0.add(lblAutor);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 240));
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setBounds(221, 81, 201, 20);
		panel_0.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCdigoDeBarras = new JLabel("C\u00D3DIGO DE BARRAS:");
		lblCdigoDeBarras.setBackground(new Color(0, 0, 205));
		lblCdigoDeBarras.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCdigoDeBarras.setBounds(10, 112, 142, 14);
		panel_0.add(lblCdigoDeBarras);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 240));
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setBounds(10, 128, 201, 20);
		panel_0.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTemtica = new JLabel("TEM\u00C1TICA:");
		lblTemtica.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTemtica.setBounds(221, 112, 88, 14);
		panel_0.add(lblTemtica);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 240));
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setBounds(221, 128, 142, 20);
		panel_0.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCalidad = new JLabel("CALIDAD:");
		lblCalidad.setBackground(new Color(0, 0, 205));
		lblCalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCalidad.setBounds(377, 112, 79, 14);
		panel_0.add(lblCalidad);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 240));
		textField_5.setBounds(377, 128, 162, 20);
		panel_0.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblComentarios = new JLabel("COMENTARIOS:");
		lblComentarios.setBackground(new Color(0, 0, 205));
		lblComentarios.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblComentarios.setBounds(10, 159, 108, 14);
		panel_0.add(lblComentarios);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 240));
		textArea.setBounds(10, 180, 529, 143);
		panel_0.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBounds(10, 349, 529, 65);
		panel_0.add(panel);
		panel.setLayout(null);
		
		JButton btnBuscarPor = new JButton("BUSCAR POR ...");
		btnBuscarPor.setBackground(new Color(250, 235, 215));
		btnBuscarPor.setBounds(28, 11, 134, 43);
		panel.add(btnBuscarPor);
		
		JLabel lblCdigoDeBarras_1 = new JLabel("C\u00D3DIGO DE BARRAS");
		lblCdigoDeBarras_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigoDeBarras_1.setBackground(new Color(25, 25, 112));
		lblCdigoDeBarras_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCdigoDeBarras_1.setBounds(225, 11, 237, 14);
		panel.add(lblCdigoDeBarras_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(225, 34, 237, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNPginas = new JLabel("N\u00BA P\u00C1GINAS:");
		lblNPginas.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNPginas.setBounds(437, 67, 102, 14);
		panel_0.add(lblNPginas);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(255, 255, 240));
		textField_7.setBounds(432, 81, 107, 20);
		panel_0.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		tabbedPane.addTab("Escribir Base Datos", null, panel_1, null);		//pestaña 1
		panel_1.setLayout(null);
		
		JLabel lblTtulo_1 = new JLabel("T\u00CDTULO:");
		lblTtulo_1.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblTtulo_1.setBounds(10, 11, 70, 14);
		panel_1.add(lblTtulo_1);
		
		JLabel lblAutor_1 = new JLabel("EDITORIAL:");
		lblAutor_1.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblAutor_1.setBounds(10, 61, 104, 14);
		panel_1.add(lblAutor_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 30, 529, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 86, 197, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("AUTOR:");
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblNewLabel.setBounds(222, 61, 84, 14);
		panel_1.add(lblNewLabel);
		
		textField_10 = new JTextField();
		textField_10.setBounds(217, 86, 145, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNPginas_1 = new JLabel("N\u00BA P\u00C1GINAS:");
		lblNPginas_1.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblNPginas_1.setBounds(376, 61, 104, 14);
		panel_1.add(lblNPginas_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(372, 86, 167, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCdigoDeBarras_2 = new JLabel("C\u00D3DIGO DE BARRAS:");
		lblCdigoDeBarras_2.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblCdigoDeBarras_2.setBounds(10, 117, 172, 14);
		panel_1.add(lblCdigoDeBarras_2);
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 142, 197, 20);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblTemtica_1 = new JLabel("TEM\u00C1TICA:");
		lblTemtica_1.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblTemtica_1.setBounds(222, 117, 128, 14);
		panel_1.add(lblTemtica_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(217, 142, 145, 20);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblCalidad_1 = new JLabel("CALIDAD:");
		lblCalidad_1.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblCalidad_1.setBounds(376, 117, 121, 14);
		panel_1.add(lblCalidad_1);
		
		textField_14 = new JTextField();
		textField_14.setBounds(376, 142, 163, 20);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblComentario = new JLabel("COMENTARIO:");
		lblComentario.setFont(new Font("Segoe Script", Font.BOLD, 12));
		lblComentario.setBounds(10, 173, 145, 14);
		panel_1.add(lblComentario);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setDropMode(DropMode.INSERT);
		textArea_1.setBounds(10, 201, 529, 160);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(10, 372, 529, 42);
		panel_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("INSERTAR EN BASE DE DATOS");
		btnNewButton.setBackground(new Color(210, 105, 30));
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(152, 251, 152));
		tabbedPane.addTab("Conectar en Base de Datos", null, panel_3, null);
		panel_3.setLayout(null);
		
		//------------------------------------------------------------------------- BTN. CONECTAR CON BD
		//precisa de: user, password, dbname
		JButton btnConectarConBd = new JButton("CONECTAR CON B.D.");
		btnConectarConBd.setForeground(new Color(0, 0, 255));
		btnConectarConBd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConectarConBd.setBackground(new Color(178, 34, 34));
		btnConectarConBd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConectarConBd.setBounds(121, 365, 290, 34);
		panel_3.add(btnConectarConBd);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO DE B.D.");
		lblNewLabel_1.setBounds(81, 91, 164, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD DE B.D.");
		lblNewLabel_2.setBounds(81, 127, 128, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNombreDeBd = new JLabel("NOMBRE DE B.D.");
		lblNombreDeBd.setBounds(81, 171, 128, 14);
		panel_3.add(lblNombreDeBd);
		
		txtRoot = new JTextField();
		txtRoot.setDropMode(DropMode.INSERT);
		txtRoot.setText("root");
		txtRoot.setBounds(247, 88, 143, 20);
		panel_3.add(txtRoot);
		txtRoot.setColumns(10);
		
		//JPasswordField password = new JPasswordField();
		//txtJoseantonio = new JTextField();
		JPasswordField txtJoseantonio = new JPasswordField();
		txtJoseantonio.setDropMode(DropMode.INSERT);
		txtJoseantonio.setText("joseantonio-123");
		txtJoseantonio.setBounds(247, 124, 143, 20);
		panel_3.add(txtJoseantonio);
		txtJoseantonio.setColumns(10);
		
		txtBdlibros = new JTextField();
		txtBdlibros.setText("bdlibros1");
		txtBdlibros.setBounds(247, 168, 143, 20);
		panel_3.add(txtBdlibros);
		txtBdlibros.setColumns(10);
		btnSalir.setBackground(new Color(205, 92, 92));
		btnSalir.setBounds(10, 475, 554, 23);
		frmBaseDeDatos.getContentPane().add(btnSalir);
	}
}
