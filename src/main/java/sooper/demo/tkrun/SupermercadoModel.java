package sooper.demo.tkrun;

import java.util.List;

import sooper.demo.util.Database;

public class SupermercadoModel {

	Database db = new Database();

	public List<Object[]> AniadirArticulosPedido(int i) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		
		String sql = "SELECT * FROM ARTICULOPEDIDO WHERE IDPEDIDO = ?";
		lista = db.executeQueryArray(sql, i);
		return lista;		
		
	}
	
}
