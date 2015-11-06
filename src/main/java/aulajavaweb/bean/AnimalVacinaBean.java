package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.dao.AnimalVacinaDao;
import aulajavaweb.model.AnimalVacina;

public class AnimalVacinaBean implements Bean<AnimalVacina>{
	
	private AnimalVacina animalVacina = new AnimalVacina();
	private AnimalVacinaDao dao = AnimalVacinaDao.singleton();
	

	public AnimalVacinaBean(){
		
	}
	
	public AnimalVacina getAnimalVacina(){
		return animalVacina;
	}
	
	
	
	@Override
	public void inserir(AnimalVacina t) {
		dao.inserir(t);		
	}

	@Override
	public void excluir(AnimalVacina t) {
		dao.excluir(t);		
	}

	@Override
	public AnimalVacina buscar(Integer id) {
		return dao.buscar(id);
	}

	@Override
	public List<AnimalVacina> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void atualizar(AnimalVacina t) {
		dao.atualizar(t);		
	}

}
