package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.model.Tutor;
import aulajavaweb.persistence.dao.TutorDao;

public class TutorBean implements Bean<Tutor>{
	private Tutor tutor = new Tutor();
	
	@Override
	public void inserir(Tutor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Tutor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tutor buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tutor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Tutor t) {
		// TODO Auto-generated method stub
		
	}

}
