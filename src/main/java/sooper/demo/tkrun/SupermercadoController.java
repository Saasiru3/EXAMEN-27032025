package sooper.demo.tkrun;

import java.util.List;



public class SupermercadoController {

	private SupermercadoModel model;
	private SupermercadoView view;
	
		//Diseño MVC(Modelo-Vista-Controlador) actua como controlador
	public void setVistaModel( SupermercadoView v , SupermercadoModel m) {
		this.model = m;
		this.view = v;
		//no hay inicializacion especifica del modelo, solo de la vista
		this.view.getFrame().setVisible(true);
	}
	
	//a partir de aqui, implementamos los metodos de las funcionalidades correspondientes
	// llamada al modelo
	public void AniadirArticulosPedido(int i) {
		//metodo para rellenar la tabla de articulos y pedidos
		int j;
		List<Object[]> lista=model.AniadirArticulosPedido(i);
		// una vez que me devuelva el modelo el resultado de la consulta, analizo la lista devuelta;
		
		for (j=0; i<lista.size();j++) {
			view.rellenaListaArticulos(lista.get(j));// añade una columna a la tabla de articulos de la vista(este metodo tambien lo implementamos nosotros en la vista)
		}
		
	};
	

	public SupermercadoView getView() {
		return view;
	}

	public void setView(SupermercadoView view) {
		this.view = view;
	}

	public SupermercadoModel getModel() {
		return model;
	}

	public void setModel(SupermercadoModel model) {
		this.model = model;
	}

}

