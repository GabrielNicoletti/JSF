package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Vacina;

public class VacinaDao implements Dao<Vacina>{
	
	private static VacinaDao dao;
	public static VacinaDao singleton(){
		return dao == null ? new VacinaDao() : dao;
	}
	
	List<Vacina> vacinas = new ArrayList<Vacina>();
	@Override
	public void inserir(Vacina t) {
		vacinas.add(t);
		
	}

	@Override
	public void excluir(Vacina t) {
		vacinas.remove(t);
		
	}

	@Override
	public Vacina buscar(Integer id) {		
		return vacinas.get(id);
	}

	@Override
	public List<Vacina> buscarTodos() {		
		return vacinas;
	}

	@Override
	public void atualizar(Vacina t) {
		vacinas.remove(t);
		vacinas.add(t);
		
	}

}
