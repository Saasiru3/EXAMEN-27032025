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

public class NuevaVentanaView {
	
	protected JFrame frmNuevaVenta;
	
	
	
	public NuevaVentanaView() {	//27 Inicializo NuevaVentana
		
		initialize();
	}
	
	private void initialize() {
		
		JFrame frame = new JFrame();
		JFrame frmNuevaVentana = frame;
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Articulos a Embolsar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(7, 7, 145, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Añadir Artículo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaVentanaView NuevaVentana = new NuevaVentanaView();//27
				

			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.setBounds(7, 431, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(184, 32, 190, 28);
		frame.getContentPane().add(scrollPane_3);
		
		JLabel lblNewLabel_1 = new JLabel("  idContenedor");
		scrollPane_3.setRowHeaderView(lblNewLabel_1);
		
		JScrollPane scrollPane_3_1 = new JScrollPane();
		scrollPane_3_1.setBounds(7, 32, 181, 28);
		frame.getContentPane().add(scrollPane_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("  idArticulo");
		scrollPane_3_1.setViewportView(lblNewLabel_2);
		frmNuevaVentana.setVisible(true);
	}
}
