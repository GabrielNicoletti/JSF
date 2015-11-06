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
	public void insert(Vacina t) {
		vacinas.add(t);
		
	}

	@Override
	public void delete(Vacina t) {
		vacinas.remove(t);
		
	}

	@Override
	public Vacina list(Integer id) {		
		return vacinas.get(id);
	}

	@Override
	public List<Vacina> listAll() {		
		return vacinas;
	}

	@Override
	public void update(Vacina t) {
		vacinas.remove(t);
		vacinas.add(t);
		
	}

}
