package aulajavaweb.dao;

import java.util.List;

import aulajavaweb.model.AnimalVacina;

public class AnimalVacinaDao implements Dao<AnimalVacina> {
	
	private static AnimalVacinaDao dao;
	
	private AnimalVacinaDao() {
		
	}

	public static  AnimalVacinaDao singleton() {
//		if (dao == null) {
//			return new AnimalVacinaDao();
//		}else{
//			return dao;			
//		}
		
// é a mesma coisa que o if acima
		return dao == null ? new AnimalVacinaDao() : dao;
	}
	
	@Override
	public void inserir(AnimalVacina t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(AnimalVacina t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AnimalVacina buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnimalVacina> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(AnimalVacina t) {
		// TODO Auto-generated method stub
		
	}
	

}
