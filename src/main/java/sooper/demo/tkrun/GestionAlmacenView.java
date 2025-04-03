package sooper.demo.tkrun;	//27 HE CREADO 1º UNA NUEVA CLASE PARA QUE SE INICIALICE CON EL BOTON ENVIAR ALMACEN

import javax.swing.JFrame;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class GestionAlmacenView {
	
	protected JFrame frmGestionAlmacen;
	private JTable table;
	
	
	
	public GestionAlmacenView() {	//27 Inicializo Almacén
		//lo inicializo con this initView();
		
		this.initView();
	}
		// /**
		// * @wbp-parser.entryPoint
		// */
		// modifico private void initialize() {
	private void initView() {
	
		
		JFrame frame = new JFrame();  //Esto crea la ventana
		frame.setBounds(0, 0, 400, 500); // Esto da el tamaño de la ventana
		JFrame frmAlmacen = frame;
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Articulos a Embolsar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel, "cell 0 0");
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 1,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"idArticulo", "idContador"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Añadir Articulo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(btnNewButton, "cell 0 2");
		frmAlmacen.setVisible(true);
	}
	public JFrame getFrame() {
		return this.getFrame();
	}
}
//nueva