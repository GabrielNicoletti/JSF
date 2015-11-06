package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.dao.VacinaDao;
import aulajavaweb.model.Vacina;

public class VacinaBean  implements Bean<Vacina>{
	private Vacina vacina;
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	@Override
	public void insert(Vacina t) {
		VacinaDao.singleton().insert(t);		
	}

	@Override
	public void delete(Vacina t) {
		VacinaDao.singleton().delete(t);		
	}

	@Override
	public Vacina list(Integer id) {		
		return VacinaDao.singleton().list(id);		
	}

	@Override
	public List<Vacina> listAll() {
		return VacinaDao.singleton().listAll();
	}

	@Override
	public void update(Vacina t) {
		VacinaDao.singleton().update(t);		
	}

}
